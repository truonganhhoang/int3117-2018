package tetris;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by asus on 11/9/2016.
 */
public class JBrainTetris extends JTetris {

    private JCheckBox brainMode;
    private boolean checkbox = false;
    private DefaultBrain defaultBrain;
    private Piece bestPiece;
    private int bestX;
    private boolean isCheckbox;
    private JPanel little;
    private JSlider adversary;
    private JLabel L_ok;

    /**
     * Creates a new JTetris where each tetris square
     * is drawn with the given number of pixels.
     */
    JBrainTetris(int pixels) {
        super(pixels);
    }

    public JComponent createControlPanel() {
        JPanel panel = (JPanel) super.createControlPanel();
        panel.add(new JLabel("Brain:"));
        brainMode = new JCheckBox("Brain active");
        panel.add(brainMode);
        // make a little panel, put a JSlider in it. JSlider responds to getValue()
        L_ok = new JLabel("ok");
        little = new JPanel();
        little.add(new JLabel("Adversary:"));
        adversary = new JSlider(0, 100, 0); // min, max, current
        adversary.setPreferredSize(new Dimension(100,15));
        little.add(adversary);

        panel.add(little);
        panel.add(L_ok);
        // now add little to panel of controls
        return  panel;

    }
    public Piece pickNextPiece(){

        double bestScore = 1e-20;
        int HardPiece = 0;
        int num = 1+random.nextInt(99);
        if(num > adversary.getValue()) {
            L_ok.setText("ok");
            return super.pickNextPiece();
        }
            L_ok.setText("*ok*");
            Brain.Move move;
            for(int i=0;i<pieces.length;i++){
                defaultBrain = new DefaultBrain();
                move = defaultBrain.bestMove(board,pieces[i],HEIGHT,null);
                if(move == null) return pieces[0];
                if(move.score>bestScore){
                    bestScore = move.score;
                    HardPiece = i;
                }
            }
            return pieces[HardPiece];
    }

    public void tick(int verb) {
        if(!brainMode.isSelected()){
            super.tick(verb);
            return;
        }

            if (verb == DOWN) {
                board.undo();
                defaultBrain = new DefaultBrain();
                Brain.Move move = defaultBrain.bestMove(board, currentPiece, HEIGHT, null);
                if (move == null) {
                    super.tick(DOWN);
                    return;
                }

                bestPiece = move.piece;
                bestX = move.x;

               /* if(currentPiece.equals(bestPiece) && (currentX==bestX)){
                    super.tick(DROP);
                    super.tick(DOWN);
                    return;
                }
                */
                    if (!currentPiece.equals(bestPiece)) super.tick(ROTATE);
                if (currentX != bestX) {
                    if (currentX < bestX) super.tick(RIGHT);
                        else super.tick(LEFT);
                }
                super.tick(DOWN);
            }
            else super.tick(verb);
           // checkbox = true;
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) { }

        JBrainTetris tetris = new JBrainTetris(16);
        JFrame frame = JTetris.createFrame(tetris);
        frame.setVisible(true);
    }
}

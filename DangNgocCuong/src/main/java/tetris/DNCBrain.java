package tetris;
public class DNCBrain implements Brain {

    public Brain.Move bestMove(Board board, Piece piece, int limitHeight, Brain.Move move) {

        if (move==null)move = new Brain.Move();

        double bestScore = 1e20;
        int bestX = 0;
        int bestY = 0;
        Piece bestPiece = null;
        Piece current = piece;

        board.commit();

        while (true) {
            final int yBound = limitHeight - current.getHeight()+1;
            final int xBound = board.getWidth() - current.getWidth()+1;

            // For current rotation, try all the possible columns
            for (int x = 0; x<xBound; x++) {
                int y = board.dropHeight(current, x);
                if (y<yBound) {    // piece does not stick up too far
                    int result = board.place(current, x, y);
                    if (result <= Board.PLACE_ROW_FILLED) {
                        if (result == Board.PLACE_ROW_FILLED) board.clearRows();

                        double score = rateBoard(board);

                        if (score<bestScore) {
                            bestScore = score;
                            bestX = x;
                            bestY = y;
                            bestPiece = current;
                        }
                    }

                    board.undo();    // back out that play, loop around for the next
                }
            }

            current = current.fastRotation();
            if (current == piece) break;    // break if back to original rotation
        }

        if (bestPiece == null) return(null);    // could not find a play at all!
        else {
            move.x = bestX;
            move.y = bestY;
            move.piece = bestPiece;
            move.score = bestScore;
            return(move);
        }
    }


    /*
     A simple brain function.
     Given a board, produce a number that rates
     that board position -- larger numbers for worse boards.
     This version just counts the height
     and the number of "holes" in the board.
    */
    public double rateBoard(Board board) {
        final int width = board.getWidth();
        int maxHeight = board.getMaxHeight();

        int sumHeight = 0;
        int holes = 0;

        // Count the holes, and sum up the heights
        for (int x=0; x<width; x++) {
            final int colHeight = board.getColumnHeight(x);
            sumHeight += colHeight;
            if(colHeight==maxHeight) maxHeight*=2;

            int y = colHeight - 2;    // addr of first possible hole

            while (y>=0) {
                if  (!board.getGrid(x,y)) {
                    holes++;
                }
                y--;
            }
        }

        double avgHeight = ((double)sumHeight)/width;
        maxHeight/=2;
        // Add up the counts to make an overall score
        // The weights, 8, 40, etc., are just made up numbers that appear to work
        return (20*maxHeight + 40*avgHeight + 10*holes);
    }

}


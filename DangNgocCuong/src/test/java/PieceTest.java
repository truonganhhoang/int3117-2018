import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.*;
import tetris.Piece;

/*
  Unit test for Piece class -- starter shell.
 */
public class PieceTest{
    Piece s1, s2, stick, l1, l2, square, pyramid;

    @Before
    public void setUp() throws Exception {
        s1 = new Piece("0 0	1 0	 1 1  2 1");
        s2 = new Piece("0 1	1 1  1 0  2 0");
        l1 = new Piece("0 0	0 1	 0 2  1 0");
        l2 = new Piece("0 0	1 0 1 1	 1 2");
        stick = new Piece("0 0	0 1	 0 2  0 3");
        square = new Piece("0 0  0 1  1 0  1 1");
        pyramid = new Piece("0 0  1 0  1 1  2 0");
    }

    @Test
    public void piecesOfDifferentOrderOfPointsShouldBeEqual() {
        assertEquals(stick, new Piece("0 3 0 0 0 1 0 2"));
        assertEquals(stick, new Piece("0 1 0 3 0 0 0 2"));
        assertEquals(stick, new Piece("0 2 0 3 0 0 0 1"));
        assertEquals(stick, new Piece("0 2 0 3 0 1 0 0"));
        assertEquals(stick, new Piece("0 1 0 2 0 3 0 0"));
        assertEquals(stick, new Piece("0 3 0 0 0 2 0 1"));
        assertEquals(stick, new Piece("0 0 0 1 0 3 0 2"));
    }

    @Test
    public void differentPiecesShouldNotBeEqual() {
        assertFalse(stick.equals(s1));
        Piece horizontalStick = new Piece("1 0 3 0 0 0 2 0");
        assertFalse(stick.equals(horizontalStick));
    }

    @Test
    public void testWidth() {
        assertEquals(1, stick.getWidth());
        assertEquals(3, s1.getWidth());
        assertEquals(2, l1.getWidth());
        assertEquals(4, (new Piece("1 0 3 0 0 0 2 0")).getWidth());
    }

    @Test
    public void testHeight() {
        assertEquals(4, stick.getHeight());
        assertEquals(2, s1.getHeight());
        assertEquals(3, l1.getHeight());
        assertEquals(1, (new Piece("1 0 3 0 0 0 2 0")).getHeight());
    }

    @Test
    public void testSkirt() {
        assertTrue(Arrays.equals(new int[]{0, 0, 0}, (new Piece("0 0  1 0  1 1  2 0")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {0}, (new Piece("0 0 0 1 0 2 0 3")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {0, 0, 0, 0}, (new Piece("1 0 3 0 0 0 2 0")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {0, 0, 1}, (new Piece("0 0 1 0 1 1  2 1")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {0, 1}, (new Piece("0 0 0 1 1 1 1 2")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {1, 0, 1}, (new Piece("0 1 1 0 1 1 2 1")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {1, 1, 0}, (new Piece("0 1 1 1 2 1  2 0")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {0, 0}, (new Piece("0 0 1 0 1 1  0 1")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {0, 2}, (new Piece("0 0 0 1 0 2 1  2")).getSkirt()));
        assertTrue(Arrays.equals(new int[] {2, 0}, (new Piece("1 0 1 1 1 2 0  2")).getSkirt()));
         }

    @Test
    public void testComputeNextRotation() {
        Piece horizontalStick = new Piece("0 0 1 0 2 0 3 0");
        assertEquals(horizontalStick, stick.computeNextRotation());

        assertEquals(stick, horizontalStick.computeNextRotation());

        Piece l1Rotation = new Piece("2 0 1 0 0 0 2 1");
        assertEquals(l1Rotation, l1.computeNextRotation());
    }

    @Test
    public void makeFastRotationCreatesCircularStructures() {
        Piece[] pieces = Piece.getPieces();
        Piece first = pieces[Piece.STICK];
        assertTrue(first == first.fastRotation().fastRotation());

        first = pieces[Piece.SQUARE];
        assertTrue(first == first.fastRotation());

        first = pieces[Piece.S1];
        assertTrue(first == first.fastRotation().fastRotation().fastRotation().fastRotation());

        first = pieces[Piece.S2];
        assertTrue(first == first.fastRotation().fastRotation().fastRotation().fastRotation());

        first = pieces[Piece.L1];
        assertTrue(first == first.fastRotation().fastRotation().fastRotation().fastRotation());

        first = pieces[Piece.L2];
        assertTrue(first == first.fastRotation().fastRotation().fastRotation().fastRotation());

        first = pieces[Piece.PYRAMID];
        assertTrue(first == first.fastRotation().fastRotation().fastRotation().fastRotation());
    }

    @Test
    public void testFastRotation() {
        Piece horizontalStick = new Piece("0 0 1 0 2 0 3 0");

        Piece[] pieces = Piece.getPieces();

        assertEquals(horizontalStick, pieces[Piece.STICK].fastRotation());
        //....
    }
}
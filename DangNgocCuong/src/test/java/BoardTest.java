import static org.junit.Assert.*;
import org.junit.*;
import tetris.Board;
import tetris.Piece;

public class BoardTest {
	Board b;
	Piece pyr1, pyr2, pyr3, pyr4, s, sRotated,l1,l2,st;

	// This shows how to build things in setUp() to re-use
	// across tests.

	// In this case, setUp() makes shapes,
	// and also a 3X6 board, with pyr placed at the bottom,
	// ready to be used by tests.
	@Before
	public void setUp() throws Exception {
		b = new Board(6, 9);

		pyr1 = new Piece(Piece.PYRAMID_STR);
		pyr2 = pyr1.computeNextRotation();
		pyr3 = pyr2.computeNextRotation();
		pyr4 = pyr3.computeNextRotation();

		s = new Piece(Piece.S1_STR);
		sRotated = s.computeNextRotation();

        st = new Piece(Piece.STICK_STR);
        l1 = new Piece(Piece.L1_STR);
        l2 = new Piece(Piece.L2_STR);
		b.place(pyr1, 0, 0);
	}

	// Check the basic width/height/max after the one placement
	@Test
	public void testSample1() {
		assertEquals(1, b.getColumnHeight(0));
		assertEquals(2, b.getColumnHeight(1));
		assertEquals(2, b.getMaxHeight());
		assertEquals(3, b.getRowWidth(0));
		assertEquals(1, b.getRowWidth(1));
		assertEquals(0, b.getRowWidth(2));
	}

	// Place sRotated into the board, then check some measures
	@Test
	public void testsample2() {
		b.commit();
		int result = b.place(sRotated, 1, 1);
		assertEquals(Board.PLACE_OK, result);
		assertEquals(1, b.getColumnHeight(0));
		assertEquals(4, b.getColumnHeight(1));
		assertEquals(3, b.getColumnHeight(2));
		assertEquals(4, b.getMaxHeight());
	}
	@Test
	public  void testPlace(){
        b.commit();
        assertEquals(Board.PLACE_OK,b.place(l1,0,2));
        b.commit();
        assertEquals(Board.PLACE_BAD,b.place(l2,0,0));
        b.commit();
        assertEquals(Board.PLACE_OUT_BOUNDS,b.place(l2,6,0));

        assertEquals(5,b.getColumnHeight(0));
        assertEquals(3,b.getColumnHeight(1));
        assertEquals(3,b.getRowWidth(0));
        b.commit();
        assertEquals(Board.PLACE_ROW_FILLED,b.place(pyr1,3,0));
    }
    @Test
    public void TestUndo() {
        b.commit();
        b.place(pyr1,3,0);
        b.undo();
        assertEquals(false,b.getGrid(0,3));
        assertEquals(3,b.getRowWidth(0));
    }
    @Test
    public void TestClearRow(){
        b.commit();
        b.place(pyr1,3,0);
        b.commit();
        b.place(st,0,1);
        b.commit();
        b.place(st,5,1);
        b.commit();
        b.place(l1,2,1);
        b.clearRows();
        assertEquals(3,b.getColumnHeight(0));
        assertEquals(2,b.getColumnHeight(2));
        assertEquals(3,b.getRowWidth(0));
        assertEquals(0,b.getRowWidth(3));
    }
    @Test
    public void TestDropheight(){
        b.commit();
        b.place(pyr1,3,0);
        b.commit();
        b.place(st,0,1);
        b.commit();
        b.place(st,5,1);
        b.commit();
        b.commit();
        assertEquals(2,b.dropHeight(l1,1));
        assertEquals(5,b.dropHeight(l1,0));
        b.clearRows();
        assertEquals(4,b.dropHeight(l1,0));
        assertEquals(3,b.dropHeight(pyr2,0));
    }
	// Make  more tests, by putting together longer series of 
	// place, clearRows, undo, place ... checking a few col/row/max
	// numbers that the board looks right after the operations.


}

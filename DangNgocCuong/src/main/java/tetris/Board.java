// Board.java
package tetris;
/**
 CS108 Tetris Board.
 Represents a Tetris board -- essentially a 2-d grid
 of booleans. Supports tetris pieces and row clearing.
 Has an "undo" feature that allows clients to add and remove pieces efficiently.
 Does not do any drawing or have any idea of pixels. Instead,
 just represents the abstract 2-d board.
*/
public class Board	{
	// Some ivars are stubbed out for you:
	private int width;
	private int height;
	private boolean[][] grid;
	private boolean DEBUG = true;
	boolean committed;
	private int widths[];
	private int heights[];
	private int MaxHeight;

	private int widths_backup[];
	private int heights_backup[];
	private boolean grid_backup[][];
	private int MaxHeight_backup;
	// Here a few trivial methods are provided:
	
	/**
	 Creates an empty board of the given width and height
	 measured in blocks.
	*/
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		grid = new boolean[width][height];
		for(int i=0;i<width;i++)
			for(int j=0;j<height;j++)
				grid[i][j] = false;
		committed = true;
		heights = new int[width];
		widths = new int[height];
		MaxHeight = 0;

        //////////////////////
        grid_backup = new boolean[width][height];
        heights_backup = new int[width];
        widths_backup = new int[height];

	}

	
	/**
	 Returns the width of the board in blocks.
	*/
	public int getWidth() {
		return width;
	}
	
	
	/**
	 Returns the height of the board in blocks.
	*/
	public int getHeight() {
		return height;
	}
	
	
	/**
	 Returns the max column height present in the board.
	 For an empty board this is 0.
	*/
	public int getMaxHeight() {
		return MaxHeight;
	}
	
	
	/**
	 Checks the board for internal consistency -- used
	 for debugging.
	*/
	public void sanityCheck() {
		if (DEBUG) {
			for(int i=0;i<width;i++)
			    for(int j =0;j<height;j++)
			        if(grid[i][j]&&j+1>heights[i])
			            throw new RuntimeException("error of heights");

            for(int j=0;j<height;j++) {
                int count = 0;
                for (int i = 0; i < width; i++)
                    if (grid[i][j]) count++;
                if(count != widths[j]) new RuntimeException("error of widths");
            }

            int MaxHeight_check = 0;
            for(int i=0;i<width;i++)
                MaxHeight_check = (MaxHeight_check>heights[i])?MaxHeight_check:heights[i];
            if(MaxHeight!=MaxHeight_check) new RuntimeException("error of MaxHeight");
		}
	}
	
	/**
	 Given a piece and an x, returns the y
	 value where the piece would come to rest
	 if it were dropped straight down at that x.
	 
	 <p>
	 Implementation: use the skirt and the col heights
	 to compute this fast -- O(skirt length).
	*/
	public int dropHeight(Piece piece, int x) {
		int[] skirt=piece.getSkirt();
		int y = -2;
		for(int i = 0; i < piece.getWidth(); i++)
			y = (heights[x + i] - skirt[i]>y)?heights[x+i]-skirt[i]:y;
		return y;
	}
	
	
	/**
	 Returns the height of the given column --
	 i.e. the y value of the highest block + 1.
	 The height is 0 if the column contains no blocks.
	*/
	public int getColumnHeight(int x) {
		return heights[x]; // YOUR CODE HERE
	}
	
	
	/**
	 Returns the number of filled blocks in
	 the given row.
	*/
	public int getRowWidth(int y) {
		 return widths[y]; // YOUR CODE HERE
	}
	
	
	/**
	 Returns true if the given block is filled in the board.
	 Blocks outside of the valid width/height area
	 always return true.
	*/
	public boolean getGrid(int x, int y) {
		return grid[x][y]; // YOUR CODE HERE
	}
	
	
	public static final int PLACE_OK = 0;
	public static final int PLACE_ROW_FILLED = 1;
	public static final int PLACE_OUT_BOUNDS = 2;
	public static final int PLACE_BAD = 3;
	
	/**
	 Attempts to add the body of a piece to the board.
	 Copies the piece blocks into the board grid.
	 Returns PLACE_OK for a regular placement, or PLACE_ROW_FILLED
	 for a regular placement that causes at least one row to be filled.
	 
	 <p>Error cases:
	 A placement may fail in two ways. First, if part of the piece may falls out
	 of bounds of the board, PLACE_OUT_BOUNDS is returned.
	 Or the placement may collide with existing blocks in the grid
	 in which case PLACE_BAD is returned.
	 In both error cases, the board may be left in an invalid
	 state. The client can use undo(), to recover the valid, pre-place state.
	*/
	public void creatBackUp(){

        for(int i = 0; i < width; i++)
            System.arraycopy(grid[i],0,grid_backup[i],0,height);
        System.arraycopy(heights,0,heights_backup,0,width);
        System.arraycopy(widths,0,widths_backup,0,height);

        MaxHeight_backup = MaxHeight;

    }
	public int place(Piece piece, int x, int y) {
		// flag !committed problem
		if (!committed) throw new RuntimeException("place commit problem");

		committed = false;

        int result = PLACE_OK;
        creatBackUp();
// Place_out
		if(x+piece.getWidth()>width||y+piece.getHeight()>height) return PLACE_OUT_BOUNDS;
        if(x<0||y<0) return PLACE_OUT_BOUNDS;

        TPoint[] piece_body = piece.getBody();
		//Place_bad
		for(int i=0;i<4;i++) {
          /*  int u = x+piece_body[i].getX();
            int v = y+piece_body[i].getY();
            System.out.println(u+" "+v+" "+x+" "+y);
          */  if (grid[x + piece_body[i].x][y + piece_body[i].y])
                return PLACE_BAD;
        }
       // System.out.println();

		for(int i=0;i<4;i++) {
			int xx = x+piece_body[i].x;
			int yy = y+piece_body[i].y;
			grid[xx][yy] = true;
			widths[yy]++;
			heights[xx] = (heights[xx]>(yy+1))?heights[xx]:yy+1;
			if(widths[yy]==width)
				result =PLACE_ROW_FILLED;
		}
    /*    for(int i=0;i<width;i++){
            for(int j=0;j<height;j++)
                System.out.print(grid[i][j]+" ");
            System.out.println();
        }
	*/	for(int i=0;i<width;i++)
			if(MaxHeight < heights[i])
				MaxHeight = heights[i];
        if(result==PLACE_OK) sanityCheck();

		return result;
	}
	
	
	/**
	 Deletes rows that are filled all the way across, moving
	 things above down. Returns the number of rows cleared.
	*/
	public int clearRows() {
		int rowsCleared = 0;
		for(int j=0;j<MaxHeight;j++)
            if(widths[j]==width) {
                rowsCleared ++;
		    }
		    else {
                for(int i=0;i<width;i++)
                    grid[i][j-rowsCleared]=grid[i][j];
                widths[j-rowsCleared] = widths[j];
            }
        for(int j=MaxHeight-rowsCleared;j<MaxHeight;j++) {
            for (int i = 0; i < width; i++)
                grid[i][j] = grid[i][MaxHeight];
            widths[j] = 0;
        }
        MaxHeight-= rowsCleared;

        for(int i=0;i<width;i++) {
			heights[i] = 0;
			for (int j = 0; j < height; j++)
				if (grid[i][j])
					heights[i] = j + 1;
		}
		committed = false;
		sanityCheck();
		return rowsCleared;
	}



	/**
	 Reverts the board to its state before up to one place
	 and one clearRows();
	 If the conditions for undo() are not met, such as
	 calling undo() twice in a row, then the second undo() does nothing.
	 See the overview docs.
	*/
	public void undo() {

		if(committed) return;
		committed = true;
        for(int i = 0; i < width; i++)
            System.arraycopy(grid_backup[i], 0, grid[i], 0, height);
        System.arraycopy(heights_backup, 0, heights, 0, width);
        System.arraycopy(widths_backup, 0, widths, 0, height);
		MaxHeight = MaxHeight_backup;
        sanityCheck();
	}
	
	
	/**
	 Puts the board in the committed state.
	*/
	public void commit() {
		committed = true;
	}


	/*
	 Renders the board state as a big String, suitable for printing.
	 This is the sort of print-obj-state utility that can help see complex
	 state change over time.
	 (provided debugging utility) 
	 */
	public String toString() {
		StringBuilder buff = new StringBuilder();
		for (int y = height-1; y>=0; y--) {
			buff.append('|');
			for (int x=0; x<width; x++) {
				if (getGrid(x,y)) buff.append('+');
				else buff.append(' ');
			}
			buff.append("|\n");
		}
		for (int x=0; x<width+2; x++) buff.append('-');
		return(buff.toString());
	}
}



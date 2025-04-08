public class Data 
{
    public static final int MAX = (int)(Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data (int row, int columns)
    {
        grid = new int[columns][row];
    }

    public Data (int[][] grid)
    {
        this.grid = grid;
    }
    /**
     * Fills all elements of grid with randomly generated
     * values, as described in part (a)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public void repopulate() 
    {
        int random;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                random = (int)(Math.random() * MAX + 1);
                while (random % 10 != 0 || random % 100 == 0) random = (int)(Math.random() * MAX + 1);
                grid[i][j] = random;
            }
        }
    }


    /**
     * Returns the number of columns in
     * grid that are in increasing order, as
     * described in part (b)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public int countIncreasingCols() 
    {
        int count = 0;
        boolean increase;

        for (int col = 0; col < grid[0].length; col++)
        {
            increase = true;
            for (int row = 1; row < grid.length; row++)
            {
                if (grid[row][col] < grid[row - 1][col])
                {
                    row = grid.length;
                    increase = false;
                }
            }
            if (increase) count++;
        }

        return count;
    }


    // There may be instance variables, constructors
    //and methods that are not shown.

    public int getMax()
    {
        return MAX;
    }
    public String toString()
    {
        String s = "";
        for (int i = 0; i < grid.length; i++)
        {
            for (int col: grid[i])
            {
                s += col + " ";
            }
            if (i != grid.length - 1) s += "\n";
        }

        return s;
    }
}

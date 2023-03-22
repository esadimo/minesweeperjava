
public class Tile
{
    private static final String mark = "X";
    private static final String flag = "F";
    private final int[][] neighbors = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    private boolean flagged = false;
    public Tile()
    {

    }


    public int countAdjacentMines()
    {
        int count = 0;
        for(int[] neighbor: neighbors)
        {
            for(int i=0; i < neighbor.length; i++)
            {
                if(neighbor[i] )
            }
        }
        return count;
    }



    public void click()
    {
    }

    public void flag()
    {
        Tile tile = new Tile();
        if (!flagged)
        {
            flagged = true;
        }

        else if (flagged)
        {
            flagged = false;
        }
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GameBoard {

    private static String[][] board;
    private static int nrOfMines;
    private static boolean win;
    private static final String mine = "B";
    private static final String cover = "#";

    public GameBoard(String difficulty)
    {
        //board generator for different levels
        switch (difficulty) {
            case "easy" -> {
                nrOfMines = 10;
                board = new String[8][8];

                ArrayList tileList = new ArrayList<>();
                for (int i = 0; i < nrOfMines; i++)
                {
                    ArrayList tile = new ArrayList<String>();
                    tile.add(cover);
                    tile.add(mine);
                    tileList.add(mine);
                }
                for (int i = 0; i < 54; i++)
                {
                    ArrayList tile = new ArrayList<String>();
                    tile.add(cover);
                    tile.add("");
                    tileList.add(cover);
                } // add empty tiles to list with cover string as 1st element and empty string as 2nd element

                Collections.shuffle(tileList); // shuffle the tiles

                int k = 0;
                for (int i = 0; i < 8; i++)
                {
                    for (int j = 0; j < 8; j++) {
                        board[i][j] = tileList.get(k);
                        k++;
                    }
                } // add tiles to board

                for (tile in board)
                {
                    System.out.println(tile.get[0]);
                } // print covered board

                for (String[] strings : board) {
                    Arrays.fill(strings, cover); //fills the array with the cover
                }
            } // add mines to list with cover string as 1st element and bomb as 2nd element

            case "medium" -> {
                nrOfMines = 40;
                board = new String[16][16];
                for (String[] chars : board) {
                    Arrays.fill(chars, cover);
                }
            }
            case "hard" -> {
                nrOfMines = 99;
                board = new String[16][30];
                for (String[] strings : board) {
                    Arrays.fill(strings, cover);
                }
            }
        }

        //places mines on the board
        placeMines();

        //prints the board to terminal
        assert board != null; //board shouldn't be null
        for (String[] strings : board) {
            for (String j : strings) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    public void placeMines()
    {
        int count = 0;
        Random random = new Random();
        while(count < nrOfMines)
        {
            int row = random.nextInt(board.length);
            int col = random.nextInt(board[row].length);
            //check if index is already a mine
            if(!(board[row][col]).equals(mine)){
                (board[row][col]) = mine;
                count++;
            }
        }
    }

    public int gameStatus()
    {
        String status = "";
        switch(status){
            case "none": return 0;
            case "win": return 1;
            case "lose": return 2;
            default: return 3;

        }
    }

    public String[][] gameOver()
    {
        if(win)
        {
            System.out.println("Game's over. Congratulations!");
        }
        else
        {
            System.out.println("Game's over, better luck next time");
        }
        return board;
    }

}

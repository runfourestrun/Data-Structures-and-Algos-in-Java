package twodimensionalarray;

public class TicTacToe {
    public static final int X=1, O=-1;
    public static final int EMPTY = 0;
    private int board[][] = new int[3][3];
    private int player;




    public TicTacToe(){}


    /***
     * Remember that a 2d array int[][], represents rows,columns (ordered)
     */


    public void clearBoard(){
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                board[i][j] = EMPTY;

        player = X;

    }


    public void putMark(int i, int j) throws IllegalArgumentException {
        if((i < 0) || (i>2) || (j < 0) || (j>2))
            throw new IllegalArgumentException("invalid board position");
        if(board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board position occupied");
        board[i][j] = player;
        player = -player;

    }



}

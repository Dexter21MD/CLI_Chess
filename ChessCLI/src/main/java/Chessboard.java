public class Chessboard
{
    //String[][] board = new String[9][9];
    String[][] board = {
            {"","T","H","W", "Q", "K", "W", "H","T"},
            {"","P","P","P", "P", "P", "P", "P","P"},
            {"","","","", "", "", "", "",""},
            {"","","","", "", "", "", "",""},
            {"","","","", "", "", "", "",""},
            {"","","","", "", "", "", "",""},
            {"","P","P","P", "P", "P", "P", "P","P"},
            {"","T","H","W", "Q", "K", "W", "H","T"},
            {"","","","", "", "", "", "",""}
    };

    char[] rowChar = {' ', 'a','b','c','d','e','f','g','h'};
    
    public void initBoard()
    {
        /* initialize board with navigation values:
         horizontal with a-h stored in row char
         vertical num based on board length
         */
        for (int i = 0; i < this.board.length; i++)
        {
            for (int j = 0; j < this.board[i].length ; j++)
            {
                //Checks if i is on last row if so fill it with board Chars stored in rowChar
                if (i == this.board.length - 1)
                {
                    this.board[i][j] =  String.valueOf(rowChar[j]);
                }
                else
                {
                    //Checks if j is the first column if so fill it with a number
                    if (j == 0)
                    {
                        this.board[i][j] =  String.valueOf((i + 1));
                    }
                    // fills with dummy char for now
//                    else
//                    {
//                        this.board[i][j] = "v";
//                    }
                }
            }
        }
    }

    public void  renderChessBoard()
    {
        for (int i = 0; i < this.board.length; i++)
        {
            for (int j = 0; j < this.board[i].length; j++)
            {
                System.out.print((j > 0) ? " _ " : " ");
            }

            System.out.println();
            for (int z = 0; z < this.board[i].length; z++)
            {
                System.out.print((z > 0) ?  this.board[i][z] + "  " : this.board[i][z] + " " );
                //System.out.print(this.board[i][z] + "  ");
            }
            System.out.println();

        }
    }
}


/*
for (int j = 0; j < this.board[i].length; j++)
            {
                System.out.print(this.board[i][j]);
            }
            System.out.println();

 */
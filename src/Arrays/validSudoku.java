package Arrays;

public class validSudoku {
    //leetcode problem : 36 Valid SudoKu
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch = board[i][j];
                if(ch!='.'){
                    if(!checkRow(ch,i,j,board) || !checkCol(ch,i,j,board) || !checkMat(ch,i,j,board)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkRow(char ch, int i, int j, char[][] board){
        for(int row=0; row<9; row++){
            if(board[i][row]==ch && row!=j){
                return false;
            }
        }
        return true;
    }

    public static boolean checkCol(char ch, int i, int j, char[][] board){
        for(int col=0; col<9; col++){
            if(board[col][j]==ch && col!=i){
                return false;
            }
        }
        return true;
    }
    public static boolean checkMat(char ch, int i, int j, char[][] board){
        int startRow=0, endRow=3;
        int startCol=0, endCol=3;
        if(j>=3 && j<6){
            startRow=3;
            endRow=6;
        }else if(j>=6 && j<9){
            startRow=6;
            endRow=9;
        }
        if(i>=3 && i<6){
            startCol=3;
            endCol=6;
        }else if(i>=6 && i<9){
            startCol=6;
            endCol=9;
        }
        for(int col=startCol; col<endCol; col++){
            for(int row=startRow; row<endRow; row++){
                if(board[col][row]==ch && col!=i && row!=j){
                    return false;
                }
            }
        }
        return true;
    }
}

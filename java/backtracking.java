import java.util.*;
public class backtracking {

    public static void printPermutation(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newstr,perm+curr,idx+1);
        }
    }

    public static boolean isSafe(int row,int col,char [][] board){
        for(int j = 0;j<board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        for(int i = 0;i<board.length;i++){
             if(board[i][col]=='Q'){
                return false;
             }
        }
      // Upper left:
        int r = row;
        for(int c= col;c>=0 && r>=0;c--,r--){
            if(board[row][c]=='Q'){
                return false;
            }
        }

        for(int c = col;c<board.length && r>=0;r--,c++){
            if(board[row][c]=='Q'){
                return false;
            }
        }
        for(int c=col;c>=0 && r<board.length;r++,c--){
            if(board[row][c]=='Q'){
                return false;
            }
        }

        for(int c=col;c<board.length && r<board.length;r++,c++){
            if(board[row][c]=='Q'){
                return false;
            }
        }

        return true;

    }

    public static void saveBoard(char[][] board,List<List<String>> allBoards){
        String row="";
        List<String> newboard = new ArrayList<>();
        for(int i = 0;i<board.length;i++){
            row="";
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                      row+='Q';
                }
                else{
                    row+='.';
                }
            }

            newboard.add(row);
        }
        allBoards.add(newboard);
    }

    public static void helper(char [][] board,List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board,allBoards);
        }
           for(int row = 0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
           }
    }
    public static void main(String[] args) {
        // String str = "ABC";
        // printPermutation(str, "", 0);

        // N-queens:
        List<List<String>> allBoards = new ArrayList<>();
        int n = 4;
        char [][] board = new char[n][n];
        helper(board, allBoards,0);

        
    }
}

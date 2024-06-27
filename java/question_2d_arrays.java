import java.util.*;
public class question_2d_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int mat[][] = new int[n][m];
        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<m;j++){
        //         mat[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("The Spiral order matrix is: ");
        // int row_start = 0;
        // int row_end = n-1;
        // int col_start = 0;
        // int col_end = m-1;

        // while(row_start <= row_end && col_start <= col_end){
        //     for(int col = col_start;col<=col_end;col++){
        //         System.out.print(mat[row_start][col]+" ");
        //     }
        //     row_start++;

        //     for(int row = row_start;row<=row_end;row++){
        //         System.out.print(mat[row][col_end]+" ");
        //     }
        //     col_end--;

        //     for(int col=col_end;col>=col_start;col--){
        //         System.out.print(mat[row_end][col]+" ");

        //     }
        //     row_end--;

        //     for(int row=row_end;row>=row_start;row--){
        //         System.out.print(mat[row][col_start]+" ");
        //     }
        //     col_start++;
        //     System.out.println();

        // }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
               mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Transpose is: ");

        for(int j = 0;j<m;j++){
            for(int i = 0;i<n;i++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

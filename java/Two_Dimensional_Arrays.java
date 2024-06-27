import java.util.*;
public class Two_Dimensional_Arrays {
    public static void main(String[] args) {
        // int [][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // for(int i = 0;i<arr[0].length;i++){
        //     for(int j = 0;j<arr.length;j++){
        //        System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // int num[][] = new int[r][c];
        // for(int i = 0;i<r;i++){
        //     for(int j = 0;j<c;j++){
        //         num[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i = 0;i<r;i++){
        //     for(int j = 0;j<c;j++){
        //         System.out.print(num[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int r = sc.nextInt();
        int c = sc.nextInt();
        int num[][] = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                num[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(num[i][j]==x){
                    System.out.println("x is found at index: " +i+ ","+j);
                }
            }
        }
    }
    
}

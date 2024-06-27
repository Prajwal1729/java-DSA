import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 95;
        arr[1] = 87;
        arr[2] = 89;
        arr[3] = 98;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);

        for(int i = 0;i<4;i++){
            System.out.println(arr[i]);
        }

        int arr1 [] = {89,90,100};
        for(int i = 0;i<arr.length-1;i++){
            System.out.print(arr1[i]+" ");
        }

        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0;i<n;i++){
           num[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i = 0;i<num.length;i++){
            // System.out.print(num[i]+" ");

            if(num[i]==x){
                System.out.println("x found at index: "+ i);
            }
        }

    }

    public static void sort(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
    
}

import java.util.*;
public class Question_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String names[] = new String[n];

        // for(int i=0;i<n;i++){
        //     names[i] = sc.next();
        // }

        // for(int i = 0;i<names.length;i++){
        //     System.out.println("name are: "+names[i]);
        // }

        int num[] = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = sc.nextInt();
        }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i = 0;i<num.length;i++){
        //     if(num[i] < min){
        //         min = num[i];
        //     }

        //     if(num[i] > max){
        //         max = num[i];
        //     }
        // }

        // System.out.println("Largest Number is: "+ max);
        // System.out.println("Smallest Number is: "+ min);

        boolean isAscending = true;

        for(int i = 0;i<num.length-1;i++){
            if(num[i] > num[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }

        else{
            System.out.println("The array is not sorted in ascending order");
        }


    }
    
}

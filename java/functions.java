import java.util.*;
public class functions {

    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int printSum(int a,int b){
    //     int sum = a+b;
    //     System.out.println("The sum of two numbers is:"+ sum);
    //     return sum;
    // }

    public static int printProduct(int x,int y){
        int mul = x*y;
        return mul;
    }

    public static void printFactorial(int num){
        int fact = 1;
        if(num==0 || num==1){
            System.out.println("The factorial of Number is 1");
        }
        else{
            System.out.println("Invalid Number");
        }
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("The factorial of a Number is: "+ fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // printMyName(name);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // printSum(a,b);

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The product of two Numbers is: "+ printProduct(x,y));

        printFactorial(8);

        
    }
}

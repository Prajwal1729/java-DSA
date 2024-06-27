import java.util.*;
public class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String s = sc.next();

        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int a = 10;
        int b = 90;
        int c = a+b;
        // System.out.println(c);
        // double d = (a*b)/(a-b);
        // System.out.println(d);

        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int sum = x+y;
        // System.out.println(sum);

        // Question1:
        // int age = sc.nextInt();
        // if(age > 18){
        //     System.out.println("You can drive");
        // }
        // else if(age<18){
        //     System.out.println("You cannot drive");
        // }
        // else{
        //     System.out.println("Invalid input");
        // }

        // Question2:
        int m = sc.nextInt();
        if(m%2==0){
            System.out.println("It is even");
        }
        else if(m%2!=0){
            System.out.println("It is Odd");
        }
        else{
            System.out.println("Invalid Input");
        }

        // question3:
        // int p =sc.nextInt();
        // int q = sc.nextInt();
        // if(p==q){
        //     System.out.println("Equal");
        // }

        // else if(p>q){
        //     System.out.println("p is greater");
        // }
        // else{
        //     System.out.println("p is lesser");
        // }
        // int btn = sc.nextInt();
        // switch(btn){
        //     case 1:
        //     System.out.println("Hello");
        //     break;

        //     case 2:
        //     System.out.println("Namaste");
        //     break;

        //     case 3:
        //     System.out.println("Bonjour");
        //     break;

        //     default:
        //     System.out.println("Invalid");

        // }


        

    }
    
}

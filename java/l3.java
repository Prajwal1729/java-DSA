import java.util.*;
public class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // String input = sc.next();

        // switch(input){
        //    case "add":
        //      System.out.println(a+b);
        //      break;
           
        //     case "subtract":
        //       System.out.println(a-b);
        //       break;
            
        //     case "multiplication":
        //        System.out.println(a*b);
        //        break;

        //     case "divison":
        //       System.out.println(a/b);
        //       break;

        //     case "remainder":
        //       System.out.println(a%b);
        //       break;

        // }

        int sum = 0;
        for(int i=0;i<=10;i++){
            sum+=i;
        }

        System.out.println("The sum of numbers from 1 to 10: "+ sum);

        int i = 2;
        int n = sc.nextInt();
        while(i<=n){
            if(n%i==0){
               System.out.println("It is not prime");
               i+=1;
               break;
            }
            else{
                System.out.println("It is prime");
                break;
            }
        }

        // int k = sc.nextInt();
        // int j = 0;

        // do{
        //     System.out.println(j+" ");
        //     j++;
           
        // } while(j<=k);

        int m = sc.nextInt();
        for(int k = 1;k<=10;k++){
              System.out.println("The table of input number is: "+ m + "X" + k + "=" +m*k);
        }
        System.out.println();
        
    }
}

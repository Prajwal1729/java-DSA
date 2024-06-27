import java.util.*;
public class question_functons {

    public static int printAverage(int x,int y,int z){
        int avg = (x+y+z)/3;
        return avg;
    }

    public static int printSumOddNumbers(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void greatestOfTwo(int x,int y){
        if(x>y){
            System.out.println("x is greater");
        }
        else{
            System.out.println("y is greater");
        }
        return;
    }

    public static double circumferenceOfCircle(int r){
        double c = 2*3.142*r;
        return c;
    }

    public static boolean eligibleToVote(int age){
        if(age > 18){
            return true;
        }
        else{
            return false;
        }
    }

    public static int countOfNumbers(int n){
        int count = 0;
        if(n>0){
            count++;
        }
        else if(n<0){
             count++;
        }
        else if(n==0){
             count++;
        }
        return count;
    }

    public static void raiseToPower(int x,int n){
        // if(x==0){
        //     System.out.println("Invalid");
        // }
        // else if(n==0){
        //     System.out.println("Answer is One");
        // }
        // else{
        //     System.out.println("Raise to Power: "+ Math.pow(x,n));

        // }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int z = sc.nextInt();

        // System.out.println("The average of three numbers is: "+ printAverage(x, y, z));
        // System.out.println("The sum all odd numbers from 1 to n is: "+ printSumOddNumbers(9));

        greatestOfTwo(23, 12);
        // int r = sc.nextInt();
        // System.out.println("The circumference of circle is: "+ circumferenceOfCircle(r));

        // int age = sc.nextInt();
        // System.out.println(eligibleToVote(age));

        // int n = sc.nextInt();
        // do{
        //     System.out.println("do it");
            
        // }while(n>0);
          
        // int n = sc.nextInt();
        // System.out.println(countOfNumbers(n));

        // raiseToPower(10,8);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while(n1!=n2){
            if(n1>n2){
                n1 = n1-n2;
            }
            else{
                n2 = n2-n1;
            }
        }

        System.out.println("The G.C.D is: "+ n2);

        int n = sc.nextInt();
        int a=0,b=1;
        System.out.println(a+" ");

        if(n>2){
            for(int i =2;i<=n;i++){
                System.out.println(b+" ");
                int temp = b;
                b = a+b;
                a = temp;
            }
            System.out.println();
        }
        
    }
}

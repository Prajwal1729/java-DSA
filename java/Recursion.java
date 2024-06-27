public class Recursion {
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }

    // public static void printNumbers1(int num){
    //     if(num==6){
    //         return;
    //     }
    //     System.out.println(num);
    //     printNumbers1(num+1);
    // }

    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }

    public static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static void fibo(int n1,int n2,int n){
        if(n==0){
            return;
        }
        int sum = n1+n2;
        System.out.println(sum);
        fibo(n2, sum,n-1);
    }

    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xpower = printPower(x, n-1);
        int xpowern = x*xpower;
        return xpowern;
    }

    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n%2==0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }
        else{
            return calcPower(x, n/2)*calcPower(x, n/2)*x;
        }

    }

    public static void main(String[] args) {
        // int n = 5;
        // printNumbers(n);
        // int num = 1;
        // printNumbers1(num);

        // printSum(1,10,0);

        // int num = 5;
        // System.out.println(factorial(num));
        // int n1 = 0;
        // int n2 = 1;
        // System.out.println(n1);
        // System.out.println(n2);
        // int n = 10;
        // fibo(n1, n2, n-2);

        // int x = 5;
        // int n = 8;
        // System.out.println(printPower(x, n));

        int x = 5;
        int n = 5;
        System.out.println(calcPower(x, n));
        

    }
    
}

public class l1 {
    public static void main(String[] args) {
        String s = "Artifical Intelligence is the future";
        System.out.println((s));

        int arr[] = {34,90,13,100};
        // System.out.println(arr);

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ,");
        }

        System.out.println();

        int a = 45;
        double b = 55.6;
        double c = a+b;
        System.out.println("The sum of a and b is: "+ c);

        for(int i = 0;i<=5;i++){
            for (int j = 0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i = 0;i<=5;i++){
            for(int j = 2*(5-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0;i<=5;i++){
            for(int j = 0;j<=5-i;j++){
                System.out.print(" ");
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0;i<=5;i++){
            for(int j = 0;j<=2*(5-i);j++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

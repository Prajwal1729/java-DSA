import java.util.*;

public class Bit_Manupaltion {
    public static void main(String[] args) {

        // get bit:
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was One");
        }

        // set bit:

        int n1 = 5;
        int pos1 = 1;
        int bitMask1 = 1<<pos1;
        int newNumber = bitMask1 | n1;
        if((bitMask1 | n1)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was One");
        }
        System.out.println(newNumber);

      // clear bit:

        int n2 = 5;
        int pos3 = 2;
        int bitMask2 = 1<<pos3;
        int op1 = ~(bitMask2);
        int newNumber1 = op1 & n2;
        System.out.println(newNumber1);

    // update bit:
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
 //   int oper = 1;
      int n3 = 5;
      int pos4 = 1;
      int bitMask3 = 1<<pos4;
      if(oper==1){
        int newNumber2 = bitMask3 | n3;
        System.out.println(newNumber2);
      }
      else{
        int newBitMask = 1<<pos4;
        int op2 = ~(newBitMask);
        int newNumber3 = op2 & n3;
        System.out.println(newNumber3);
      }


    }
}

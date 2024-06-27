import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        // Add:
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        // get:
        int e1 = num.get(1);
        System.out.println(e1);

        num.add(3,90);
        System.out.println(num);

        // set:
        num.set(2,7);
        System.out.println(num);

        //delete:
        num.remove(4);
        System.out.println(num);

        // to get the size
        System.out.println(num.size());

        for(int i = 0;i<num.size();i++){
            System.out.print(num.get(i)+" ");
        }

        // sorting: Important
        Collections.sort(num);
        System.out.println(num);

        //Collections Framework: Classes and Interfaces combination.

        


    }
    
}

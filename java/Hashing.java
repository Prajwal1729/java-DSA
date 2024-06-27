import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // add:
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("size of set: "+ set.size());

        if(set.contains(2)){
            System.out.println("It is present");
        }
        else{
            System.out.println("It is not present");
        }

        set.remove(3);
        if(set.contains(3)){
            System.out.println("Present");
        }
        else{
            System.out.println("Absent");
        }

        System.out.println(set); 

        Iterator it = set.iterator();

        // hasnext: it returns a boolean value
        // next: it wiil return the next element.
        // System.out.println(it.next());
        // System.out.println(it.next());

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        
    }
    
}

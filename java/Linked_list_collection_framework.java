import java.util.LinkedList;
public class Linked_list_collection_framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Prajwal");
        list.addFirst("Harvey");
        list.addFirst("Mike");
        list.addFirst("Jessica");

        list.addLast("Jeff");

        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        
    }
    
}

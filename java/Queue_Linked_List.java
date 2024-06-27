import java.util.*;
public class Queue_Linked_List {
    //    static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // static class Queue{
    //     static Node head = null;
    //     static Node tail = null;

    //     public static boolean isEmpty(){
    //         return head==null && tail==null;
    //     }

    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(tail==null){
    //             tail = head = newNode;
    //             return;
    //         }
    //         tail.next = newNode;
    //         tail = newNode;
    //     }

    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Empty queue");
    //             return -1;
    //         }
    //         int front = head.data;
    //         head = head.next;
    //         if(head==tail){
    //             tail = null;
    //         }
    //         return front;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Empty queue");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
    
    public static void main(String[] args) {

        // Queue q = new Queue();
        // Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }

        
    }
    
}

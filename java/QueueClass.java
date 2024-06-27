import java.util.*;
public class QueueClass {
    static class Queue{
        static int arr[];
        static int size;
        static int r = -1;
        static int f = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return r==-1 && f==-1;
        }

        public static boolean isFull(){
            return (r+1)%size==f;
        }

        // enqueue
        public static void add(int data){
            // if(r==size-1){
            //     System.out.println("Full queue");
            // }

            if(isFull()){
                System.out.println("Full queue");
            }
            if(f==-1){
                f = 0;
            }

            r = (r+1)%size;
            arr[r] = data;
        }

        // dequeue 
        public static int remove(){
            if(isEmpty()){
                return -1;
            }

            int res = arr[f];
            // for(int i = 0;i<r;i++){
            //     arr[i] = arr[i+1];
            // }
            if(r==f){
                r=f=-1;
            }
            else{
               f = (f+1)%size;
            }
            return res;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[f];
        }
    }
    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.add(100);
        q.add(200);
        q.add(300);
        q.add(400);
        

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}

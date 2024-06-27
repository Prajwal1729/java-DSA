class Linked_List {
        Node head;
        private int size;
        Linked_List(){
            this.size = 0;
        }
        class Node{
            String data;
            Node next;
            Node(String data){
                this.data = data;
                this.next = null;
                size++;
            }
        }
    
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(String data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while(currNode.next!=null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        public void printList(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            Node currNode = head;
            while(currNode!=null){
                System.out.print(currNode.data+"--> ");
                currNode = currNode.next;
            }

            System.out.println("Null");
        }

        public void deleteFirst(){
            if(head==null){
                System.out.println("Linked list is Empty");
                return;
            }
            size--;
            head = head.next;

        }

        public void deleteLast(){
            if(head==null){
                System.out.println("Linked list is Empty");
                return;
            }
            size--;

            if(head.next==null){
                head = null;
                return;
            }

            Node secondLastNode = head;
            Node lastNode = head.next;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            secondLastNode.next = null;

        }

        public int getSize(){
            return size;
        }

    
    public static void main(String[] args) {

       Linked_List ll = new Linked_List();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addLast("list");
        ll.addFirst("this");
        ll.printList();

        ll.deleteFirst();
        ll.printList();

        ll.addLast(null);
        ll.printList();
        System.out.println(ll.getSize());


        // collection frame work:
        

        
    }
    
}


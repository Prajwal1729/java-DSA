 class Reverse_LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
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

    public void deleteFirst(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
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

    public void printList(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
        
    }

    public void reverse(){
        if(head==null || head.next==null){
            return;
        }

       Node prevNode = head;
       Node currNode = head.next;
       while(currNode!=null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;

       }
       head.next = null;
       head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head==null || head.next!=null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public static void main(String[] args) {
        Reverse_LL ll = new Reverse_LL();
        // ll.addFirst("1");
        // ll.addFirst("2");
        // ll.addFirst("3");
        // ll.addFirst("4");

        ll.addLast("5");
        ll.addLast("6");
        ll.addLast("9");
        ll.addLast("10");
        ll.printList();

        // iterative approach:
        // ll.reverse();
        // ll.printList();

    // here is two approach to reverse the linked list one iterative way and other is recursive way.
    // The above was a Iterative way.

    // recursive approach:
      ll.head = ll.reverseRecursive(ll.head);
      ll.printList();




        
    }
}
    


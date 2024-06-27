class LL {
    private int size;
    Node head;
    LL(){
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

    public void deleteFirst(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        size--;
        if(head.next==null){
           head = null;
           return;
        }

        Node secondLastNode  = head;
        Node lastNode = head.next;
        while(lastNode!=null){
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
    }

    public void printList(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data +" -->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public Node deletenthNode(Node head,int n){
        if(head.next==null){
            return null;
        }
        int size = 0;
        Node currNode = head;
        while(currNode!=null){
            currNode = currNode.next;
            size++;
        }

        if(n==size){
            return head.next;
        }
        int idx = size - n;
        Node prev = head;
        int i = 0;
        while(i<idx){
            prev = prev.next;
            size++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public Node findMiddle(Node head){
        Node h = head;
        Node t = head;
        while(h.next!=null && h.next.next!=null){
            h = h.next.next;
            t = t.next;
        }
        return t;
    }

    public boolean isPalindromeLL(){
        if(head==null || head.next==null){
            return true;
        }

        Node mid = findMiddle(head);  // first half end.
        Node secondhalfstart = reverse(mid.next);  

        Node firstHalfstart = head;
        while(secondhalfstart!=null){
            if(firstHalfstart.data!=secondhalfstart.data){
                return false;
            }
            firstHalfstart = firstHalfstart.next;
            secondhalfstart = secondhalfstart.next;
        }
        return true;
    }

    public boolean isCycle(Node head){
        if(head==null){
            return false;
        }
        Node h = head;
        Node t = head;
        while(h.next!=null && h.next.next!=null){
            h = h.next.next;
            t = t.next;

            if(h == t){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        LL l1 = new LL();
        // l1.addFirst("100");
        // l1.addFirst("200");
        // l1.addFirst("300");
        // l1.addFirst("400");
        // l1.addFirst("500");

        l1.addLast("1");
        l1.addLast("2");
        l1.addLast("2");
        l1.addLast("1");
        l1.printList();
        System.out.println(l1.isPalindromeLL());
        
    }
}

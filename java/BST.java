import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right) + 1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        return sumOfNodes(root.left) +  sumOfNodes(root.right) + root.data;
    }

    public static int heightNodes(Node root){
        if(root==null){
            return 0;
        }

        int hl = heightNodes(root.left);
        int hr = heightNodes(root.right);

        return Math.max(hl,hr) + 1;
    }

    public static int diameterOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int dia1 = diameterOfNodes(root.left);
        int dia2 = diameterOfNodes(root.right);
        int dia3 = heightNodes(root.left) + heightNodes(root.right) + 1;

        int dia = Math.max(dia1,dia2);

        return Math.max(dia3,dia);
    }

    static class TreeInfo{
        int ht;
        int dia;

        TreeInfo(int ht,int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }
     public static TreeInfo diameterOfNodes1(Node root){
        if(root==null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left  = diameterOfNodes1(root.left);
        TreeInfo right = diameterOfNodes1(root.right);

        int myht = Math.max(left.ht,right.ht) + 1;
        int diam1 = left.dia;
        int diam2 = right.dia;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myht,mydiam);
        return myInfo;

     }

     public static boolean isIndentical(Node root,Node subroot){
        if(root==null && subroot==null){
            return true;
        }
        if(root==null || subroot==null){
            return false;
        }
        if(root.data == subroot.data){
           return isIndentical(root.left, subroot.left) || isIndentical(root.right, subroot.right);
        }
        return false;
     }

    public static boolean subTree(Node root,Node subroot){
        if(subroot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIndentical(root, subroot)){
                return true;
            }

        }
        return subTree(root.left, subroot) || subTree(root.right, subroot);
        
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();

        Node root = bt.buildTree(nodes);
        System.out.println(root.data);

        // preOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);

        // levelOrder(root);

        System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightNodes(root));

        System.out.println(diameterOfNodes(root));
        
        System.out.println(diameterOfNodes1(root).dia);
    }
    
}

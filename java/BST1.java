import java.util.*;
public class BST1 {
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

    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left  = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean searchinBST(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return searchinBST(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return searchinBST(root.right, key);
        }

    }

    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            // case1: leaf node
            if(root.left==null && root.right == null){
                return null;
            }
            // case2 : one child 
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            // case3: two childern.
            Node IS = inorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }

    public static Node inorderSuccesor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root,int x,int y){
        if(root==null){
            return;
        }
        if(root.data >= x && root.data <=y){
              printInRange(root.left, x, y);
              System.out.print(root.data+" ");
              printInRange(root.right, x, y);
        }

        else if(root.data > y){
            printInRange(root.left, x, y);
        }
        else{
            printInRange(root.right, x, y);
        }

    }

    public static void rootToLeafPaths(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);

        if(root.left==null && root.right==null){
            printPath(path);
        }
        else{
            rootToLeafPaths(root.left, path);
            rootToLeafPaths(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0;i<path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }
    // static class BinaryTree{
    //     static int idx = -1;
    //     public static Node buildTree(int nodes[]){
    //         idx++;
    //         if(idx==-1){
    //             return null;
    //         }
    //         Node newNode = new Node(nodes[idx]);
    //         newNode.left = buildTree(nodes);
    //         newNode.right = buildTree(nodes);

    //         return newNode;
    //     }
    
    public static void main(String[] args) {
        int nodes[] = {5,1,3,4,2,7};
        int values[] = {8,5,3,1,4,6,10,11,14};
        // BinaryTree bt = new BinaryTree();
        // Node root = bt.buildTree(nodes);
        // System.out.println(root.data);
        Node root = null;
        // for(int i = 0;i<nodes.length;i++){
        //     root = insert(root,nodes[i]);
        // }

        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        // System.out.println(searchinBST(root, 1));

        delete(root, 4);
        inOrder(root);
        System.out.println();
        printInRange(root, 6, 10);
        System.out.println();
        rootToLeafPaths(root,new ArrayList<>());
    }
}

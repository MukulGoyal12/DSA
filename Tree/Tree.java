package Tree;

import java.util.Scanner;

public class Tree {

    Scanner sc = new Scanner(System.in);
    public class Node {
        int val;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }
        Node root = null;

        public void createTree(){
            root=createTree(this.root);
        }

        private Node createTree(Node root){
            int data= sc.nextInt();
            Node nn = new Node(data);

            boolean hls = sc.nextBoolean();
            if(hls){
                nn.left = createTree(nn);
            }

            boolean hrs = sc.nextBoolean();
            if(hrs){
                nn.right = createTree(nn);
            }
             return nn;
        }

        public void  Display(){
            display(this.root);
        }

        private void display(Node root){
            if(root == null) {
                return;
            }
            System.out.println(root.val);
            display(root.left);
            display(root.right);
        }

        public void  DisplayPre(){
            preOrder(this.root);
        }

        public void preOrder(Node root){
            if (root==null)
                return;

            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }

        public void  DisplayPost(){
            postOrder(this.root);
        }

        public void postOrder(Node root){
            if (root==null)
                return;

            System.out.println(root.val);
            preOrder(root.right);
            preOrder(root.left);
        }

        public void  DisplayInOrder(){
            InOrder(this.root);
        }

        public void InOrder(Node root){
            if (root==null)
                return;

            preOrder(root.left);
            System.out.println(root.val);
            preOrder(root.right);
        }


        public static void main(String args[]){
            Tree tt = new Tree();
            tt.createTree();
            System.out.println("Tree");
            tt.Display();
            System.out.println("PreOrder");
            tt.DisplayPre();
            System.out.println("PostOrder");
            tt.DisplayPost();
            System.out.println("InOrder");
            tt.DisplayInOrder();

        }

    }

    //10 true 20 false false true 30 false false
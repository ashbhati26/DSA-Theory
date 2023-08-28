import java.util.*;

public class Height {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.min(lh, rh) + 1;
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int diameter1(Node root){ // approach 1
        if(root == null){
            return 0;
        }
        int leftDiameter = diameter1(root.left);
        int leftHeight = height(root.left);
        int rightDiameter = diameter1(root.right);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;
        return Math.max(selfDiameter, Math.max(rightDiameter, leftDiameter));
    }

    static class Info{
        int diameter2;
        int height;

        public Info(int diameter2, int height){
            this.diameter2 = diameter2;
            this.height = height;
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);  

        int diameter2 = Math.max(Math.max(leftInfo.diameter2, rightInfo.diameter2), rightInfo.height + leftInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(diameter2, height);
    }
    public static void main(String[] args) {
        /*          1
         *       /    \
         *      2      3
         *    /  \   /  \
         *   4    5 6    7 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));

        System.out.println(count(root));

        System.out.println(sum(root));

        System.out.println(diameter1(root));

        System.out.println(diameter2(root));
    }
} 
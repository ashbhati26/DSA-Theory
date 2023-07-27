import java.util.*;

public class LowestCommonAncestor {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            // If any of the nodes not found in the tree, return null (no common ancestor).
            return null;
        }

        // Find the first unequal node in both paths (Last Common Ancestor).
        int i = 0;
        while (i < path1.size() && i < path2.size() && path1.get(i) == path2.get(i)) {
            i++;
        }

        // The LCA node is the last common node before the nodes diverge.
        return path1.get(i - 1);
    }

    public static int KAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == 1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
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

        // int n1 = 4, n2 = 6;
        // Node lcaNode = lca(root, n1, n2);

        // if (lcaNode != null) {
        //     System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + lcaNode.data);
        // } else {
        //     System.out.println("One or both of the nodes not found in the tree.");
        // }

        int n = 5, k = 2;
        KAncestor(root, n, k); 
    }
} 
public class BinaryTree {
        static class Node {
            int data;
            Node left;
            Node right;
    
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
        Node root;
        public BinaryTree() {
            root = null;
        }
        // Inserting an Element
        public void insert(int data) {
            root = insertRec(root, data);
        }
        public static Node insertRec(Node root, int data) {
            if (root == null) {
                return new Node(data);
            }
    
            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }
    
            return root;
        }

        // Searching for an Element
        public static boolean search(Node root, int data){
            if(root == null){
                return false;
            }
            if(root.data == data){
                return true;
            }
            if(data < root.data){
                return search(root.left, data);
            }
            return search(root.right, data);
        }
    
        // Deleting an Element
        public Node delete(Node root, int data) {
            if (root == null) {
                return root;
            }
    
            if (data < root.data) {
                root.left = delete(root.left, data);
            } else if (data > root.data) {
                root.right = delete(root.right, data);
            } else {
                // Node with only one child or no child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
    
                // Node with two children: get the inorder successor
                root.data = minValue(root.right);
    
                // Delete the inorder successor
                root.right = delete(root.right, root.data);
            }
    
            return root;
        }
         // Find the node with the smallest key in a given binary tree
        public static int minValue(Node root) {
            int minValue = root.data;
            while (root.left != null) {
                minValue = root.left.data;
                root = root.left;
            }
            return minValue;
        }
    
        // Inorder Traversal (prints elment in ascending order)
        public void inorderTraversal(Node root) {
            if (root != null){
                inorderTraversal(root.left);
                System.out.println(root.data + " ");
                inorderTraversal(root.right);
            }
        }
    
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
    
            // Inserting elements
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);

            tree.inorderTraversal(tree.root);
    
            // Searching for an element
            int searchElement = 40;
            if(tree.search(tree.root, searchElement)){
                System.out.println(searchElement + " found in a tree");
            }else{
                System.out.println(searchElement + " not found in the tree");
            }

            // Deleting an element
            int deleteElement = 30;
            tree.delete(tree.root, deleteElement);
            System.out.println("After deleting " + deleteElement + ":");
            
            tree.inorderTraversal(tree.root);
        }
    }
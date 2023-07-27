import java.util.*;
public class TopView {
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
    static class Info{
        Node node;
        int height; // height = horizontal distance

        public Info(Node node, int height){
            this.node = node;
            this.height = height;
        }
    }
    public static void TopView(Node root){
        // level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                } 
            } else{
                if(!map.containsKey(curr.height)){
                    map.put(curr.height, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.height-1));
                    min = Math.min(min, curr.height-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.height+1));
                    max = Math.max(max, curr.height+1);
                }
            }   
        }
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
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

        TopView(root);
    }
    
}

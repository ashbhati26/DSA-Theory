import java.util.*;

public class ImplementationHashMao {
    static class HashMap<K, V>{ //generic
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n
        private int N;
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.lenght;
        }

        private int SearchInLL(K key){
            LinkedList<Node> l1 = buckets[bi];

            for(int i = 0; i < ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;

        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = SearchInLL(key);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = n/N;
            if(lambda > 2.0){
                
            }
        }
        public boolean containsKey(K key){
                return false;
        }

        public V remove(K key){
            return null;
        }

        public V get(K key){
            return null;
        }

        public ArrayList<K> keySet(){
            return null;
        }
        }
    public static void main(String[] args) {
        
    }    
}
import java.util.*;
public class IterationOnHashSets {
    public static void main(String[] args) {
        java.util.HashSet<String> cities = new java.util.HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String city : cities){
            System.out.println(city);
        }
    }
    
}

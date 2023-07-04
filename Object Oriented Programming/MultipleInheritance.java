import java.util.*;
public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatMeat();
        b.eatPlants();
    }  
}
interface Carnivorous{
    void eatMeat();
}
interface Herbivorous{
    void eatPlants();
}
class Bear implements Carnivorous, Herbivorous{
    public void eatMeat(){
        System.out.println("Bear eats meat ");
    }
    public void eatPlants(){
        System.out.println("Bear eats plants");
    }
}

import java.rmi.server.SocketSecurityException;

import javax.sound.sampled.SourceDataLine;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog nordy = new Dog();
        nordy.eat();
        nordy.legs = 4;
        System.out.println(nordy.legs);
    }  
}
// Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
// Derived Class
class Mammal extends Animal{
    int legs;
}
//  Derived Class
class Dog extends Mammal{
    String breed;
}
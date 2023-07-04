public class HybridInheritance {
    public static void main(String[] args) {
        Human aman = new Human();
        aman.eat();
        aman.breathe();
        aman.walk();
        aman.humanWalk();
    }
}
// Base Class
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Tuna extends Fish{
    void tunaSwim(){
        System.out.println("tune swims");
    }
}
class Shark extends Fish{
    void sharkSwim(){
        System.out.println("shark swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Parrot extends Bird{
    void parrotFly(){
        System.out.println("parrot fly");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("wals");
    }
}
class Dog extends Mammal{
    void dogWalk(){
        System.out.println("Dog walks");
    }
}
class Human extends Mammal{
    void humanWalk(){
        System.out.println("human walks");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Mammal human = new Mammal();
        human.walk();
        Fish shark = new Fish();
        shark.swim();
        Bird parrot = new Bird();
        parrot.fly();
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
// Derived Class
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
// Derived Class
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
// Derived Class
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

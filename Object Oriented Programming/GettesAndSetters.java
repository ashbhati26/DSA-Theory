public class GettesAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue"); // getter
        System.out.println(p1.getColor()); // setter
        p1.setTip(5); // getter
        System.out.println(p1.getTip()); // setter
    }
}

class Pen{
    private String color; // current object
    private int tip; // current object
    // getters
    String getColor(){
        return this.color; //this keyword is used to refer to the current object
    }
    int getTip(){
        return this.tip; //this keyword is used to refer to the current object
    }
    // setters
    void setColor(String newColor){
        this.color = newColor; //this keyword is used to refer to the current object
    }
    void setTip(int newTip){
        this.tip = newTip; //this keyword is used to refer to the current object
    }
}
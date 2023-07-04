public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("ashish");
        Student s3 = new Student(8);
    }  
}

class Student{
    String name;
    int roll;

    // Non Parameterized Constructor
    Student(){
        System.out.println("constructor is called...");
    }
    // Parameterized Constructor
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}

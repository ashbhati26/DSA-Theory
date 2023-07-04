public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ashish";
        s1.roll = 234;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    } 
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    Student(){
        marks = new int [3];
    }
}
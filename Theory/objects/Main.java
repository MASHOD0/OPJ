package objects;
class Student{
    String Name;
    int roll_no;
    int ph_no;
    Student(String Name, int roll_no, int ph_no){
        this.Name = Name;
        this.roll_no = roll_no;
        this.ph_no = ph_no;
    }
}
public class Main {
    public static void main(String arg[]){
        Student s1 = new Student("Ron", 12, 12345678);
        Student s2 = new Student("ken", 34, 98765432);
        System.out.println("Name: "+s1.Name+" Roll Number: "+s1.roll_no+" Phone Number: "+s1.ph_no);
        System.out.println("Name: "+s2.Name+" Roll Number: "+s2.roll_no+" Phone Number: "+s2.ph_no);
    }
}
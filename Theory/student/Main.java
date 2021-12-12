/**
 * Consider the class student that has sem and branch as private variables 
 * a `average()` that only prints the message average marks belonging to sem and branch respectively.
 * create a subclass `stud1` , `stud2` and `stud3` each including varables m1 m2 m3 for student 1, 
 * m1, m2, m3, m4 for student 2 and m1, m2 for student 3 respectively.
 * calculate the average in each of the cases by overriding the average method.
 */

class Student{
    int m1;
    int m2;
    int m3;
    Student(int m1, int m2, int m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    double average(){
        return (m1+m2+m3)/3.0;
    }
}
class stud1 extends Student{
    stud1(int m1, int m2, int m3){
        super(m1, m2, m3);
    }
    double average(){
        return (m1+m2+m3)/3.0;
    }
}
class stud2 extends Student{
    int m4;
    stud2(int m1, int m2, int m3, int m4){
        super(m1, m2, m3);
        this.m4 = m4;
    }
    double average(){
        return (m1+m2+m3+m4)/4.0;
    }
}
class stud3 extends Student{
    stud3(int m1, int m2){
        super(m1, m2, 0);
    }
    double average(){
        return (m1+m2)/2.0;
    }
}
class Main{
    public static void main(String[] args){
        stud1 s1 = new stud1(10, 20, 30);
        stud2 s2 = new stud2(10, 20, 30, 40);
        stud3 s3 = new stud3(10, 20);
        System.out.println("Average of student 1 is "+s1.average());
        System.out.println("Average of student 2 is "+s2.average());
        System.out.println("Average of student 3 is "+s3.average());

    }
} 
/**
 * Demonstrate constructor overloading for the following scenario:
 * Car booking is accepted based on the number of family members.
 * for 2 people 1000/-
 * for 4 people 2000/-
 * for 6 people 5000/-
 */

 class taxi{
    int fare;
    String name1;
    String name2;
    String name3;
    String name4;
    String name5;
    String name6;
    taxi(String name1,String name2,String name3,String name4,String name5,String name6){
        this.name1=name1;
        this.name2=name2;
        this.name3=name3;
        this.name4=name4;
        this.name5=name5;
        this.name6=name6;
        fare = 5000;
    }
    taxi(String name1,String name2,String name3,String name4){
        this.name1=name1;
        this.name2=name2;
        this.name3=name3;
        this.name4=name4;
        fare = 2000;
    }
    taxi(String name1, String name2){
        this.name1=name1;
        this.name2=name2;
        fare = 1000;
    }
 }
public class main {
    public static void main(String[] args) {
        taxi t1 = new taxi("A","B");
        taxi t2 = new taxi("A","B","C","D");
        taxi t3 = new taxi("A","B","C","D","E","F");
        System.out.println("Fare for 2 people is "+t1.fare);
        System.out.println("Fare for 4 people is "+t2.fare);
        System.out.println("Fare for 6 people is "+t3.fare);
    }
}


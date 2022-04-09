/**
 * Demonstrate constructor overloading for the following scenario:
 * Car booking is accepted based on the number of family members.
 * for 2 people 1000/-
 * for 4 people 2000/-
 * for 6 people 5000/-
 * Take details of the customers and display the pricing accordingly
 */
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of family members");
        int n = sc.nextInt();
        System.out.println("Enter the name of the family members");
        if (n == 2) {
            taxi t = new taxi(sc.next(), sc.next());
            System.out.println("The fare is " + t.fare);
        } else if (n == 4) {
            taxi t = new taxi(sc.next(), sc.next(), sc.next(), sc.next());
            System.out.println("The fare is " + t.fare);
        } else if (n == 6) {
            taxi t = new taxi(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
            System.out.println("The fare is " + t.fare);
        } else {
            System.out.println("Invalid number of family members");
        }

    }
}


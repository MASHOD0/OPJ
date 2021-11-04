import java.util.Scanner;

public class Fibonacci {
    // Program to implement 
    Scanner sc = new Scanner(System.in);
    // Function to print Fibonacci series
    public static void main (String[] args){
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        //int n = 10;
        int f1 = 0, f2 = 1, f3;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 2; i < n; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}
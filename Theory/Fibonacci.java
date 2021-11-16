import java.util.Scanner;

public class Fibonacci {
    // Program to implement 
    
    // Function to print Fibonacci series
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        //int n = 10;
        int f1 = 0, f2 = 1, f3;
        System.out.print(f1 +"\n" + f2 + "\n");
        for (int i = 2; i < n; i++) {
            f3 = f1 + f2;
            System.out.println(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}

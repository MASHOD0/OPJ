import java.util.Scanner;

class Qadratic{
	public static void main( String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
                int b = sc.nextInt();
		System.out.println("Enter c:");
                int c = sc.nextInt();
		
		int d = ((b*b)-4*a*c);

		if (d >= 0){
			System.out.println("Solution exists");
			System.out.println("first root:"+ ((b-d)/2*a) );
			System.out.println("second root:"+ ((b+d)/2*a));
		}
	
		else{
			System.out.println("no solution exists");
		}
	}
}

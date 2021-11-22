9import java.util.Scanner;
/*
import java.util.Scanner;
public class EmployeeSalary
{
public static void main (String args[])
{
String name,eid;
double bsalary;
Scanner sc = new Scanner (System.in);
System.out.println ("Enter Name & Employee Id");
name = sc.nextLine ();
eid = sc.nextLine ();
System.out.println ("Enter Basic Salary");
bsalary = sc.nextDouble ();
double da = (0.4)*bsalary;
double hra = (0.2)*bsalary;
double cca = 250;
double pf = (0.1)*bsalary;
double pt = 100;
double gincome = bsalary+da+hra+cca;
double it = (0.1)*gincome;
double deduction = pf+pt+it;
double nincome = gincome-deduction;
System.out.println ("The salary of employee "+name+" with Id "+eid+" is
Rs."+nincome);
}
}
*/
public class EmployeeSalary{
    public static void main (String arg[]){
        Scanner sc = new Scanner (System.in);

        String name, eid;
        double b_salary;
        System.out.println("Enter Employ Name and ID:");
        name = sc.nextLine();
        eid = sc.nextLine();
        System.out.println("Enter the basic salary:");
        b_salary = sc.nextDouble();

        double da = 0.4*b_salary, hra = 0.2*b_salary, pf = 0.1*b_salary;
        double pt = 100, cca = 250;
        double g_income = b_salary + da + hra + cca;
        double it = 0.1 * g_income;
        double deduction = pf + pt + it;
        double n_income = g_income - deduction;
        
        System.out.println("The salary of employee "+ name + " with ID " + eid + " is Rs." + n_income);



    }
}
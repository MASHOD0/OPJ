import java.util.Scanner;

interface FixedDeposit{
    double getMAmount();
    void calculateInterest();
    void getDetails();
}
class CanaraBank implements FixedDeposit{
    Scanner sc = new Scanner(System.in);
    String name;
    double principal;
    double period;
    double roi = 8.5;
    double interestAmt;
    public void getDetails(){
        System.out.println("Enter the name of the customer");
        name = sc.next();
        System.out.println("Enter the principal amount");
        principal = sc.nextDouble();
        System.out.println("Enter the period");
        period = sc.nextDouble();
    }
    public void calculateInterest(){
        interestAmt = (principal * roi * period) / 100;
    }
    public double getMAmount(){
        double totalBalance;
        totalBalance = principal + interestAmt;
        return totalBalance;
    }
}
class SBI implements FixedDeposit{
    Scanner sc = new Scanner(System.in);
    String name;
    double principal;
    double period;
    double roi = 9.5;
    double interestAmt;
    public void getDetails(){
        System.out.println("Enter the name of the customer");
        name = sc.next();
        System.out.println("Enter the principal amount");
        principal = sc.nextDouble();
        System.out.println("Enter the period");
        period = sc.nextDouble();
    }
    public void calculateInterest(){
        interestAmt = (principal * roi * period) / 100;
    }
    public double getMAmount(){
        double totalBalance;
        totalBalance = principal + interestAmt;
        return totalBalance;
    }
}

class Testbank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name");
        String bankName = sc.next();
        if(bankName.equals("CanaraBank")){
            CanaraBank cb = new CanaraBank();
            cb.getDetails();
            cb.calculateInterest();
            System.out.println("The total amount is "+cb.getMAmount());
        }
        else if(bankName.equals("SBI")){
            SBI sb = new SBI();
            sb.getDetails();
            sb.calculateInterest();
            System.out.println("The total amount is "+sb.getMAmount());
        }
        else{
            System.out.println("Invalid bank name");
        }
    }
}
/** Bank access control */



class Bank_details{
	public String name;
	public String address;
	private int account_number;

	void get_acc_no(int a){
		a = account_number;
	}
}
class Bank_Main{
	public static void main(String arg[]){
		Bank_details person1 = new Bank_details();
		person1.name = "first person";
		person1.address = "address 1";
		person1.account_number = 1234;
	}
}

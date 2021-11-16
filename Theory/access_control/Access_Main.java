class Test_access{
int a;
public int b;
private int c;
void set`_c(int i){
	c = i;
	}
int get_c(){
	return c;
	}
}
class Access_Main{
public static void main (String arg[]){
Test_access ob = new Test_access();
ob.a = 10;
ob.b = 20;
ob,c = 30;    // cannot be accessed as it is a privae variable
ob.get_c(30);
	}
}

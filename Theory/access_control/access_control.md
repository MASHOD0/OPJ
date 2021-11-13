# Access control in java

## 1.public
Can be accessed anywhere

## 2.private 
can be accessed within the class ; can be accessed through class memvers


## 3.protected 
can be applied only when inheritance is involved


## 4.default 

can be accessed outside the class but within the package 

```java
class Test_access{
int a; 
public int b;
private int c;
void set_c(int i){
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

```
Write a program to demonstrate access control for a bank;

## final 
```java
final int FILE_OPEN = 1;
```
variables can be declared as final . If they are declared and such variables cannot be declared init.
any variable defined as final must also be initialized 
by convention such variables are written in upper case letters 



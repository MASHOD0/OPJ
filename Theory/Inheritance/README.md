# Inheritance
to create hiearachy
```java
class Super_A{
    int i,j;
    void showij(){
        System.out.println("values of i&j "+i+" & "+j);
    }
}
class Sub_B extends Super_A{
    int k;
    void showijk(){
        System.out.println(i, j, k);
    }
    void sum(){
        System.out.println(i+j+k);
    }
}
class Main{
    public static void main(String args[]){
        Super_A SupOb = new Super_A();
        Sub_A SubOb = new Sub_B();
        SupOb.i = 10;
        SupOb.j = 20;
        SubOb.i = 1;
        SubOb.j = 2;
        SubOb.k = 3;
        SupOb.showij();
        SubOb.showijk();
        SubOb.showij();
        SubOb.sum();
    }
}
```
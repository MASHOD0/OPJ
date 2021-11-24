# Inner class
nested class , static anonymous
```java 
class Outer{
    class Inner{
        public void show(){
            System.out.println("Inside inner class");
        }
}
class Main {
    public static void main (String arg[]){
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}
```

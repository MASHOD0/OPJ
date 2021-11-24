public class Outer {
    class Inner{
        public void show(){
            System.out.println("inside inner class");
        }
        
    }
    public static void main (String arg[]){
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
    
}

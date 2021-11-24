class Outer{
    int i ;
    class Inner{
        
        
        public void show(){
            Outer ou = new Outer();
            ou.i =110;
            System.out.println("inside inner class "+ i);
        }
    }
}
class Main {
    public static void main (String arg[]){
        Outer.Inner in = new Outer().new Inner();
        in.show();
    
    }
}
class Random{
    int a;
    int b;
    Random(int a, int b){
        a = this.a;
        b = this.b;
    }
}
interface Demo{
    Random r1= new Random(1 ,2);
    int a = 10;
    void callme();
    void show();
}

abstract class Demo1 implements Demo{
    public void callme(){
        System.out.println("I am in callme");
    }
    public abstract void show();
}

class Main {
    public static void main(String[] args) {
        Demo1 d = new Demo1(){
            public void show(){
                System.out.println("I am in show");
            }
        };
        d.callme();
        d.show();
    }
}
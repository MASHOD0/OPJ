package generics;
class Add<T extends Numbers>{
    T a;
    T b;
    T add(){
        return (T) (a.add(b));
    }
}
public class Main {
    public static void main(String arg[]){
        Add<Integer> a = new Add<Integer>();
        a.a = new Integer(10);
        a.b = new Integer(20);
        System.out.println(a.add());
        Add<Double> b = new Add<Double>();
        b.a = new Double(10.0);
        b.b = new Double(20.0);
        System.out.println(b.add());
    }
}

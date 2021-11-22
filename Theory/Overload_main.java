class Overload_demo{
    void test(){
        System.out.println("No parameter passed");
    }
    void test(int a){
        System.out.println("Parameter passed:"+a);
    }
    int test(int a,int b){
        return a + b;
    }
}

class Overload_main{
    public static void main(String arg[]) {
        Overload_demo ob1 = new Overload_demo();
        ob1.test();
        ob1.test(1);
        int c = ob1.test(1, 2);
        System.out.println(c);
    }
}
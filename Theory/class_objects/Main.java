public class Main{
    public static void main(String arg[]){
        int num = Integer.parseInt(arg[0]);
        System.out.println(num);
        int factorial = 1;
        while(num != 0){
            factorial *= num;
            num--;
        }
        System.out.println(factorial);
    }
}
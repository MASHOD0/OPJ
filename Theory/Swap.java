class Swappy
{
    int a;
    int b;
  Swappy(int a,int b){
      this.a=a;
      this.b=b;
  }
  Swappy swap(Swappy s){
      int temp=s.a;
      s.a=s.b;
      s.b=temp;
      return s;
  }
}
class Swap{
    public static void main(String[] args) {
        Swappy s = new Swappy(10, 20);
        System.out.println("Before Swap: " + s.a + " " + s.b);
        s=s.swap(s);
        System.out.println("After Swap: " + s.a + " " + s.b);
    }
}

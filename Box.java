class Box_Demo{
    int width;
    int height;
    int depth;

    int volume(int widht ,int height ,int depth){
        return  widht*height*depth;
    }
}
class Box{
    public static void main(String[] args) {
        System.out.println("This is the main java program");
        Box_Demo ob1=new Box_Demo();
       ob1.depth=10;
       ob1.height=10;
       ob1.width=10;
        System.out.println("Volume of the box is "+ ob1.volume(10,10,10));
    }
}
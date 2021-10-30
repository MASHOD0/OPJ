Class Box{
    int width;
    int height;
    int depth;
    Box(){
        width = 1;
        height = 2;
        depth = 2;
        
    }
    int volume(){
        return width*height*depth;
    }
}

class Box_main{
    public static void main(String arg[]) {
        Box ob1  = new Box();
        System.out.println("Vol :" ob1.volume());
        
    }
}
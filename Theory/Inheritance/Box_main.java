class Box{
	int width;
	int height;
	int depth;
	Box(){
		width = height = depth = -1;
	}
	Box(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	Box(int len){
		width = height = depth = len;
	}
	Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	int volume(){
		return width*height*depth;
	}
}
class Box_weight extends Box{
    double weight;
    Box_weight(double w, double h, double d, double wt){
        width = w;
        height = h;
        depth = d;
        weight = wt;
    }
}
class Box_main{
	public static void main (String arg[]){
		Box ob1 = new Box();
		Box ob2 = new Box(1,2,3);
		Box ob3 = new Box(10);
		Box ob4 = new Box(ob1);
		Box ob5 = new Box(ob2);
        Box_weight Box1 = new Box_weight(1, 2, 3, 4);
		System.out.println(ob1.volume()) ;
		System.out.println(ob2.volume()) ;    //6
		System.out.println(ob3.volume()) ;   //1000
		System.out.println(ob4.volume()) ;  //-1
		System.out.println(ob5.volume()) ; //6
	}
}
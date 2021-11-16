class Box{
	int width;
	int height;
	int depth;
	// void colour(){
	// 	System.out.println("   ");
	// }
	// void volume(){
	// 	System.out.println("Volume of the box is :"+ (width*height*depth));

	// }
	int volume(){
		System.out.println("Volume of the box is :"+ (width*height*depth));
		return (width*height*depth);
	}
	void colour(String col_name){
		System.out.println("Color of Box is:"+ col_name);
	}
}


class Box_main{
	public static void main (String arg[]){
		Box ob1 = new Box();
			
		ob1.width = 2; 
		ob1.height = 3;
		ob1.depth = 4;
		ob1.colour("green");
		int volume = ob1.volume();

		Box ob2 = new Box();
		ob2.width = 2;
		ob2.height = 5;
		ob2.depth = 6;
		int vol_2 = ob2.volume();
		ob2.colour("red");
	}
}

class Box{
	int width;
	int height;
	int depth;
	void colour(){
		System.out.println("   ");
	}
	// void volume(){
	// 	System.out.println("Volume of the box is :"+ (width*height*depth));

	// }
	int volume(){
		System.out.println("Volume of the box is :"+ (width*height*depth));
		return (width*height*depth);
	}

}


class Box_main{
	public static void main (String arg[]){
		Box ob1 = new Box();
			
		ob1.width = 2; 
		ob1.height = 3;
		ob1.depth = 4;
		ob1.colour();
		int volume = ob1.volume();
	}
}

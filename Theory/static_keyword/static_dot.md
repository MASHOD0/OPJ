

Used to initalize any static data member,
It is executed before the main method
```java
class Example{
	static{
		System.out.println("Static block initalized ");
	}
	public static void main(String arg[]){
		System.out.println("Hello world");
	}
}
```


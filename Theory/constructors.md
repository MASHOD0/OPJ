# Constructors 

Initializes objects upon creation,
have the same name as the class it belongs to. 
Syntactically similar to a method 
has no return type;
not even void( because implicitly a class is constructor has the same type as the class)

- This keyword refers to the object that is invoking the method/constructor 
- this can be used inside any method to refer to the `current` object 
- helps in resolving name-space collison
```java
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
Box(int width, int height, int depth){
    this.width = width;
    this.height = height;
    this.depth = depth;

}
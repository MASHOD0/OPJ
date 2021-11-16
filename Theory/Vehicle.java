class Vehicle{
    //make of the car
    String make;
    //Model of the car 
    String model;
    //No of seats
    int seats;
    // No of wheels
    int wheels;
    
    void name(){
        System.out.println("The name of the car is : " + make + " " + model);
    }    
}

class Vehicle_main{
    public static void main(String arg[]){
        Vehicle v1 = new Vehicle();
        v1.make = "Tata";
        v1.model ="Nano";
        v1.seats =4;
        v1.wheels = 4;
        v1.name();
        
    }
}
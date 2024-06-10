package OOPs_Package.Object_composition_package;
/*
    Define a class named "Car" that represents a car.
    Create another class named "Engine" that represents the engine of the car.
    The Car class should have an instance variable of type Engine.
    Implement methods in the Car class to start the engine, stop the engine, and display the status of the engine.
    In the main method, create an object of the Car class,
    initialize its engine, and demonstrate starting and stopping the engine.
 */
class Engine{
    void startEngine(){
        System.out.println("Start the Engine");
    }
    void stopEngine(){

        System.out.println("Stop the Engine");
    }

}
class Car extends Engine{
   private Engine eng;

   Car(){
       this.eng=new Engine();
   }

   void start(){
       eng.startEngine();
   }
   void stop(){
       eng.stopEngine();
   }
}

public class Object_composition {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.start();
       car1.stop();

    }
}

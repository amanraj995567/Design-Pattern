package Structural.bridge;

public abstract class Car {
     protected Engine engine;
     public Car(Engine engine){
         this.engine=engine;
     }

     abstract void drive();
}

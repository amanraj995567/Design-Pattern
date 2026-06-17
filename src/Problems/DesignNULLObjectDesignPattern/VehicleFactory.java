package Problems.DesignNULLObjectDesignPattern;

public class VehicleFactory{

    static Vehicle getVehicleObject(String typeofVehicle){
        if("Car".equals(typeofVehicle)){
            return new Car();
        }
        return  new NullVehicle();
    }
}

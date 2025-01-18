package WithoutStrategyPattern;

public class PassengerVehicle extends Vehicle{

    @Override
    public void drive() {
        super.drive();
        System.out.println("Passenger drive capability");
    }
}

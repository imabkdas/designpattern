package WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive() {
        super.drive();
        System.out.println("sports drive capability");
    }
}

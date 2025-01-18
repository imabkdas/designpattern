package WithoutStrategyPattern;

public class GoodsVehicle extends  Vehicle{

    @Override
    public void drive() {
        super.drive();
        System.out.println("Goods Vehicle");
    }
}

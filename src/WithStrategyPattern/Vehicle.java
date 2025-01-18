package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategyObject;

    //THIS IS CONSTRUCTOR INJECTION
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategyObject = driveStrategy;
    }

    public void drive(){
        driveStrategyObject.drive();
    }
}

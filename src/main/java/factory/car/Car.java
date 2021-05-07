package factory.car;

public abstract class Car {

    private String engine;
    private String fuel;
    private int productionYear;
    private SteeringWheelPosition steeringWheelPosition;

    protected Car(String engine, String fuel, int productionYear,
                  SteeringWheelPosition steeringWheelPosition) {
        this.engine = engine;
        this.fuel = fuel;
        this.productionYear = productionYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return this.steeringWheelPosition;
    }
}

package factory.car;

public class CommonwealthFactory extends Factory {
    @Override
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMAX:
                return new Ford("1.3", "ON95", 2020, SteeringWheelPosition.LEFT);
            case Focus:
                return new Ford("1.6", "ON98", 2020, SteeringWheelPosition.LEFT);
            default:
                throw new UnsupportedOperationException("Model does not exist");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new Ford("2.1", "diesel", 2020, SteeringWheelPosition.LEFT);
            case E60:
                return new Ford("1.6", "ON98", 2020, SteeringWheelPosition.LEFT);
            default:
                throw new UnsupportedOperationException("Model does not exist");
        }
    }
}

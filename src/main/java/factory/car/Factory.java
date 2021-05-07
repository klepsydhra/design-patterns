package factory.car;

public abstract class Factory {

    public abstract Car buildFord(FordModel model);
    public abstract Car buildBMW(BMWModel model);
}

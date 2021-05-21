package templateMethod;

public class MyDay extends WeekDay {

    protected void work() {
        System.out.println("Get coffee");
    }

    public int goToWork(TypeOfTransport transport) {
        switch(transport) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }
}

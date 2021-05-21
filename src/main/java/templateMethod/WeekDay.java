package templateMethod;

public abstract class WeekDay {

    public final void everyDayIsExactlyTheSame(TypeOfTransport typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    private void goHome() {
        System.out.println("Go back home");
    }

    protected abstract void work();

    protected abstract int goToWork(TypeOfTransport transport);

    protected void summary(int time) {
        System.out.println("The way to work took: " + time + " minutes");
    }

    private void getReady() {
        System.out.println("Preparing to get out");
    }

    private void wakeUp() {
        System.out.println("Wake up");
    }
}

package memento;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Saved a backup with number: " + operatingSystemMemento.getBackupNumber() + " and date: " + operatingSystemMemento.getBackupDate());
        this.operatingSystemMemento = operatingSystemMemento;
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Loaded a backup with number: " + operatingSystemMemento.getBackupNumber() + " and date: " + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }
}

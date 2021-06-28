package memento;

import java.util.Date;

public class OperatingSystem {
    private int backupNumber = 0;
    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Created a backup with number: " + this.backupNumber + " and date: " + backupDate);
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(backupNumber, backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento) {
        backupNumber = operatingSystemMemento.getBackupNumber();
        backupDate = operatingSystemMemento.getBackupDate();
    }

}

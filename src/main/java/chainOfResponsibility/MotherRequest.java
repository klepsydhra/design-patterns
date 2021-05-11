package chainOfResponsibility;

public class MotherRequest {

    private final Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}

package chainOfResponsibility.child;

import chainOfResponsibility.MotherRequest;
import chainOfResponsibility.Shelf;

public class Tomek extends Child {

    public Tomek() {}

    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek took the jar off the shelf!");
        } else {
            getTallerChild().processRequest(request);
        }
    }
}

package chainOfResponsibility.child;

import chainOfResponsibility.MotherRequest;
import chainOfResponsibility.Shelf;

public class Ania extends Child {

    public Ania() {}

    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania took the jar off the shelf!");
        } else {
            getTallerChild().processRequest(request);
        }
    }
}

package chainOfResponsibility.child;

import chainOfResponsibility.MotherRequest;
import chainOfResponsibility.Shelf;

public class Antek extends Child {

    public Antek() {}

    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek took the jar off the shelf!");
        } else {
            System.out.println("Wrong shelf height");
        }
    }
}

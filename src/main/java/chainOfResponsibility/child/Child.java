package chainOfResponsibility.child;

import chainOfResponsibility.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public Child() {}

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    public abstract void processRequest(MotherRequest request);
}

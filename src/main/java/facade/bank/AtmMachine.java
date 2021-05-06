package facade.bank;

class AtmMachine {

    void checkBalance() {
        System.out.println("Balance checked. Current balance: $100");
    }

    void enterPin() {
        System.out.println("Pin entered");
    }

    void withdrawCash() {
        System.out.println("Cash withdrawn successfully!");
    }
}

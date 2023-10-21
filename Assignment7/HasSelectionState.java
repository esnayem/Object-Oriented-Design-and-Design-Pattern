// Concrete State 2 - HasSelectionState
// If doesn't insert money or insert money
class HasSelectionState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public HasSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Please wait, your previous selection is being processed.");
    }

    @Override
    public void insertMoney(int amount) {
        vendingMachine.amount += amount;
        System.out.println("You inserted " + amount + " TK.");
        vendingMachine.currentState = vendingMachine.soldState;
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert money first.");
    }

    @Override
    public String toString() {
        return "HasSelectionState";
    }
}
// Concrete State 1 - NoSelectionState
// If item is unavailable or does not select any item
class NoSelectionState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public NoSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        if (vendingMachine.inventory.containsKey(item)) {
            vendingMachine.selectedItem = item;
            vendingMachine.currentState = vendingMachine.hasSelectionState;
            System.out.println("You selected " + item);
        } else {
            System.out.println("Item not available.");
        }
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item first.");
    }

    @Override
    public String toString() {
        return "NoSelectionState";
    }
}

// Concrete State 3 - SoldState
// Item is sold or not 
class SoldState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Please wait, your item is being dispensed.");
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Please wait, processing your request.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Here is your " + vendingMachine.selectedItem + ". Enjoy!");
        vendingMachine.inventory.remove(vendingMachine.selectedItem);
        vendingMachine.amount -= vendingMachine.itemPrices.get(vendingMachine.selectedItem);
        vendingMachine.currentState = vendingMachine.noSelectionState;
    }

    @Override
    public String toString() {
        return "SoldState";
    }
}

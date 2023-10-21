// State interface
// The characteristics and method of vending machine
interface VendingMachineState {
    void selectItem(String item);

    void insertMoney(int amount);

    void dispenseItem();

    String toString();
}

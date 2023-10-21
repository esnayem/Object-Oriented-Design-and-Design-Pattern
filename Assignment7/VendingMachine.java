// Context - VendingMachine
// Main function where is controle the vending
// machine and its function
import java.util.HashMap;
import java.util.Map;

class VendingMachine {
    VendingMachineState noSelectionState;
    VendingMachineState hasSelectionState;
    VendingMachineState soldState;
    VendingMachineState currentState;
    String selectedItem;
    int amount;

    Map<String, Integer> inventory;
    Map<String, Integer> itemPrices;

    public VendingMachine() {
        noSelectionState = new NoSelectionState(this);
        hasSelectionState = new HasSelectionState(this);
        soldState = new SoldState(this);
        currentState = noSelectionState;
        selectedItem = null;
        amount = 0;

        inventory = new HashMap<>();
        itemPrices = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        inventory.put("Water", 5);
        inventory.put("Chips", 3);
        inventory.put("Candy", 2);

        itemPrices.put("Water", 30);
        itemPrices.put("Chips", 15);
        itemPrices.put("Candy", 25);
    }

    public void selectItem(String item) {
        currentState.selectItem(item);
    }

    public void insertMoney(int amount) {
        currentState.insertMoney(amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("\n<-----Welcome to Vending Machine!----->\n");
        System.out.println("Available items: { Water (30)}, { Chips (15)}, { Candy (25)}\n");

        vendingMachine.selectItem("Water");
        vendingMachine.insertMoney(30);
        vendingMachine.dispenseItem();

        vendingMachine.selectItem("Chips");
        vendingMachine.insertMoney(15);
        vendingMachine.dispenseItem();

        vendingMachine.selectItem("Candy");
        vendingMachine.insertMoney(25);
        vendingMachine.dispenseItem();
        System.out.println();
    }
}
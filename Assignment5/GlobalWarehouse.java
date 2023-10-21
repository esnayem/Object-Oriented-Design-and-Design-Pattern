// Real Subject - GlobalWarehouse

import java.util.HashMap;
import java.util.Map;

class GlobalWarehouse implements RetailStore {
    private Map<String, Integer> inventory;
    private Map<String, String> orderStatus;

    public GlobalWarehouse() {
        inventory = new HashMap<>();
        orderStatus = new HashMap<>();
        
        // Simulate some initial inventory
        inventory.put("Product A", 100);
        inventory.put("Product B", 50);
        inventory.put("Product C", 75);
    }

    @Override
    public void requestProduct(String product) {
        if (checkStockAvailability(product)) {
            String orderNumber = "Order" + System.currentTimeMillis();
            System.out.println("Order placed for " + product + " with Order Number: " + orderNumber);
            orderStatus.put(orderNumber, "Processing");
            shipProduct(orderNumber, product);
        } else {
            System.out.println("Sorry, " + product + " is out of stock.");
        }
    }

    @Override
    public boolean checkStockAvailability(String product) {
        return inventory.containsKey(product) && inventory.get(product) > 0;
    }
    
    @Override
    public void trackOrder(String orderNumber) {
        String status = orderStatus.get(orderNumber);
        if (status != null) {
            System.out.println("Order " + orderNumber + " is currently " + status);
        } else {
            System.out.println("Invalid order number: " + orderNumber);
        }
    }
    
    @Override
    public void shipProduct(String orderNumber, String product) {
        if (checkStockAvailability(product)) {
            System.out.println("Shipping " + product + " for order " + orderNumber);
            inventory.put(product, inventory.get(product) - 1);
            orderStatus.put(orderNumber, "Shipped");
        } else {
            orderStatus.put(orderNumber, "Out of Stock");
        }
    }
}
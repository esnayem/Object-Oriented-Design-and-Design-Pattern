// Subject interface - RetailStore
interface RetailStore {
    void requestProduct(String product);
    
    boolean checkStockAvailability(String product);
    
    void trackOrder(String orderNumber);
    
    void shipProduct(String orderNumber, String product);
}
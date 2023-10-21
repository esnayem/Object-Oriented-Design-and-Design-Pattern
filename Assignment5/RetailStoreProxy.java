// Proxy - RetailStoreProxy
class RetailStoreProxy implements RetailStore {
    private GlobalWarehouse globalWarehouse;

    public RetailStoreProxy() {
        // The proxy controls access to the real subject (GlobalWarehouse)
        globalWarehouse = new GlobalWarehouse();
    }

    @Override
    public void requestProduct(String product) {
        // Additional logic can be added here, such as tracking orders or checking regional availability.
        globalWarehouse.requestProduct(product);
    }

    @Override
    public boolean checkStockAvailability(String product) {
        return globalWarehouse.checkStockAvailability(product);
    }
    
    @Override
    public void trackOrder(String orderNumber) {
        globalWarehouse.trackOrder(orderNumber);
    }
    
    @Override
    public void shipProduct(String orderNumber, String product) {
        globalWarehouse.shipProduct(orderNumber, product);
    }
}


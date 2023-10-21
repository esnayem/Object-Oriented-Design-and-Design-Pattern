// main class control the program
public class ProxyPatternDemo {
    public static void main(String[] args) {
        RetailStore retailStore = new RetailStoreProxy();

        System.out.println();
        retailStore.requestProduct("Product A");
        System.out.println();
        retailStore.requestProduct("Product B");
        System.out.println();
        retailStore.requestProduct("Product C");
        System.out.println();
        retailStore.trackOrder("Order1635571133209");
        retailStore.trackOrder("OrderInvalid");
        System.out.println();
    }
}

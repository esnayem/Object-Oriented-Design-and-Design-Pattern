//Example for multiple inheritance using interface
// Define two interfaces
interface Car {
    void start();
    void stop();
}

interface Plane {
    void takeOff();
    void land();
}

// Create a class that demonstrates multiple inheritance
public class Vehicle implements Car, Plane {
    @Override
    public void start() {
        System.out.println("Car is starting......");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.....");
    }

    @Override
    public void takeOff() {
        System.out.println("Plane is successfully takeoff");
    }

    @Override
    public void land() {
        System.out.println("Plane is landed");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        // Demonstrate multiple inheritance
        vehicle.start();
        vehicle.stop();
        vehicle.takeOff();
        vehicle.land();
    }
}

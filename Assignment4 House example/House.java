public class House {
    public static void main(String[] args) {
        // Create building and its components
        Building building = new Building("My House");
        Floor floor1 = new Floor("First Floor");
        Floor floor2 = new Floor("Second Floor");
        Room room1 = new Room("Living Room");
        Room room2 = new Room("Kitchen");
        Wall wall1 = new Wall("North Wall", 100, 5.0); // area: 100 sq. ft, cost: $5.0/sq. ft
        Wall wall2 = new Wall("South Wall", 80, 4.5);  // area: 80 sq. ft, cost: $4.5/sq. ft

        // Compose the structure
        building.addStructure(floor1);
        building.addStructure(floor2);
        floor1.addStructure(room1);
        floor1.addStructure(room2);
        room1.addStructure(wall1);
        room2.addStructure(wall2);

        // Display the building structure
        building.display();

        // Calculate and display area and cost of the building
        System.out.println("Total Area: " + building.getArea() + " sq. ft");
        System.out.println("Total Cost: $" + building.getCost());
    }
}

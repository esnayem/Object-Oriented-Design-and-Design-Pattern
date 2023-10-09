import java.util.ArrayList;
import java.util.List;

// Composite class
class Room implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();
    public Room(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void display() {
        System.out.println("Room: " + name);
        for (HousingStructure structure : structures) {
            structure.display();
        }
    }

    @Override
    public double getArea() {
        double totalArea = 0;
        for (HousingStructure structure : structures) {
            totalArea += structure.getArea();
        }
        return totalArea;
    }

    @Override
    public double getCost() {
        double totalCost = 0;
        for (HousingStructure structure : structures) {
            totalCost += structure.getCost();
        }
        return totalCost;
    }
}

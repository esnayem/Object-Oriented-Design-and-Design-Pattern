// Leaf class
class Wall implements HousingStructure {
    private String name;
    private double area;
    private double costPerSquareFoot;

    public Wall(String name, double area, double costPerSquareFoot) {
        this.name = name;
        this.area = area;
        this.costPerSquareFoot = costPerSquareFoot;
    }

    @Override
    public void display() {
        System.out.println("Wall: " + name);
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getCost() {
        return area * costPerSquareFoot;
    }
}

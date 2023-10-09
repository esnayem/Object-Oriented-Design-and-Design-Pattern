// Leaf class representing a teacher
class Teacher implements SchoolComponent {
    private String name;
    private String employeeId;

    public Teacher(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Employee ID: " + employeeId + ", Teacher Name: " + name);
    }
}

// Leaf class representing a student
class Student implements SchoolComponent {
    private String name;
    private int studentId;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
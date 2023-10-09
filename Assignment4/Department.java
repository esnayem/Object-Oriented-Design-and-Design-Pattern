import java.util.ArrayList;
import java.util.List;

// Composite class representing a department
class Department implements SchoolComponent {
    private String departmentName;
    private List<SchoolComponent> courses = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void display() {
        System.out.println("Department: " + departmentName);
        System.out.println("Courses Offered:");
        for (SchoolComponent course : courses) {
            course.display();
        }
    }
}
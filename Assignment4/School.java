import java.util.ArrayList;
import java.util.List;

// Composite class representing a school
class School implements SchoolComponent {
    private String schoolName;
    private List<SchoolComponent> departments = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public void display() {
        System.out.println("School: " + schoolName);
        System.out.println("Departments:");
        for (SchoolComponent department : departments) {
            department.display();
        }
    }
}

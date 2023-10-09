import java.util.ArrayList;
import java.util.List;

// Composite class representing a course
class Course implements SchoolComponent {
    private String courseCode;
    private String courseName;
    private List<SchoolComponent> students = new ArrayList<>();
    private Teacher teacher;

    public Course(String courseCode, String courseName, Teacher teacher) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void display() {
        System.out.println("Course: " + courseCode + " - " + courseName);
        teacher.display();
        System.out.println("Enrolled Students:");
        for (SchoolComponent student : students) {
            student.display();
        }
    }
}
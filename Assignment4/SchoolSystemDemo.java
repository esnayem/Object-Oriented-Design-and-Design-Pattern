//Main class
public class SchoolSystemDemo {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(101, "Hridoy");
        Student student2 = new Student(102, "Mamun");

        // Create teachers
        Teacher teacher1 = new Teacher("T001", "Ms. Smith");
        Teacher teacher2 = new Teacher("T002", "Mr. Johnson");

        // Create courses and enroll students
        Course mathCourse = new Course("MATH101", "Mathematics", teacher1);
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        Course physicsCourse = new Course("PHYS101", "Physics", teacher2);
        physicsCourse.addStudent(student1);

        // Create departments and add courses
        Department mathDepartment = new Department("Mathematics Department");
        mathDepartment.addCourse(mathCourse);

        Department physicsDepartment = new Department("Physics Department");
        physicsDepartment.addCourse(physicsCourse);

        // Create a school and add departments
        School school = new School("Shekh Kamal High School");
        school.addDepartment(mathDepartment);
        school.addDepartment(physicsDepartment);

        // Display the entire school system
        school.display();
    }
}

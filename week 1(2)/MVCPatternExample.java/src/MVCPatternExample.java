// Model
class Student {

    private int id;
    private String name;
    private String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

// View
class StudentView {

    public void displayStudentDetails(Student student) {
        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("ID    : " + student.getId());
        System.out.println("Name  : " + student.getName());
        System.out.println("Grade : " + student.getGrade());
    }
}

// Controller
class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudent(String name, String grade) {
        model.setName(name);
        model.setGrade(grade);
    }

    public void displayStudent() {
        view.displayStudentDetails(model);
    }
}

// Main Class
public class MVCPatternExample {

    public static void main(String[] args) {

        Student student = new Student(101, "Sathwik", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        System.out.println("Initial Data:");
        controller.displayStudent();

        System.out.println();

        controller.updateStudent("Rahul", "A+");

        System.out.println("Updated Data:");
        controller.displayStudent();
    }
}
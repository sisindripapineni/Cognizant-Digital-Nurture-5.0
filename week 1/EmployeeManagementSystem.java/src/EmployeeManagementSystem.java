class Employee {

    private int employeeId;
    private String employeeName;
    private String position;
    private double salary;

    Employee next;

    public Employee(int employeeId, String employeeName, String position, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.position = position;
        this.salary = salary;
        this.next = null;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void display() {
        System.out.println(employeeId + " | " + employeeName + " | " + position + " | ₹" + salary);
    }
}

class EmployeeLinkedList {

    private Employee head = null;

    // Add Employee
    public void addEmployee(Employee employee) {

        if (head == null) {
            head = employee;
        } else {
            Employee temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = employee;
        }

        System.out.println("Employee Added Successfully.");
    }

    // Search Employee
    public void searchEmployee(int id) {

        Employee temp = head;

        while (temp != null) {

            if (temp.getEmployeeId() == id) {
                System.out.println("Employee Found:");
                temp.display();
                return;
            }

            temp = temp.next;
        }

        System.out.println("Employee Not Found.");
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        if (head == null) {
            return;
        }

        if (head.getEmployeeId() == id) {
            head = head.next;
            System.out.println("Employee Deleted Successfully.");
            return;
        }

        Employee prev = head;
        Employee curr = head.next;

        while (curr != null) {

            if (curr.getEmployeeId() == id) {
                prev.next = curr.next;
                System.out.println("Employee Deleted Successfully.");
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("Employee Not Found.");
    }

    // Display Employees
    public void displayEmployees() {

        Employee temp = head;

        while (temp != null) {
            temp.display();
            temp = temp.next;
        }
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addEmployee(new Employee(101, "Sathwik", "Software Engineer", 60000));
        list.addEmployee(new Employee(102, "Rahul", "Tester", 45000));
        list.addEmployee(new Employee(103, "Kiran", "Manager", 80000));

        System.out.println("\nEmployee List:");
        list.displayEmployees();

        System.out.println("\nSearching Employee 102:");
        list.searchEmployee(102);

        System.out.println("\nDeleting Employee 101:");
        list.deleteEmployee(101);

        System.out.println("\nUpdated Employee List:");
        list.displayEmployees();
    }
}
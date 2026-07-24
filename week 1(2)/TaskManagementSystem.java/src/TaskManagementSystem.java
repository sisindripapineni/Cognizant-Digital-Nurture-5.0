class Task {

    private int taskId;
    private String taskName;
    private String status;

    Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void display() {
        System.out.println(taskId + " | " + taskName + " | " + status);
    }
}

class TaskList {

    private Task head = null;

    // Add Task
    public void addTask(Task task) {

        if (head == null) {
            head = task;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = task;
        }

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.getTaskId() == id) {
                System.out.println("Task Found:");
                temp.display();
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

    // Update Task Status
    public void updateTask(int id, String status) {

        Task temp = head;

        while (temp != null) {

            if (temp.getTaskId() == id) {
                temp.setStatus(status);
                System.out.println("Task Updated Successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            return;
        }

        if (head.getTaskId() == id) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        Task prev = head;
        Task curr = head.next;

        while (curr != null) {

            if (curr.getTaskId() == id) {
                prev.next = curr.next;
                System.out.println("Task Deleted Successfully.");
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task Not Found.");
    }

    // Display Tasks
    public void displayTasks() {

        Task temp = head;

        while (temp != null) {
            temp.display();
            temp = temp.next;
        }
    }
}

public class TaskManagementSystem {

    public static void main(String[] args) {

        TaskList list = new TaskList();

        list.addTask(new Task(1, "Complete Java Assignment", "Pending"));
        list.addTask(new Task(2, "Prepare for Interview", "Pending"));
        list.addTask(new Task(3, "Submit GitHub Repository", "Pending"));

        System.out.println("\nTask List:");
        list.displayTasks();

        System.out.println("\nSearching Task 2:");
        list.searchTask(2);

        System.out.println("\nUpdating Task 2:");
        list.updateTask(2, "Completed");

        System.out.println("\nTask List After Update:");
        list.displayTasks();

        System.out.println("\nDeleting Task 1:");
        list.deleteTask(1);

        System.out.println("\nFinal Task List:");
        list.displayTasks();
    }
}
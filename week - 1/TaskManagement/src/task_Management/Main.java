package task_Management;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskRepository repo = new TaskManagerRepo();
        TaskService service = new TaskService(repo);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter you choice: 1. Add Task 2. Delete Task 3. Search Task 4. View All Tasks 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();
                    service.addTask(new Task(id, name, status));
                    break;
                case 2:
                    System.out.print("Enter ID to delete: ");
                    service.deleteTask(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    service.searchTask(sc.nextInt());
                    break;
                case 4:
                    service.viewAllTasks();
                    break;
                case 5:
                    return;
                default:
                	System.out.println("Enter valid choice");
            }
            System.out.println("Exited...");
        }
    }
}

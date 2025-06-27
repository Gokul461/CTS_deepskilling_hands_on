package task_Management;

public class TaskService {
	private TaskRepository taskrepo;
	public TaskService(TaskRepository repo) {
		this.taskrepo= repo;
	}
	public void addTask(Task task) {
        taskrepo.add(task);
        System.out.println("Task added successfully!");
    }

    public void deleteTask(int id) {
        if (taskrepo.delete(id)) {
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void searchTask(int id) {
        Task task = taskrepo.search(id);
        if (task != null) {
            System.out.println("Found: " + task);
        } else {
            System.out.println("Task not found.");
        }
    }

    public void viewAllTasks() {
        System.out.println("All Tasks:");
        taskrepo.traverse();
    }
}

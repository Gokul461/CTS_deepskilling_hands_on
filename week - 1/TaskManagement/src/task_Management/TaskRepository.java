package task_Management;

public interface TaskRepository {
	void add(Task task);
	boolean delete(int taskId);
	Task search(int taskId);
	void traverse();
}

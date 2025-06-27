package task_Management;

public class Task {
	private int taskId;
	private String taskName;
	private String taskStatus;
	
	public Task(int taskId,String taskName,String taskStatus) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
	}
	 public int getTaskId() { return taskId; }
	    public String getTaskName() { return taskName; }
	    public String getStatus() { return taskStatus; }

	    @Override
	    public String toString() {
	        return "[ID: " + taskId + ", Name: " + taskName + ", Status: " + taskStatus + "]";
	    }
	}


package task_Management;

public class TaskManagerRepo implements TaskRepository{
	private TaskNode head = null;
	@Override
	public void add(Task task) {
		TaskNode newNode = new TaskNode(task);
		if(head == null) {
			head = newNode;
		}
		else {
			TaskNode y = head;
			while(y.getNext() != null) {
				y = y.getNext();
			}
			y.setNext(newNode);
		}
	}
	@Override
	public boolean delete(int id) {
		if(head == null) {
			return false;
		}
		if(head.getTask().getTaskId() == id) {
			head = head.getNext();
			return true;
		}
		TaskNode y = head;
		while(y.getNext() != null) {
			if(y.getNext().getTask().getTaskId() == id) {
				y.setNext(y.getNext().getNext());
				return true;
			}
			y = y.getNext();
		}
		
		return false;
	}
	@Override
	public Task search(int id) {
		if(head == null) {
			return null;
		}
		TaskNode y = head;
		while(y.getNext() != null) {
			if(y.getTask().getTaskId() == id) {
				return y.getTask();
			}
			y = y.getNext();
		}
		return null;
	}
	@Override
	public void traverse() {
		 TaskNode y = head;
	        while (y != null) {
	            System.out.println(y.getTask());
	            y = y.getNext();
	        }
	}
}

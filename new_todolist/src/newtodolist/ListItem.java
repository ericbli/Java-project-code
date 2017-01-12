package newtodolist;

public class ListItem {
	
	private String task;
	private boolean  done;
	
	ListItem(String task, boolean done) {

		this.task = task;	
		this.done = done;
	}
	
	String getTask() {
		return task;
	}
	
	
	boolean isDone() {
		return done;
	}
	void setTask(String task) {
		this.task = task;
	}
	void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		if (done==false)
		return "[" + task + "][ ]";
		else
			return "[" + task + "][done]";
	}
	
		
	
	
	
	
}

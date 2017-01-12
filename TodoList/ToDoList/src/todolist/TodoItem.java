package todolist;

public class TodoItem {
    public boolean done=false;
    public String name;

    public TodoItem() {}
    public TodoItem(String newName) {
        this.name=newName;
    }

    @Override
    public String toString() {
        if (done) {
            return "[x] "+name;
        } else {
            return "[ ] "+name;
        }
    }
}

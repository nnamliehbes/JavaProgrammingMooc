import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        int i = 0;
        for (String task : this.tasks) {
            System.out.println((i+1) + ": " + task);
            i++;
        }
    }

    public void remove(int number) {
        int index = number - 1;
        this.tasks.remove(index);
    }

}

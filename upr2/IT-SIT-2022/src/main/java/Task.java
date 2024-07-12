import java.util.ArrayList;
import java.util.List;

public class Task {
    private static List<Task> tasks = new ArrayList<>();

    public static List<Task> getTasks() {
        return tasks;
    }

    public static void addTask(Task task) {
        tasks.add(task);
    }
    private String id;
    private String header;
    private String desctiption;
    private String deadline;

    public Task(String id, String header, String desctiption, String deadline) {
        this.id = id;
        this.header = header;
        this.desctiption = desctiption;
        this.deadline = deadline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}

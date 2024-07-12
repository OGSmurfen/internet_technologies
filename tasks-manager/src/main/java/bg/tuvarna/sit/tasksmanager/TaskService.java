package bg.tuvarna.sit.tasksmanager;

import java.util.List;

public interface TaskService {
    List<Task> findAllById(int number);
    List<Task> findAll();
    Task addNewTask(Task task);
    Task updateTask(Task task);
    void deleteTask();
}

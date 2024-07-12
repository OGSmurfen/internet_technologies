package bg.tuvarna.sit.tasksmanager;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksServiceImpl implements TaskService{
    private TaskRepository taskRepository;

    public TasksServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public List<Task> findAllById(int number) {
        return taskRepository.findAllById(number);
    }

    @Override
    public List<Task> findAll() {
        return findAll();
    }

    @Override
    public Task addNewTask(Task task) {
        return addNewTask(task);
    }

    @Override
    public Task updateTask(Task task) {
        return updateTask(task);
    }

    @Override
    public void deleteTask() {

    }
}

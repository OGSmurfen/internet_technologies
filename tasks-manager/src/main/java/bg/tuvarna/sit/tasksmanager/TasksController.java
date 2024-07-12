package bg.tuvarna.sit.tasksmanager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks/")
public class TasksController {
    private TaskService taskService;

    public TasksController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task t = taskService.addNewTask(task);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }
    //точки на достъп за останалите операции !!!

    @GetMapping("category/{id}")
    public ResponseEntity<List<Task>>getAllTasksById(
            @PathVariable("id") int id){
        List<Task> taskList = taskService.findAllById(id);
        return new ResponseEntity<>(taskList, HttpStatus.OK);
    }

}

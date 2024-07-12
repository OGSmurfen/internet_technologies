package bg.tuvarna.sit.tasksmanager;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
        //Обичайните методи за осъществяване на CRUD операциите се наследяват от интерфейса JpaRepository

        //потребителски метод
        List<Task> findAllById(int number);
        List<Task> findAll();
        Task addNewTask(Task task);
        Task updateTask(Task task);
        void deleteTask();
}

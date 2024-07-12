import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/tasks/add")
public class AddTaskServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Add Task</title></head><body>");
        out.println("<h1>Add Task</h1>");
        out.println("<form method='post' action='" + request.getContextPath() + "/tasks/add'>");
        out.println("ID: <input type='text' name='id'><br>");
        out.println("Header: <input type='text' name='header'><br>");
        out.println("Description: <textarea name='description'></textarea><br>");
        out.println("Deadline: <input type='text' name='deadline' placeholder='yyyy-MM-dd'><br>");
        out.println("<input type='submit' value='Add Task'>");
        out.println("</form>");
        out.println("</body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String header = request.getParameter("header");
        String description = request.getParameter("description");
        String deadlineStr = request.getParameter("deadline");

        Task task = new Task(id, header, description, deadlineStr);
        Task.addTask(task);

        System.out.print("Printing task:\nid: " + task.getId() + "\nheader: " + task.getHeader()
                + "\ndescription: "+ task.getDesctiption() + "\ndeadline: " + task.getDeadline());
        // В този момент може да добавите task към колекцията си или да използвате друг механизъм за съхранение
        // Пример: tasks.add(task);
    }
}


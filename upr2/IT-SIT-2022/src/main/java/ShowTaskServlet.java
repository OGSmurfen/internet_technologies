import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/tasks/view")
public class ShowTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        List<Task> taskList = Task.getTasks();
        Task task = taskList.get(0);
        System.out.print("\n\nSHOWTASKSERVLET Printing task:\nid: " + task.getId() + "\nheader: " + task.getHeader()
                + "\ndescription: "+ task.getDesctiption() + "\ndeadline: " + task.getDeadline());
    }
}

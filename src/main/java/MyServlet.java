
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // Отримати параметри ім'я та настрій
        String name = req.getParameter("name");
        String mood = req.getParameter("mood");
        String place = req.getHeader("place");

        if (name != null && mood != null && place != null) {
            resp.setContentType("text/plain");
            PrintWriter out = resp.getWriter();
            out.println("Hi " + name + " from " + place + ", you are feeling " + mood);
            out.close();
        } else {
            resp.setContentType("text/plain");
            PrintWriter out = resp.getWriter();
            out.println("Hello, please enter your name, mood and place");
            out.close();
        }
    }

}

package sda.sapiens.journal.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "menu-servlet", value = "/journal")
public class MenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // dodaliśmy na końcu zajęć
        HttpSession session = req.getSession();
        List<String> history = new ArrayList<>();
        history.add("journal");
        session.setAttribute("visited", history);

        getServletContext().getRequestDispatcher("/menu.jsp").forward(req, resp);
        // klikamy na katalog webapp i tworzymy new JSP file o nazwie menu
    }
}

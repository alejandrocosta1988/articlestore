package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DownloadServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		if (action == null) {
			action = "viewCategories"; //default action
		}
		
		String url = "/index.jsp";
		if (action.equals("viewCategories")) {
			url = "/index.jsp";
		} else if (action.equals("checkUser")) {
			url = checkUser(request, response);
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}
	
	private String checkUser(HttpServletRequest request, HttpServletResponse response) {
		
		return "/register.jsp";
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package servlets;

import java.io.IOException;

import data.UserIO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;
import util.CookieUtil;

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
		
		String productCode = request.getParameter("productCode");
		
		HttpSession session = request.getSession();
		session.setAttribute("productCode", productCode);

		String url = "";
		
		User user = (User) session.getAttribute("user");
		
		if (user == null) {
			
			Cookie[] cookies = request.getCookies();
			String emailAddress = CookieUtil.getCookieValue(cookies, "emailCookie");
			
			if (emailAddress == null || emailAddress.isEmpty()) {
				url = "/register.jsp";
			} else {
				ServletContext sc = getServletContext();
				String path = sc.getRealPath("/WEB-INF/EmailList.txt");
				user = UserIO.getUser(emailAddress, path);
				session.setAttribute("user", user);
				url = "/" + productCode + "_download.jsp";
			}
			
		} else {
			url = "/" + productCode + "_download.jsp";
		}
		
		return url;
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

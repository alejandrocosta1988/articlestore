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
		
		String action = request.getParameter("action");
		String url = "/index.jsp";
		
		if (action.equals("registerUser")) {
			url = registerUser(request, response);
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}
	
	private String registerUser(HttpServletRequest request, HttpServletResponse response) {
		
		String email = request.getParameter("email");
		String firstName = request.getParameter("first-name");
		String lastName = request.getParameter("last-name");
		
		User user = new User(firstName, lastName, email);
		
		ServletContext sc = getServletContext();
		String path = sc.getRealPath("/WEB-INF/EmailList.txt");
		UserIO.add(user, path);
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		Cookie cookie = new Cookie("emailCookie", email);
		cookie.setMaxAge(60 * 60 * 24 * 365 * 2); //cookie será armazenado no navegador do cliente por dois anos
		cookie.setPath("/"); //cookie acessível para toda a aplicação
		response.addCookie(cookie);
		
		String productCode = (String) session.getAttribute("productCode");
		String url = "/" + productCode + "_download.jsp";
		
		return url;
	}

}

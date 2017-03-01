package it4kids.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		String username = req.getParameter("userName");
		String password = req.getParameter("password");

		if (userDAO.authenticateUser(username, password)) {
			req.setAttribute("userid", username);
			req.getRequestDispatcher("success.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("invalidPassword.jsp").forward(req, resp);
		}
	}
}

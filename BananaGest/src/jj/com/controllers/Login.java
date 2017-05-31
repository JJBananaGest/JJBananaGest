package jj.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();
		if (misession.getAttribute("idUsuario") != null) {
			request.getRequestDispatcher("/proyectos").forward(request, response);
			;
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("inicio.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// autentificacion de usuario
		if (email.equals("aura@mail.com") && password.equals("aura369")) {
			HttpSession misession = (HttpSession) request.getSession();
			misession.setAttribute("id", "aura@mail.com");
			request.getRequestDispatcher("/proyectos").forward(request, response);
		} else {

			request.setAttribute("mierror", "Email o contraseña erroneos");
			doGet(request, response);
		}
		
	}

}

package com.netmind.controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// metodo doGet()
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = (HttpSession)request.getSession();
		if(misession.getAttribute("idUsuario")!=null){
			request.getRequestDispatcher("/listamaquillajes").forward(request, response);;
		}else{
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		}
	}

	// metodo doPost()
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// autentificacion de usuario
		if (email.equals("miemail@mail.com") && password.equals("mipass") ) {
			HttpSession misession = (HttpSession)request.getSession();
			misession.setAttribute("idUsuario", "miemail@mail.com");
			request.getRequestDispatcher("/listamaquillajes").forward(request, response);;
		} else {
			
			request.setAttribute("mierror", "Email o contraseña erroneos");
			doGet(request, response);
		}

	}

}

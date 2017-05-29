package com.netmind.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.netmind.models.Maquillaje;

@WebServlet("/listamaquillajes")
public class ListaMaquillajesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = (HttpSession)request.getSession();
		String idUsuario = (String)misession.getAttribute("idUsuario");
		
		if(misession.getAttribute("idUsuario")!=null){
			Maquillaje[] listaMaquillajes = {
					new Maquillaje("Max Factor", "labios", 10),
					new Maquillaje("lOreal", "cabello", 20),
					new Maquillaje("Esteer Lauder", "ojos", 30),
			};
		
		request.setAttribute("listaMaquillajesAMostrar", listaMaquillajes);
		
		request.getRequestDispatcher("listamaquillajes.jsp").forward(request, response);
		
		}else{
			misession.invalidate();
			response.sendRedirect("login");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

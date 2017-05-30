package jj.com.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banana.com.models.Proyecto;
import banana.com.models.Tarea;

@WebServlet("/ListaProyectos")
public class ListaProyectos extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListaProyectos() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Tarea tareas1 = new Tarea(null, null, null, null, null, null);
		List<Tarea> tareas2 = new List<Tarea>;
		Proyecto p1 = new Proyecto(1, "ibermatica", "descriipcion", "12/08/2016", "Joan", tareas1);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

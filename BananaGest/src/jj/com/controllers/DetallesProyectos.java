package jj.com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import banana.com.models.Proyecto;
import banana.com.models.Tarea;

@WebServlet("/detalles")
public class DetallesProyectos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DetallesProyectos() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();

		// TAREAS AURA:
		// Tareas P1 Aura
		List<Tarea> listaTareasAuraP1 = new ArrayList<Tarea>();
		listaTareasAuraP1.add(new Tarea("descripción", "notas", "01/03/2016", "07/07/2017", "Aura", "Activa"));
		listaTareasAuraP1.add(new Tarea("descripción", "notas", "07/12/2016", "01/08/2017", "Aura", "Activa"));
		listaTareasAuraP1.add(new Tarea("descripción", "notas", "01/03/2016", "22/04/2017", "Aura", "Finalizada"));
		// Proyecto 1 de Aura
		Proyecto pA1 = new Proyecto(1, "ibermatica", "descripción", "10/07/2017", "Aura", "Activo", listaTareasAuraP1);

		request.setAttribute("listaDetallesAMostrar", pA1);
		// ##########################################################################################################################

		// Tareas P2 Aura
		List<Tarea> listaTareasAuraP2 = new ArrayList<Tarea>();
		listaTareasAuraP2.add(new Tarea("descripción", "notas", "02/04/2017", "13/01/2018", "Aura", "Activa"));
		listaTareasAuraP2.add(new Tarea("descripción", "notas", "20/07/2016", "30/01/2018", "Aura", "Activa"));
		listaTareasAuraP2.add(new Tarea("descripción", "notas", "01/10/2016", "23/06/2017", "Aura", "Activa"));
		listaTareasAuraP2.add(new Tarea("descripción", "notas", "11/06/2016", "17/09/2017", "Aura", "Activa"));
		listaTareasAuraP2.add(new Tarea("descripción", "notas", "03/05/2016", "07/01/2017", "Aura", "Finalizada"));
		// Proyecto 2 de Aura
		Proyecto pA2 = new Proyecto(2, "multiplataforma", "descripción", "01/02/2018", "Aura", "Activo",
				listaTareasAuraP2);

		request.setAttribute("listaDetallesAMostrar", pA2);
		// ##########################################################################################################################

		// Tareas P3 Aura
		List<Tarea> listaTareasAuraP3 = new ArrayList<Tarea>();
		listaTareasAuraP3.add(new Tarea("descripción", "notas", "01/03/2016", "11/03/2017", "Aura", "Finalizada"));
		listaTareasAuraP3.add(new Tarea("descripción", "notas", "01/12/2016", "01/01/2017", "Aura", "Finalizada"));
		// Proyecto 3 de Aura
		Proyecto pA3 = new Proyecto(3, "visual", "descripción", "15/03/2017", "Aura", "Finalizado", listaTareasAuraP3);

		request.setAttribute("listaDetallesAMostrar", pA3);
		// ##########################################################################################################################

		// Tareas P4 Aura
		List<Tarea> listaTareasAuraP4 = new ArrayList<Tarea>();
		listaTareasAuraP4.add(new Tarea("descripción", "notas", "21/11/2016", "21/06/2017", "Aura", "Activa"));
		listaTareasAuraP4.add(new Tarea("descripción", "notas", "21/11/2016", "01/02/2017", "Aura", "Finalizada"));
		listaTareasAuraP4.add(new Tarea("descripción", "notas", "21/11/2016", "16/03/2017", "Aura", "Finalizada"));
		// Proyecto 4 de Aura
		Proyecto pA4 = new Proyecto(4, "ventas", "descripción", "22/06/2017", "Aura", "Activo", listaTareasAuraP4);

		request.setAttribute("listaDetallesAMostrar", pA4);
		// ##########################################################################################################################
		// ##########################################################################################################################

		// TAREAS LUIS
		// Tareas P1 Luis
		List<Tarea> listaTareasLuisP1 = new ArrayList<Tarea>();
		listaTareasLuisP1.add(new Tarea("descripción", "notas", "27/09/2016", "07/07/2017", "Luis", "Activa"));
		listaTareasLuisP1.add(new Tarea("descripción", "notas", "29/08/2016", "10/09/2017", "Luis", "Activa"));
		listaTareasLuisP1.add(new Tarea("descripción", "notas", "12/10/2016", "12/01/2017", "Luis", "Finalizada"));
		listaTareasLuisP1.add(new Tarea("descripción", "notas", "12/10/2016", "15/01/2017", "Luis", "Finalizada"));
		// Proyecto 1 de Luis
		Proyecto pL1 = new Proyecto(5, "marketing", "descripción", "12/09/2017", "Luis", "Activo", listaTareasLuisP1);

		request.setAttribute("listaDetallesAMostrar", pL1);
		// ##########################################################################################################################

		// Tareas P2 Luis
		List<Tarea> listaTareasLuisP2 = new ArrayList<Tarea>();
		listaTareasLuisP2.add(new Tarea("descripción", "notas", "25/11/2016", "10/07/2017", "Luis", "Activa"));
		listaTareasLuisP2.add(new Tarea("descripción", "notas", "21/12/2016", "12/06/2017", "Luis", "Activa"));
		listaTareasLuisP2.add(new Tarea("descripción", "notas", "28/11/2016", "01/08/2017", "Luis", "Activa"));
		// Proyecto 2 de Luis
		Proyecto pL2 = new Proyecto(6, "becarios", "descripción", "05/08/2017", "Luis", "Activo", listaTareasLuisP2);

		request.setAttribute("listaDetallesAMostrar", pL2);
		// ##########################################################################################################################

		// Tareas P3 Luis
		List<Tarea> listaTareasLuisP3 = new ArrayList<Tarea>();
		listaTareasLuisP3.add(new Tarea("descripción", "notas", "21/08/2016", "11/11/2017", "Luis", "Activa"));
		listaTareasLuisP3.add(new Tarea("descripción", "notas", "17/08/2016", "13/10/2017", "Luis", "Activa"));
		listaTareasLuisP3.add(new Tarea("descripción", "notas", "12/08/2016", "12/11/2017", "Luis", "Activa"));
		listaTareasLuisP3.add(new Tarea("descripción", "notas", "14/09/2016", "07/02/2017", "Luis", "Finalizada"));
		// Proyecto 3 de Luis
		Proyecto pL3 = new Proyecto(7, "cursos", "descripción", "15/11/2017", "Luis", "Activo", listaTareasLuisP3);

		request.setAttribute("listaTareasAMostrar", pL3);
		// ##########################################################################################################################

		// Tareas P4 Luis
		List<Tarea> listaTareasLuisP4 = new ArrayList<Tarea>();
		listaTareasLuisP4.add(new Tarea("descripción", "notas", "19/07/2016", "25/03/2017", "Luis", "Finalizada"));
		listaTareasLuisP4.add(new Tarea("descripción", "notas", "19/07/2016", "23/03/2017", "Luis", "Finalizada"));
		listaTareasLuisP4.add(new Tarea("descripción", "notas", "18/09/2016", "12/02/2017", "Luis", "Finalizada"));
		listaTareasLuisP4.add(new Tarea("descripción", "notas", "22/10/2016", "03/03/2017", "Luis", "Finalizada"));
		// Proyecto 4 de Luis
		Proyecto pL4 = new Proyecto(8, "tomarCafe", "descripción", "30/03/2017", "Luis", "Finalizado",
				listaTareasLuisP4);

		request.setAttribute("listaDetallesAMostrar", pL4);
		// ##########################################################################################################################

		// Tareas P5 Luis
		List<Tarea> listaTareasLuisP5 = new ArrayList<Tarea>();
		listaTareasLuisP5.add(new Tarea("descripción", "notas", "01/09/2016", "22/07/2017", "Luis", "Activa"));
		listaTareasLuisP5.add(new Tarea("descripción", "notas", "12/09/2016", "17/06/2017", "Luis", "Activa"));
		listaTareasLuisP5.add(new Tarea("descripción", "notas", "25/08/2016", "30/07/2017", "Luis", "Activa"));
		listaTareasLuisP5.add(new Tarea("descripción", "notas", "22/01/2017", "23/08/2017", "Luis", "Activa"));
		// Proyecto 5 de Luis
		Proyecto pL5 = new Proyecto(9, "inauguracion", "descripción", "25/08/2017", "Luis", "Activo",
				listaTareasLuisP5);

		request.setAttribute("listaDetallesAMostrar", pL5);
		// ##########################################################################################################################
		// ##########################################################################################################################

		// TAREAS ANASTASIO
		// Tareas P1 Anastasio
		List<Tarea> listaTareasAnastasioP1 = new ArrayList<Tarea>();
		listaTareasAnastasioP1
				.add(new Tarea("descripción", "notas", "22/12/2016", "27/06/2017", "Anastasio", "Activa"));
		// Proyecto 1 de Anastasio
		Proyecto pAn1 = new Proyecto(10, "oposiciones", "descripción", "01/08/2017", "Luis", "Activo",
				listaTareasAnastasioP1);

		request.setAttribute("listaDetallesAMostrar", pAn1);
		// ##########################################################################################################################

		// Tareas P2 Anastasio
		List<Tarea> listaTareasAnastasioP2 = new ArrayList<Tarea>();
		listaTareasAnastasioP2
				.add(new Tarea("descripción", "notas", "14/09/2016", "13/09/2017", "Anastasio", "Activa"));
		listaTareasAnastasioP2
				.add(new Tarea("descripción", "notas", "01/02/2017", "17/09/2017", "Anastasio", "Activa"));
		listaTareasAnastasioP2
				.add(new Tarea("descripción", "notas", "13/02/2017", "15/02/2017", "Anastasio", "Finalizada"));
		// Proyecto 2 de Anastasio
		Proyecto pAn2 = new Proyecto(11, "votos", "descripción", "25/09/2017", "Luis", "Activo",
				listaTareasAnastasioP2);

		request.setAttribute("listaDetallesAMostrar", pAn2);
		// ##########################################################################################################################

		// Tareas P3 Anastasio
		List<Tarea> listaTareasAnastasioP3 = new ArrayList<Tarea>();
		listaTareasAnastasioP3
				.add(new Tarea("descripción", "notas", "22/11/2016", "21/09/2017", "Anastasio", "Activa"));
		listaTareasAnastasioP3
				.add(new Tarea("descripción", "notas", "12/12/2016", "12/03/2017", "Anastasio", "Finalizada"));
		listaTareasAnastasioP3
				.add(new Tarea("descripción", "notas", "01/01/2016", "13/03/2017", "Anastasio", "Finalizada"));
		listaTareasAnastasioP3
				.add(new Tarea("descripción", "notas", "01/01/2016", "14/03/2017", "Anastasio", "Finalizada"));
		// Proyecto 3 de Anastasio
		Proyecto pAn3 = new Proyecto(12, "loteria", "descripción", "25/09/2017", "Luis", "Activo",
				listaTareasAnastasioP3);

		// ##########################################################################################################################
		// ##########################################################################################################################
		/*
		 * String idUsuario = (String) misession.getAttribute("id"); String
		 * idProyecto = (String) Proyecto.getAttribute("id"); Proyecto
		 * listaDUsuario = new Proyecto(0, null, null, null, null, null, new
		 * ArrayList<Tarea>());
		 * 
		 * if (idUsuario.equals("aura@mail.com") && ) {
		 * 
		 * }
		 */

		Proyecto detallesProyectoAMostrar = pAn3;

		request.setAttribute("detallesProyectoAMostrar", detallesProyectoAMostrar);
		request.getRequestDispatcher("detallesProyecto.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

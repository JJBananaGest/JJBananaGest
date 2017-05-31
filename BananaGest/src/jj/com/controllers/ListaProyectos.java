package jj.com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banana.com.models.Proyecto;
import banana.com.models.Tarea;

@WebServlet("/proyectos")
public class ListaProyectos extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListaProyectos() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Proyecto 1 de Aura
		List<Tarea> listaTareasAuraP1 = new ArrayList<Tarea>();
		listaTareasAuraP1.add( new Tarea("descripción", "notas", "01/03/2016", "07/07/2017", "Aura", "Activa") );
		listaTareasAuraP1.add( new Tarea("descripción", "notas", "07/12/2016", "01/08/2017", "Aura", "Activa") );
		listaTareasAuraP1.add( new Tarea("descripción", "notas", "01/03/2016", "22/04/2017", "Aura", "Finalizada") );
		
		Proyecto pA1 = new Proyecto(1, "ibermatica", "descripción", "10/07/2017", "Aura","Activo", listaTareasAuraP1);
		
		//Proyecto 2 de Aura
		List<Tarea> listaTareasAuraP2 = new ArrayList<Tarea>();
		listaTareasAuraP2.add( new Tarea("descripción", "notas", "02/04/2017", "13/01/2018", "Aura", "Activa") );
		listaTareasAuraP2.add( new Tarea("descripción", "notas", "20/07/2016", "30/01/2018", "Aura", "Activa") );
		listaTareasAuraP2.add( new Tarea("descripción", "notas", "01/10/2016", "23/06/2017", "Aura", "Activa") );
		listaTareasAuraP2.add( new Tarea("descripción", "notas", "11/06/2016", "17/09/2017", "Aura", "Activa") );
		listaTareasAuraP2.add( new Tarea("descripción", "notas", "03/05/2016", "07/01/2017", "Aura", "Finalizada") );
		
		Proyecto pA2 = new Proyecto(1, "multiplataforma", "descripción", "01/02/2018", "Aura", "Activo", listaTareasAuraP2);
		
		//Proyecto 3 de Aura
		List<Tarea> listaTareasAuraP3 = new ArrayList<Tarea>();
		listaTareasAuraP3.add( new Tarea("descripción", "notas", "01/03/2016", "11/03/2017", "Aura", "Finalizada") );
		listaTareasAuraP3.add( new Tarea("descripción", "notas", "01/12/2016", "01/01/2017", "Aura", "Finalizada") );
		
		Proyecto pA3 = new Proyecto(1, "visual", "descripción", "15/03/2017", "Aura", "Finalizado", listaTareasAuraP3);
		
		//Proyecto 4 de Aura
		List<Tarea> listaTareasAuraP4 = new ArrayList<Tarea>();
		listaTareasAuraP4.add( new Tarea("descripción", "notas", "21/11/2016", "21/06/2017", "Aura", "Activa") );
		listaTareasAuraP4.add( new Tarea("descripción", "notas", "21/11/2016", "01/02/2017", "Aura", "Finalizada") );
		listaTareasAuraP4.add( new Tarea("descripción", "notas", "21/11/2016", "16/03/2017", "Aura", "Finalizada") );
		
		Proyecto pA4 = new Proyecto(1, "ventas", "descripción", "22/06/2017", "Aura", "Activo", listaTareasAuraP4);
		
		//Proyecto 1 de Luis
		List<Tarea> listaTareasLuisP1 = new ArrayList<Tarea>();
		listaTareasLuisP1.add( new Tarea("descripción", "notas", "27/09/2016", "07/07/2017", "Luis", "Activa") );
		listaTareasLuisP1.add( new Tarea("descripción", "notas", "29/08/2016", "10/09/2017", "Luis", "Activa") );
		listaTareasLuisP1.add( new Tarea("descripción", "notas", "12/10/2016", "12/01/2017", "Luis", "Finalizada") );
		listaTareasLuisP1.add( new Tarea("descripción", "notas", "12/10/2016", "15/01/2017", "Luis", "Finalizada") );
		
		Proyecto pL1 = new Proyecto(1, "marketing", "descripción", "12/09/2017", "Luis", "Activo", listaTareasLuisP1);
		
		//Proyecto 2 de Luis
		List<Tarea> listaTareasLuisP2 = new ArrayList<Tarea>();
		listaTareasLuisP2.add( new Tarea("descripción", "notas", "25/11/2016", "10/07/2017", "Luis", "Activa") );
		listaTareasLuisP2.add( new Tarea("descripción", "notas", "21/12/2016", "12/06/2017", "Luis", "Activa") );
		listaTareasLuisP2.add( new Tarea("descripción", "notas", "28/11/2016", "01/08/2017", "Luis", "Activa") );
		
		Proyecto pL2 = new Proyecto(1, "becarios", "descripción", "05/08/2017", "Luis", "Activo", listaTareasLuisP2);
		
		//Proyecto 3 de Luis
		List<Tarea> listaTareasLuisP3 = new ArrayList<Tarea>();
		listaTareasLuisP3.add( new Tarea("descripción", "notas", "21/08/2016", "11/11/2017", "Luis", "Activa") );
		listaTareasLuisP3.add( new Tarea("descripción", "notas", "17/08/2016", "13/10/2017", "Luis", "Activa") );
		listaTareasLuisP3.add( new Tarea("descripción", "notas", "12/08/2016", "12/11/2017", "Luis", "Activa") );
		listaTareasLuisP3.add( new Tarea("descripción", "notas", "14/09/2016", "07/02/2017", "Luis", "Finalizada") );
		
		Proyecto pL3 = new Proyecto(1, "cursos", "descripción", "15/11/2017", "Luis", "Activo", listaTareasLuisP3);
		
		//Proyecto 4 de Luis
		List<Tarea> listaTareasLuisP4 = new ArrayList<Tarea>();
		listaTareasLuisP4.add( new Tarea("descripción", "notas", "19/07/2016", "25/03/2017", "Luis", "Finalizada") );
		listaTareasLuisP4.add( new Tarea("descripción", "notas", "19/07/2016", "23/03/2017", "Luis", "Finalizada") );
		listaTareasLuisP4.add( new Tarea("descripción", "notas", "18/09/2016", "12/02/2017", "Luis", "Finalizada") );
		listaTareasLuisP4.add( new Tarea("descripción", "notas", "22/10/2016", "03/03/2017", "Luis", "Finalizada") );
		
		Proyecto pL4 = new Proyecto(1, "tomarCafe", "descripción", "30/03/2017", "Luis", "Finalizado",listaTareasLuisP4);
		
		//Proyecto 5 de Luis
		List<Tarea> listaTareasLuisP5 = new ArrayList<Tarea>();
		listaTareasLuisP5.add( new Tarea("descripción", "notas", "01/09/2016", "22/07/2017", "Luis", "Activa") );
		listaTareasLuisP5.add( new Tarea("descripción", "notas", "12/09/2016", "17/06/2017", "Luis", "Activa") );
		listaTareasLuisP5.add( new Tarea("descripción", "notas", "25/08/2016", "30/07/2017", "Luis", "Activa") );
		listaTareasLuisP5.add( new Tarea("descripción", "notas", "22/01/2017", "23/08/2017", "Luis", "Activa") );
		
		Proyecto pL5 = new Proyecto(1, "inauguracion", "descripción", "25/08/2017", "Luis", "Activo", listaTareasLuisP5);
		
		//Proyecto 1 de Anastasio
		List<Tarea> listaTareasAnastasioP1 = new ArrayList<Tarea>();
		listaTareasAnastasioP1.add( new Tarea("descripción", "notas", "22/12/2016", "27/06/2017", "Anastasio", "Activa") );
		
		Proyecto pAn1 = new Proyecto(1, "oposiciones", "descripción", "01/08/2017", "Luis", "Activo", listaTareasAnastasioP1);
		
		//Proyecto 2 de Anastasio
		List<Tarea> listaTareasAnastasioP2 = new ArrayList<Tarea>();
		listaTareasAnastasioP2.add( new Tarea("descripción", "notas", "14/09/2016", "13/09/2017", "Anastasio", "Activa") );
		listaTareasAnastasioP2.add( new Tarea("descripción", "notas", "01/02/2017", "17/09/2017", "Anastasio", "Activa") );
		listaTareasAnastasioP2.add( new Tarea("descripción", "notas", "13/02/2017", "15/02/2017", "Anastasio", "Finalizada") );
		
		Proyecto pAn2 = new Proyecto(1, "votos", "descripción", "25/09/2017", "Luis", "Activo", listaTareasAnastasioP2);
		
		//Proyecto 3 de Anastasio
		List<Tarea> listaTareasAnastasioP3 = new ArrayList<Tarea>();
		listaTareasAnastasioP3.add( new Tarea("descripción", "notas", "22/11/2016", "21/09/2017", "Anastasio", "Activa") );
		listaTareasAnastasioP3.add( new Tarea("descripción", "notas", "12/12/2016", "12/03/2017", "Anastasio", "Finalizada") );
		listaTareasAnastasioP3.add( new Tarea("descripción", "notas", "01/01/2016", "13/03/2017", "Anastasio", "Finalizada") );
		listaTareasAnastasioP3.add( new Tarea("descripción", "notas", "01/01/2016", "14/03/2017", "Anastasio", "Finalizada") );
		
		Proyecto pAn3 = new Proyecto(1, "loteria", "descripción", "25/09/2017", "Luis", "Activo", listaTareasAnastasioP3);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

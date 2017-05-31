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
		
		//Proyectos Aura
		List<Proyecto> listaProyectosAura = new ArrayList <Proyecto>();
		listaProyectosAura.add( new Proyecto(1,"ibermatica","descripci�n","10/07/2017","Aura","Activo",null) );
		listaProyectosAura.add( new Proyecto(2,"multiplataforma","descripci�n","01/02/2018","Aura","Activo",null) );
		listaProyectosAura.add( new Proyecto(3,"visual","descripci�n","15/03/2017","Aura","Finalizado",null) );
		listaProyectosAura.add( new Proyecto(4,"ventas","descripci�n","22/06/2017","Aura","Activo",null) );
		
		//Proyectos Luis
		List<Proyecto> listaProyectosLuis = new ArrayList <Proyecto>();
		listaProyectosLuis.add( new Proyecto(5,"marketing","descripci�n","12/09/2017","Luis","Activo",null) );
		listaProyectosLuis.add( new Proyecto(6,"becarios","descripci�n","05/08/2017","Luis","Activo",null) );
		listaProyectosLuis.add( new Proyecto(7,"cursos","descripci�n","15/11/2017","Luis","Activo",null) );
		listaProyectosLuis.add( new Proyecto(8,"tomarCafe","descripci�n","30/03/2017","Luis","Finalizado",null) );
		listaProyectosLuis.add( new Proyecto(9,"inauguracion","descripci�n","25/08/2017","Luis","Activo",null) );
		
		//Proyectos Anastasio
		List<Proyecto> listaProyectosAnastasio = new ArrayList <Proyecto>();
		listaProyectosAnastasio.add( new Proyecto(10,"oposiciones","descripci�n","01/08/2017","Anastasio","Activo",null) );
		listaProyectosAnastasio.add( new Proyecto(11,"votos","descripci�n","25/09/2017","Anastasio","Activo",null) );
		listaProyectosAnastasio.add( new Proyecto(12,"loteria","descripci�n","25/09/2017","Anastasio","Activo",null) );
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

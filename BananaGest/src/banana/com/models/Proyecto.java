package banana.com.models;

import java.util.List;

public class Proyecto {
	int id;
	String titulo;
	String descripcion;
	String fechaF;
	String responsable;
	String estado;
	public List<Tarea> ListaDeTareas;
	public Proyecto(int id, String titulo, String descripcion, String fechaF, String responsable, String estado,
			List<Tarea> listaDeTareas) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaF = fechaF;
		this.responsable = responsable;
		this.estado = estado;
		ListaDeTareas = listaDeTareas;
	}
	
}

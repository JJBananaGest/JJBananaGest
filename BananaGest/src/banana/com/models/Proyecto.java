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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaF() {
		return fechaF;
	}

	public void setFechaF(String fechaF) {
		this.fechaF = fechaF;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Tarea> getListaDeTareas() {
		return ListaDeTareas;
	}

	public void setListaDeTareas(List<Tarea> listaDeTareas) {
		ListaDeTareas = listaDeTareas;
	}

	public static String getAttribute(String string) {
		return null;
	}

}

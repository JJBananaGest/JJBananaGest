package banana.com.models;

public class Tarea {
	String descripcion;
	String notas;
	String fechaI;
	String fechaF;
	String responsable;
	String estado;
	public Tarea(String descripcion, String notas, String fechaI, String fechaF, String responsable,  String estado) {
		super();
		this.descripcion = descripcion;
		this.notas = notas;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
		this.responsable = responsable;
		this.estado = estado;
	}
	
	
}

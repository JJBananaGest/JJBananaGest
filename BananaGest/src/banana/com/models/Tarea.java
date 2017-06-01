package banana.com.models;

public class Tarea {
	String descripcion;
	String notas;
	String fechaI;
	String fechaF;
	String responsable;
	String estado;

	public Tarea(String descripcion, String notas, String fechaI, String fechaF, String responsable, String estado) {
		this.descripcion = descripcion;
		this.notas = notas;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
		this.responsable = responsable;
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getFechaI() {
		return fechaI;
	}

	public void setFechaI(String fechaI) {
		this.fechaI = fechaI;
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

}

package com.netmind.models;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private int gradoCoqueteria;
	private List<Maquillaje> listaDeCosmetico;
	
	public Persona(){
		this.listaDeCosmetico = new ArrayList<Maquillaje>();
	}
	
	public List<Maquillaje> coleccionarCosmetico(Maquillaje unCosmetico){
		this.listaDeCosmetico.add(unCosmetico);
		return this.listaDeCosmetico;
	}

	public void checkCosmeticos() {
		for (Maquillaje maquillaje : this.listaDeCosmetico){
			System.out.println(maquillaje.showData());
		}
		
	}

	public double pagar() {
		double precioPagado = 0;
		for (Maquillaje maquillaje : this.listaDeCosmetico){
			precioPagado += maquillaje.getPrecio();
		}
		return precioPagado;
	}

	public int getGradoCoqueteria() {
		return gradoCoqueteria;
	}

	public void setGradoCoqueteria(int gradoCoqueteria) {
		this.gradoCoqueteria = gradoCoqueteria;
	}

}

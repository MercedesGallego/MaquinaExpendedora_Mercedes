package com.curso.maquinarefresco;

public class Refresco {
	//Atributos
	private String tipo;
	private double precio;
	private int stock;
	
	//Constructor
	public Refresco(String tipo, double precio, int stock) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.stock = stock;
	}
	//Metodos
	
	
		
	public String getTipo() {
		return tipo;
	}


	public double getPrecio() {
		return precio;
	}



	public int getStock() {
		return stock;
	}
	
	public void entrega() {
		if(this.stock>0) {
			this.stock--;
			
		}
		}
	public void reponer(int cantidad) {
		this.stock+=cantidad; 
		
	}
	@Override
	public String toString() {
		return "Refresco [tipo=" + tipo + ", precio=" + precio + ", stock=" + stock + "]";
	}



	



	
	
	
	


}

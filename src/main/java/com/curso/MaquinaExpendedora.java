package com.curso;

public class MaquinaExpendedora {
	//Atributos
	private double cambio;
	private double recaudacion;
	private int cantidadVendida;
	private Refresco refresco;
	
	//Constructor
	public MaquinaExpendedora(double recaudacion, Refresco refresco) {
		super();
		this.cambio = 0.0;
		this.cantidadVendida = 0;
		this.recaudacion = recaudacion;
		this.refresco = refresco;
	}

	//Metodos
	
	/*El metodo que vende un un refresco
	 * Introducir el dinero en la maquina
	 * comprobar que es positivo
	 * comprobar que hay stock
	 * comprobar que hay cambio
	 * dar cantidad vendida, cambio y recaudacion 
	 */
	
	public double vender (double introDinero) {
		
		if(introDinero>0) {
			if(refresco.getStock()==0) {//Agotado
			return -1; 
		}
			if(this.recaudacion<(introDinero-refresco.getPrecio())) {//Sin cambios
			return -2;
			
			}
			if(introDinero<refresco.getPrecio()) {//Dinero insuficiente
				return-3;
			}
		//Refresco conseguido 	
		this.recaudacion=this.recaudacion+refresco.getPrecio();		
		this.cantidadVendida++;
		this.cambio=introDinero-refresco.getPrecio();
		this.refresco.entrega();
		}
		
			
		return this.cambio;
		
	}

	public double getCambio() {
		return this.cambio;
	}

	
	public double getRecaudacion() {
		return this.recaudacion;
	}

	

	public int getCantidadVendida() {
		return this.cantidadVendida;
	}

	
	public int getRefresco() {
		return this.refresco.getStock();
	}

	@Override
	public String toString() {
		return "MaquinaExpendedora [cambio=" + cambio + ", recaudacion=" + recaudacion + ", cantidadVendida="
				+ cantidadVendida + ", refresco=" + refresco + "]";
	}




	

	
	
	
	
	
	

}

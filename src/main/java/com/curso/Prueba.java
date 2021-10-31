package com.curso;



public class Prueba {

	public static void main(String[] args) {
			Refresco r= new Refresco("Cocacola", 80, 4);
			MaquinaExpendedora m = new MaquinaExpendedora( 20, r);
			
			System.out.println("Refresco: " + r.getTipo());
			System.out.println("Precio: " + r.getPrecio());
			System.out.println("Existencias: " + r.getStock());
			m.vender(100);
			
			System.out.println("Cantidad Vendida: " + m.getCantidadVendida());
			System.out.println("Dinero en Maquina: " + m.getRecaudacion());
			System.out.println("Stock en la maquina despues de la venta: " + r.getStock());
			System.out.println("Cambios entregados: " + m.getCambio());
			
			
			
		}

	}



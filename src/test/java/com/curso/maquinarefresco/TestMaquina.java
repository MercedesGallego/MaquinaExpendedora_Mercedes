package com.curso.maquinarefresco;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.curso.maquinarefresco.MaquinaExpendedora;
import com.curso.maquinarefresco.Refresco;

public class TestMaquina {
	
	@Test
	public void testVendeSinStock() {
	Refresco r= new Refresco("Cocacola", 80, 0);//no hay Stock
	MaquinaExpendedora m = new MaquinaExpendedora(100, r);
	if(m.vender(100)!= -1) {
		fail("ERROR!NO HAY STOCK");
		
	}
	}
	@Test
	public void testVendeSinCambioSuficiente() {
	Refresco r= new Refresco("Cocacola", 80, 4);
	MaquinaExpendedora m = new MaquinaExpendedora(10, r);//no hay cambio suficiente
	
	if( m.vender(100)!= -2) {
		fail("ERROR!NO HAY CAMBIO SUFICIENTE");
		
	}
	}
	@Test
	public void testVendeSinDineroSuficiente() {
	Refresco r= new Refresco("Cocacola", 80, 4);
	MaquinaExpendedora m = new MaquinaExpendedora(100, r);
	
	if( m.vender(70)!= -3) {
		fail("ERROR!NO HA INTODUCIDO DINERO SUFICIENTE");
		
	}
	}
	

	@Test
	public void testVendeTodoOK() {
	Refresco r= new Refresco("Cocacola", 80, 4);
	MaquinaExpendedora m = new MaquinaExpendedora(100, r);
	//Datos esperado
	double esperoRecaudacion=180;		
	int esperoCantidadVendida=1;
	double esperoCambio=20;
	m.vender(100);
	
		
	
	if( m.getRecaudacion()!= esperoRecaudacion) {
		fail("ERROR!DEBERIA IR TODO BIEN PERO LA RECAUDACION NO ES 180 C " + m.getRecaudacion());
		
	}
	if( m.getCantidadVendida()!= esperoCantidadVendida) {
		fail("ERROR!DEBERIA IR TODO BIEN PERO LA CANTIDAD VENDIDA NO ES 1 " + m.getCantidadVendida());
		
	}
	if( m.vender(100)!= esperoCambio) {
		fail("ERROR!DEBERIA IR TODO BIEN PERO EL CAMBIO NO ES 20 C " + m.getCambio());
	}
}
}

package com.EzequielRosales.clases;

public class Televisor extends ProductoElectrodomestico{
	private int pulgadas;
	private String resolucion;
	
	public Televisor(String nombre, double precio, int cantidadDisponible, int pulgadas, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}
	
	
	
	public Televisor(String nombre, double precio, int pulgadas, String resolucion) {
		super(nombre, precio);
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}



	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Pulgadas: " + this.pulgadas);
		System.out.println("Resolución: " + this.resolucion);
	}
}
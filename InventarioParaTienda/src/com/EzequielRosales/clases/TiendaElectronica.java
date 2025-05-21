package com.EzequielRosales.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	private static ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<ProductoElectrodomestico>();
	
	public static void agregarProducto(ProductoElectrodomestico producto) {
		for(ProductoElectrodomestico ProductoElectrodomestico : listaDeProductos) {
			if (ProductoElectrodomestico.getNombre().equalsIgnoreCase(producto.getNombre())) {
				int cantidad = ProductoElectrodomestico.getCantidadDisponible() + 1;
				ProductoElectrodomestico.setCantidadDisponible(cantidad);
				System.out.println("Se ha aumentado la cantidad de " + ProductoElectrodomestico.getNombre() + " del inventario.");
				return;
			}
		}
		producto.setCantidadDisponible(1);
		listaDeProductos.add(producto);
		System.out.println(producto.getNombre() + " Ha sido añadido al inventario.");
	}
	
	public static void mostrarProductos() {
		for(ProductoElectrodomestico ProductoElectrodomestico : listaDeProductos) {
				System.out.println("___________________");
				ProductoElectrodomestico.mostrarInformacion();
				System.out.println("");
		}
	}
	
	public static void buscarProducto(ProductoElectrodomestico producto) {
		if(listaDeProductos.contains(producto)) {
			System.out.println(producto.getNombre() + " Se encuentra en el inventario.");
		} else {
			System.out.println("No hay de ese producto actualmente disponible en el inventario.");
		}
	}
	
	public static void comprarProducto(ProductoElectrodomestico producto) {
		for(ProductoElectrodomestico ProductoElectrodomestico : listaDeProductos) {
			if (ProductoElectrodomestico.getNombre().equalsIgnoreCase(producto.getNombre())) {
				int cantidad = ProductoElectrodomestico.getCantidadDisponible();
				if (cantidad == 0) {
					listaDeProductos.remove(producto);
					System.out.println("Lo sentimos, actualmente no contamos con " + producto.getNombre());
				} else {
					cantidad = ProductoElectrodomestico.getCantidadDisponible() - 1;
					ProductoElectrodomestico.setCantidadDisponible(cantidad);
					System.out.println("¡Gracias por su compra de " + producto.getNombre() + ", vuelva pronto!");
				} 
			return;
			}
		}
	
	}
}
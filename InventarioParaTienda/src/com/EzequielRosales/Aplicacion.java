package com.EzequielRosales;
import com.EzequielRosales.clases.*;

public class Aplicacion {

	public static void main(String[] args) {
		ProductoElectrodomestico producto1 = new ProductoElectrodomestico("Heladera", 200);
		ProductoElectrodomestico producto2 = new ProductoElectrodomestico("Tostadora", 100);
		ProductoElectrodomestico tv1 = new Televisor("LG Smart", 500, 50, "1080p HD");
		ProductoElectrodomestico laptop = new ComputadoraPortatil("Asus tuf gaming", 1000, 10,"Asus", "16GB", 321973);


		
		TiendaElectronica.agregarProducto(laptop);
		TiendaElectronica.agregarProducto(producto1);
		TiendaElectronica.agregarProducto(tv1);
		TiendaElectronica.agregarProducto(tv1);
		TiendaElectronica.agregarProducto(producto2);
		
		TiendaElectronica.comprarProducto(tv1);
		TiendaElectronica.comprarProducto(producto2);
		TiendaElectronica.comprarProducto(producto2);
		
		TiendaElectronica.mostrarProductos();
		TiendaElectronica.buscarProducto(tv1);
		TiendaElectronica.buscarProducto(producto2);
		TiendaElectronica.mostrarProductos();
	}

}
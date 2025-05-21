package com.EzequielRosales.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    private String marca;
    private String memoriaRAM;
    private int numeroSerie;

    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, String memoriaRAM, int numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Marca: " + this.marca);
        System.out.println("Memoria RAM: " + this.memoriaRAM + " GB");
        System.out.println("Número de Serie: " + this.numeroSerie);
    }
}

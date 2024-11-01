package org.agma;

import javax.swing.JOptionPane;


class Vehiculo {
    private String marca;
    private String modelo;
    private int año;


    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }


    public void imprimirInformacion() {
        String info = "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año: " + año;
        JOptionPane.showMessageDialog(null, info, "Información del Vehículo", JOptionPane.INFORMATION_MESSAGE);
    }
}


class Auto extends Vehiculo {
    private int numeroPuertas;

    // Constructor
    public Auto(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        String info = "Número de puertas: " + numeroPuertas;
        JOptionPane.showMessageDialog(null, info, "Información del Auto", JOptionPane.INFORMATION_MESSAGE);
    }
}


class Moto extends Vehiculo {
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        String info = "¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No");
        JOptionPane.showMessageDialog(null, info, "Información de la Moto", JOptionPane.INFORMATION_MESSAGE);
    }
}


public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Harley-Davidson", "Sportster", 2018, false);

        auto.imprimirInformacion();
        moto.imprimirInformacion();
    }
}

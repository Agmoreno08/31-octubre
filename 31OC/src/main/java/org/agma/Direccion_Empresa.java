package org.agma;

import javax.swing.JOptionPane;


class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;


    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }


    @Override
    public String toString() {
        return "Calle: " + calle + "\n" +
                "Ciudad: " + ciudad + "\n" +
                "Código Postal: " + codigoPostal;
    }
}


class Empresa {
    private String nombreEmpresa;
    private Direccion direccion;

    // Constructor
    public Empresa(String nombreEmpresa, Direccion direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
    }


    public void mostrarDetalles() {
        String detalles = "Nombre de la Empresa: " + nombreEmpresa + "\n" +
                "Dirección:\n" + direccion.toString();
        JOptionPane.showMessageDialog(null, detalles, "Detalles de la Empresa", JOptionPane.INFORMATION_MESSAGE);
    }


    public static void main(String[] args) {

        Direccion direccion = new Direccion("Hotel Primavera", "Jinotega", "1100010");


        Empresa empresa = new Empresa(" KAAES", direccion);


        empresa.mostrarDetalles();
    }
}

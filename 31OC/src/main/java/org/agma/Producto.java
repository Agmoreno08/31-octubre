package org.agma;
import javax.swing.JOptionPane;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Constructor
    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }


    public void actualizarCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidadDisponible = cantidad;
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad no puede ser negativa.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public double calcularValorTotal() {
        return precio * cantidadDisponible;
    }


    public void mostrarInformacion() {
        String info = "Nombre: " + nombre + "\n" +
                "Precio: $" + precio + "\n" +
                "Cantidad Disponible: " + cantidadDisponible + "\n" +
                "Valor Total: $" + calcularValorTotal();
        JOptionPane.showMessageDialog(null, info, "Información del Producto", JOptionPane.INFORMATION_MESSAGE);
    }


    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1500.0, 10);
        producto.mostrarInformacion();

        producto.actualizarCantidad(15);
        producto.mostrarInformacion();
    }
}

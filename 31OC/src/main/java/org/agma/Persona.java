package org.agma;
import javax.swing.JOptionPane;

public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;
    private String genero;

    // Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método toString para devolver la información de la persona
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Género: " + genero;
    }

    // Método para mostrar la información usando JOptionPane
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, toString(), "Información de la Persona", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25, "Masculino");
        persona.mostrarInformacion();
    }
}

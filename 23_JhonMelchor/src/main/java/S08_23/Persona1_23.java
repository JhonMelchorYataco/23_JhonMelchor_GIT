/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_23;

/**
 *
 * @author jvale
 */
public class Persona1_23 {
    private String nombre;
    private int edad;

    // Método para establecer información con parámetros
    public void establecerInformacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Información establecida: " + this.nombre + ", " + this.edad + " años");
    }
}

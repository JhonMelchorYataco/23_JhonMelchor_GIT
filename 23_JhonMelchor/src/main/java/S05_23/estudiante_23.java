
package S05_23;

public class estudiante_23 {
    private String nombre;
    private int edad;
    private String carrera;

    public estudiante_23(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera);
    }
}

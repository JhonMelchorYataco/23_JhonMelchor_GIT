
package S11_23_E01;

public class Estudiante_23 extends Persona_23{
    // Atributos adicionales
    private String universidad;
    private String carrera;

    // Constructor
    public Estudiante_23(String nombre, int edad, String universidad, String carrera) {
        super(nombre, edad);
        this.universidad = universidad;
        this.carrera = carrera;
    }

    // Método adicional
    public void estudiar() {
        System.out.println(nombre + " estudia en la universidad " + universidad + " en la carrera de " + carrera + ".");
    }
}

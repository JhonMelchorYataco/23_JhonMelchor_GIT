
package S11_23_E01;

public class Deportista_23 extends Persona_23{
    // Atributos adicionales
    private String deporte;
    private String equipo;

    // Constructor
    public Deportista_23(String nombre, int edad, String deporte, String equipo) {
        super(nombre, edad);
        this.deporte = deporte;
        this.equipo = equipo;
    }

    // Método adicional
    public void practicarDeporte() {
        System.out.println(nombre + " practica " + deporte + " y juega en el equipo " + equipo + ".");
    }
}

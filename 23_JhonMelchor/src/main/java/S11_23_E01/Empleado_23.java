
package S11_23_E01;

public class Empleado_23 extends Persona_23{
    // Atributos adicionales
    private String empresa;
    private double salario;

    // Constructor
    public Empleado_23(String nombre, int edad, String empresa, double salario) {
        super(nombre, edad);
        this.empresa = empresa;
        this.salario = salario;
    }

    // Método adicional
    public void trabajar() {
        System.out.println(nombre + " trabaja en " + empresa + " y tiene un salario de $" + salario + ".");
    }
}

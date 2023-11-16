
package S08_23;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de personas
        Persona1_23 personaConParametros = new Persona1_23();
        Persona2_23 personaConRetorno = new Persona2_23();

        // Utilizar métodos con parámetros
        personaConParametros.establecerInformacion("Juan", 25);

        // Obtener y mostrar información utilizando métodos con valores de retorno
        String nombre = personaConRetorno.obtenerNombre();
        int edad = personaConRetorno.obtenerEdad();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

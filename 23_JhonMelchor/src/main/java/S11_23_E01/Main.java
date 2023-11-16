
package S11_23_E01;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Estudiante_23 estudiante = new Estudiante_23("Juan", 20, "Universidad A", "Ingeniería Informática");
        Empleado_23 empleado = new Empleado_23("María", 30, "Empresa B", 50000.0);
        Deportista_23 deportista = new Deportista_23("Carlos", 25, "Fútbol", "Equipo C");

        // Acceder a los métodos de las clases
        estudiante.saludar();
        estudiante.estudiar();

        empleado.saludar();
        empleado.trabajar();

        deportista.saludar();
        deportista.practicarDeporte();
    }  
}

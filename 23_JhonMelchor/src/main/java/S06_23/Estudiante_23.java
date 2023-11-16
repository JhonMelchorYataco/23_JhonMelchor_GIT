
package S06_23;

public class Estudiante_23 {
    //ATRIBUTOS
    String nombre;
    String curso;
    int edad;
    
    //METODOS
    public void saludar() {
        System.out.println("Mi nombre es " + nombre);
    }
    
    public void materia() {
        System.out.println("Mi curso favorito es " + curso);
    }
    
    public void edad() {
        System.out.println("Mi edad es " + edad);
    }
    
    //SOBRECARGA DE CONSTRUCTOR
    public Estudiante_23(String nombre, String curso, int edad) {
        this.nombre = nombre;
        this.curso = curso;
        this.edad = edad;
    }

    public Estudiante_23(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante_23(String curso) {
        this.curso = curso;
    }
    
    //SOBRECARGA DE METODOS
    public void saludar(String xpersona){
        System.out.println("Me llamo " + xpersona);
    }
    
    public void materia(String profe){
        System.out.println("Soy el " + profe + " del curso de "+ curso);
    }
    
    //METODO CON VALORES DE RETORNO
    public int años(int años){
        return años;
    }
    
    public String ncompleto(String apellido){
        return nombre + apellido;
    }
}

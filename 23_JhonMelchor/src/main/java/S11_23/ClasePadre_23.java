
package S11_23;

public class ClasePadre_23 {
    //ATRIBUTOS
    String nombre;
    int edad;
    
    public ClasePadre_23(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //METODOS
    public void saludar(){
        System.out.println("Mi nombre es " + nombre);
    }
    
    public void edad(){
        System.out.println("Tengo " + edad + " años");
    }
    
    //GETTER AND SETTER

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
}

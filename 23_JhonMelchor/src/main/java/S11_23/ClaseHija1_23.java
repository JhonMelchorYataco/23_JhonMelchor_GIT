
package S11_23;

public class ClaseHija1_23 extends ClasePadre_23{
    //ATRIBUTOS
    private String materia;
    private int experiencia;
    private String ropa;
    
    public ClaseHija1_23(String materia, int experiencia, String ropa, String nombre, int edad) {
        super(nombre, edad);
        this.materia = materia;
        this.experiencia = experiencia;
        this.ropa = ropa;
    }    
    
    //METODOS
    public void enseñar() {
        System.out.println(nombre + " esta enseñando " + materia);
    }
    
    public void años(){
        System.out.println("Mis años de experiencia son de " + experiencia);
    }

    
}


package S11_23;

public class ClaseHija3_23 extends ClasePadre_23{
    //ATRIBUTO
    private String cargo;
    private String genero;
    private String materiales;

    public ClaseHija3_23(String cargo, String genero, String materiales, String nombre, int edad) {
        super(nombre, edad);
        this.cargo = cargo;
        this.genero = genero;
        this.materiales = materiales;
    }
    
    //METODOS
    public void trabajar(){
        System.out.println("mi nombre es " + nombre + " tengo el cargo de  " +  cargo);
    }
    
    public void empleado(){
        System.out.println("El empleado es " + genero + " y se llama " + nombre);
    }
}


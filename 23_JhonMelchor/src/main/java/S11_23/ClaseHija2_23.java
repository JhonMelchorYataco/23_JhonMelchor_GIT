
package S11_23;

public class ClaseHija2_23 extends ClasePadre_23{
    //ATRIBUTOS
    private String colegio;
    private int norden;
    private int ciclo;

    public ClaseHija2_23(String colegio, int norden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.colegio = colegio;
        this.norden = norden;
        this.ciclo = ciclo;
    }
    
    //METODOS
    public void estudiar(){
        System.out.println(nombre + " esta estudiando en " + colegio);
    }
    
    public void norden(){
        System.out.println("Mi numero de orden es " + norden);
    }
}

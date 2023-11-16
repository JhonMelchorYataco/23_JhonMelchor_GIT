
package S07v2_23;

public class Persona_23 {
    //ATRIBUTOS
    String nombre;
    String apellido;
    int edad;
    int años;
    
    //METODOS
    public void caminar() {
        System.out.println("Yo camino por la cuidad hace " + años);
    }
    
    public void saludo() {
        System.out.println("Mi nombre es " + nombre + apellido);
    }
    
    public void años() {
        System.out.println("Mi edad es de " + edad + " años");
    }
    
    //SOBRECARGA DE METODOS
    public void caminar(String persona){
        System.out.println("El dia de hoy camine con " + persona);
    }
    
    public void saludar(String xpersona){
        System.out.println("El dia de hoy saludo a " + xpersona);
    }
    
    //METODO CON VALORES DE RETORNO
    public int añosdexperiencia(){
        return años;
    }
    
    public String conocidos(){
        return nombre + apellido;
    }
    
    public double dinero(double moneda){
        return moneda;
    }
    
    //METODO CON PARAMETROS Y ARGUMENTOS
    public void carro(String carro){
        System.out.println("Tengo un " + carro);
    }
    
    public void marca(String marca){
        System.out.println("La marca de mi carro es " + marca);
    } 
}

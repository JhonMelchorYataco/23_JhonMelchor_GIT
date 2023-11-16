
package S06_23;

public class Calculadora_23 {
    //ATRIBUTOS
    int num1;
    int num2;
    
    //METODOS
    public void suma() {
        int resultado = num1 + num2;
        System.out.println("El numero " + num1 + " y " + num2 + " es igual a " + resultado);
    }
    
    public void resta() {
        int resultado = num1 - num2;
        System.out.println("El numero " + num1 + " y " + num2 + " es igual a " + resultado);
    }
    
    public void multiplicacion() {
        int resultado = num1 * num2;
        System.out.println("El numero " + num1 + " y " + num2 + " es igual a " + resultado);
    }
    //SOBRECARGA DE CONSTRUCTOR
    public Calculadora_23(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculadora_23(int num2) {
        this.num2 = num2;
    }
    
    //SOBRECARGA DE METODOS
    public void suma(int n1, int n2){
        int rs = n1 + n2;
        System.out.println("el resultado es " + rs);
    }
    
    public void resta(int n1, int n2){
        int rs = n1 - n2;
        System.out.println("el resultado es " + rs);
    }
    
    public void multi(int n1, int n2){
        int rs = n1 * n2;
        System.out.println("el resultado es " + rs);
    }
    
    //METODO CON VALORES DE RETORNO
    public int sum(int n1, int n2){
        return n1 + n2;
    }
    
    public int rest(int n1, int n2){
        return n1 - n2;
    }
    
    public int mult(int n1, int n2){
        return n1 * n2;
    }
}

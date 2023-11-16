
package S11_23;

public class Main {
    public static void main(String[] args) {
        ClaseHija1_23 obj1 = new ClaseHija1_23("POO", 15, "Short", "Levano", 21);
        ClaseHija2_23 obj2 = new ClaseHija2_23("Valle Grande", 23, 2, "Jhon", 25);
        ClaseHija3_23 obj3 = new ClaseHija3_23("Estudiante", "Masculino", "Cuaderno", "Jhon", 25);
        
        obj1.enseñar();
        obj1.años();
        
        obj2.estudiar();
        obj2.norden();
        
        obj3.trabajar();
        obj3.empleado();
    }
}

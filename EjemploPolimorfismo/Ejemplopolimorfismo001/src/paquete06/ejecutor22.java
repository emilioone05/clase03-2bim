package paquete06;
public class ejecutor22 {
    public static void main(String[] args) {
        String nombre= "pepe";
        String apell = "sala";
        EstudianteDistancia esdis = new EstudianteDistancia(10, 5, nombre, apell);
        esdis.establecerEdadEstudiante(18);
        esdis.calcularMatricula();
        System.out.println(esdis);
    }
 
}

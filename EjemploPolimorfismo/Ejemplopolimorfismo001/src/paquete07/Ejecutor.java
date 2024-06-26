package paquete07;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejecutor {   //Nombres : Pedro Yepez, Emilio Peña, Jean Carlos
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        
        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
        int seguir =1;
        do {                
            System.out.println("Elija su figura");
            System.out.println("1 triangulo");
            System.out.println("2 rombo");
            System.out.println("3 cuadrado");
            System.out.println("4 salir");
            int figura=put.nextInt();
            put.nextLine();
            System.out.println("Ingrese las caracteristicas");
            String caract = put.nextLine();
            
            switch(figura){
                case 1: 
                    System.out.println("Ingrese la base");
                    double base= put.nextDouble();
                    System.out.println("Ingrese la altyura");
                    double altura= put.nextDouble();
                    Triangulo tri = new Triangulo(base, altura, caract);   
                    break;
                case 2:
                    
            }
        } while (seguir ==1);
        
        
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcularArea();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
    }
}

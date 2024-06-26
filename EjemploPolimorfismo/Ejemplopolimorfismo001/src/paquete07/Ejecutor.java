package paquete07;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejecutor {   //Integrantes : Pedro Yepez, Emilio Peña, Jean Carlos !!!!!!!!!!!!
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
        int seguir = 1;
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
                    System.out.println("Ingrese la longitud de la base");
                    double base= put.nextDouble();
                    System.out.println("Ingrese la longitud de la altura");
                    double altura= put.nextDouble();
                    Triangulo tri = new Triangulo(base, altura, caract);   
                    figuras.add(tri);
                    break;
                case 2:
                    System.out.println("Ingrese la longitud de la diagonal mayor");
                    double diagMay = put.nextDouble();
                    System.out.println("Ingrese la longitud de la diagonal menor");
                    double diagMen = put.nextDouble();
                    Rombo romb = new Rombo(diagMen, diagMay, caract);
                    figuras.add(romb);
                    break;
                case 3:
                    System.out.println("Ingrese la longitud del lado");
                    double lado = put.nextDouble();
                    Cuadrado cuad = new Cuadrado(lado, caract);
                    figuras.add(cuad);
                    break;
            }
            System.out.println("Desea anadir otra figura?");
            System.out.println("[1] Si\n[2] No");
            seguir = put.nextInt();
        
            
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

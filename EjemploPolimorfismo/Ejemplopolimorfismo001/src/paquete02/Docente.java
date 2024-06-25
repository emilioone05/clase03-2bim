/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

public abstract class Docente {
    private String nombre;
    private double sueldo;
    
    public Docente(String n){
        nombre = n;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    /*public abstract void obtenerSueldo(double d){
        sueldo = d;
    }*/
    
    /*Solo coln el abstratc ya esta obligadas todas las clases que hereden de la SuperClase de darle un valor a la funcion Obtener
    Sueldo porque es abstract*/
    public abstract void obtenerSueldo();
    
    
}

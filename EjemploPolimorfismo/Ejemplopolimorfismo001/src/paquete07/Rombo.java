/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
public class Rombo extends Figura{
    private double diagonalMenor;
    private double diagonalMayor;

    public Rombo(double diagonalMenor, double diagonalMayor, String caracteristicas) {
        super(caracteristicas);
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public void calcularArea(){
        this.area=(diagonalMenor*diagonalMayor)/2;
    }

    @Override
    public String toString() {
        return "Rombo{" + "diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor +" "+ super.toString()+ '}';
    }
    
    
    
}

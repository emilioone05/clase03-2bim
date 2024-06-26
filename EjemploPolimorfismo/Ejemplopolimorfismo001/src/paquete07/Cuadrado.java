package paquete07;
public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado, String caracteristicas) {
        super(caracteristicas);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public void calcularArea(){
        this.area=lado*lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado +" "+ super.toString()+ '}';
    }
    
}

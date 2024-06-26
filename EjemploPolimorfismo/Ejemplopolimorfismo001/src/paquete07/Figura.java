package paquete07;
public abstract class Figura {
    protected String caracteristicas;
    protected double area;

    public Figura(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public abstract void calcularArea();

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Figura{" + "caracteristicas=" + caracteristicas + ", area=" + area +" "+ super.toString()+ '}';
    }
    

    
    
}
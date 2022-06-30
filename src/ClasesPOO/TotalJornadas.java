
package ClasesPOO;

public class TotalJornadas extends NumeroJornadas{
    
    private double sumaEstimaciones;

    public TotalJornadas(double sumaEstimaciones, double calcTotJornadas, double NumJorn) {
        super(calcTotJornadas, NumJorn);
        this.sumaEstimaciones = sumaEstimaciones;
    }

    public double getSumaEstimaciones() {
        return sumaEstimaciones;
    }

    public void setSumaEstimaciones(double sumaEstimaciones) {
        this.sumaEstimaciones = sumaEstimaciones;
    }

    @Override
    public String toString() {
        return "TotalJornadas{" + "sumaEstimaciones=" + sumaEstimaciones + '}';
    }

    
    
}



package ClasesPOO;

import Formularios.FormGCEstimacion;


public class NumeroJornadas extends RegistroEstimacion{
    private double calcTotJornadas;

    public NumeroJornadas(double calcTotJornadas, double NumJorn) {
        super(NumJorn);
        this.calcTotJornadas = calcTotJornadas;
    }

    public double getCalcTotJornadas() {
        return calcTotJornadas;
    }

    public void setCalcTotJornadas(double calcTotJornadas) {
        this.calcTotJornadas = calcTotJornadas;
    }

    
    

    
    public double calcTotalJornadas(){
        
        for (int i = 0; i <= FormGCEstimacion.cont ; i++) {
            
            calcTotJornadas= calcTotJornadas + FormGCEstimacion.vectJornadas[i];            
        }              
        return calcTotJornadas;
    }
    
    
}

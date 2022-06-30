
package ClasesPOO;

import Formularios.FormGCEstimacion;

public class CostoTotal extends CostoEconomico{
    /*
    private double vectCostTotal[];

    public CostoTotal(double[] vectCostTotal, double[] vectCostoEcon, double[] vectNumJorn, double[] vectCosPerfil) {
        super(vectCostoEcon, vectNumJorn, vectCosPerfil);
        this.vectCostTotal = vectCostTotal;
    }

    public double[] getVectCostTotal() {
        return vectCostTotal;
    }

    public void setVectCostTotal(double[] vectCostTotal) {
        this.vectCostTotal = vectCostTotal;
    }
    
    
    
    public double calcCostoTotal(){
        double cosTotal = 0;        
        for (int i = 0; i <= FormGCEstimacion.cont ; i++) {
            
            cosTotal = cosTotal + (FormGCEstimacion.vectJornadas
                    [FormGCEstimacion.cont]*FormGCEstimacion.vectCostoPerfil
                    [FormGCEstimacion.cont]);            
        }                        
        return cosTotal;
        
    }*/
    
    private double cTotal;

    public CostoTotal(double cTotal, double cEconom, double NumJorn) {
        super(cEconom, NumJorn);
        this.cTotal = cTotal;
    }

    public double getcTotal() {
        return cTotal;
    }

    public void setcTotal(double cTotal) {
        this.cTotal = cTotal;
    }
    
    public double calcCostoTotal(){
        double cosTotal = 0;        
        for (int i = 0; i <= FormGCEstimacion.cont ; i++) {
            
            cosTotal = cosTotal + (FormGCEstimacion.vectJornadas
                    [FormGCEstimacion.cont]*FormGCEstimacion.vectCostoPerfil
                    [FormGCEstimacion.cont]);            
        }                        
        return cosTotal;
        
    }
    
    
}

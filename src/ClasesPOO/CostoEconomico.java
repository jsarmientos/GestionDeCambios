
package ClasesPOO;

import Formularios.FormGCEstimacion;


public class CostoEconomico extends RegistroEstimacion{
   /* private double vectCostoEcon[];
    private double vectCosPerfil[];

    public CostoEconomico(double[] vectCostoEcon, double[] vectCosPerfil, double[] vectNumJorn) {
        super(vectNumJorn);
        this.vectCostoEcon = vectCostoEcon;
        this.vectCosPerfil = vectCosPerfil;
    }

    public double[] getVectCostoEcon() {
        return vectCostoEcon;
    }

    public void setVectCostoEcon(double[] vectCostoEcon) {
        this.vectCostoEcon = vectCostoEcon;
    }

    public double[] getVectCosPerfil() {
        return vectCosPerfil;
    }

    public void setVectCosPerfil(double[] vectCosPerfil) {
        this.vectCosPerfil = vectCosPerfil;
    }
    
    
    
    
    
    
    
    public double calcCostoEconomico(){
        double costoEcon = 0;
        
        for (int j = 0; j <= FormGCEstimacion.cont ; j++) {
            
            vectCostoEcon[FormGCEstimacion.cont]= FormGCEstimacion.vectJornadas
                    [FormGCEstimacion.cont]*FormGCEstimacion.vectCostoPerfil
                    [FormGCEstimacion.cont];
            
        }
        
        for (int k = 0; k < FormGCEstimacion.cont; k++) {
            costoEcon=vectCostoEcon[FormGCEstimacion.cont] + costoEcon;
        }
        
        
        return costoEcon;
    }
    */
    
    private double cEconom;

    public CostoEconomico(double cEconom, double NumJorn) {
        super(NumJorn);
        this.cEconom = cEconom;
    }

    public double getcEconom() {
        return cEconom;
    }

    public void setcEconom(double cEconom) {
        this.cEconom = cEconom;
    }

    public double calcCostoEconomico(){
        double costoEcon = 0;
        
        for (int j = 0; j <= FormGCEstimacion.cont ; j++) {
            
            costoEcon = costoEcon + (FormGCEstimacion.vectJornadas
                    [FormGCEstimacion.cont]*FormGCEstimacion.vectCostoPerfil
                    [FormGCEstimacion.cont]);
            
        }
        /*
        for (int k = 0; k < FormGCEstimacion.cont; k++) {
            costoEcon=vectCostoEcon[FormGCEstimacion.cont] + costoEcon;
        }
        */
        
        return costoEcon;
    }
   
    
    
    
}

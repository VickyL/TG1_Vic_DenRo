/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabajo_grupo1;

/**
 *
 * @author ViCoOo
 */
public class Prestamo_Vivienda extends Prestamo {
    private boolean usaBanprovi;

    public Prestamo_Vivienda(double monto,int cant,boolean usa){
        super(monto,cant);
        usaBanprovi=usa;
    }

    public double getTasaInteres(){
        if(usaBanprovi){
            return this.montoprestamo*0.1;
        }

        return this.montoprestamo*0.2;
    }

    public double saldoPendiente(){

        double saldoP=0;

        for(int cont=0; cont<this.cuota.length;cont++){
            if(this.cuota[cont]!=null && this.cuota[cont].pagada==false){
            
           saldoP += this.cuota[cont].pagoMensual;

            }
        }
        return saldoP+57000;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabajo_grupo1;

/**
 *
 * @author ViCoOo
 */
public class Prestamo_Auto extends Prestamo{

    protected String  serieAutoMotor;
    protected Cuota cuotaSeguro [];



    public Prestamo_Auto(double monto, int cant,String serie){
        super (monto,cant);
        serieAutoMotor=serie;
        cuotaSeguro =new Cuota [cant];

    }
    public double getTasaInteres(){
        return this.montoprestamo*0.25;
    }

     public double saldoPendiente(){

        double saldoP=0;

        for(int i=0; i<cuotaSeguro.length & i<cuota.length ;i++){

          if (cuotaSeguro[i].pagada==false || cuota [i].pagada ==false )

             saldoP +=cuota[i].pagoMensual;
        }
        return saldoP + 5700;
    }
}


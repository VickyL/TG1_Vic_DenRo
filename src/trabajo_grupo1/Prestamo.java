/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabajo_grupo1;

/**
 *
 * @author ViCoOo
 */
public abstract class Prestamo {
    protected double montoprestamo;
    protected String nombrecliente;
    protected Cuota cuota[];

    public Prestamo(double monto, int cant){
        montoprestamo = monto;
         cuota=new Cuota[cant];
    }

    public abstract double getTasaInteres();

    public abstract double saldoPendiente();

}

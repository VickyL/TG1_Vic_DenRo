/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabajo_grupo1;

import java.util.Scanner;

/**
 *
 * @author ViCoOo
 */
public class JavaBank {

    public static Prestamo pres[];
    public static int cont;
     public static Scanner lea= new Scanner (System.in);

    public JavaBank(){
        cont=0;
    }


    public static void main(String args[]){


        pres=new Prestamo[10];
        int op;
        do{
            System.out.println("MENU\n--------------------");
            System.out.println("1- Agregar Cliente");
            System.out.println("2- Monto total pendiente");
            System.out.println("3- Detalle mensual");
            System.out.println("4- salir");

            System.out.println("Escoja una opcion");
            op=lea.nextInt();

            switch(op){
                case 1:
                     System.out.println("----- Agregar Cliente");
                     System.out.println("Ingrese que tipo de prestamo tiene");
                     char tipo=lea.next().charAt(0);
                     AdicionCliente(tipo);
                     break;

                case 2:
                    System.out.println("------ Monto total pendiente");

                     break;

                case 3:
                     System.out.println("----- Detalle mensual");
                        break;
            }
        }while(op!=4);


    }

    public static boolean AdicionCliente(char tipo){

        double monto;
        int cant;
        String nombre,serie;

            if(cont<pres.length){
                
                if( tipo == 'v' ){
                 System.out.println("Ingrese el monto del prestamo");
                monto= lea.nextDouble();
                System.out.println("Ingrese cantidad de cuotas");
                cant= lea.nextInt();
                System.out.println("Usa Banprovi???");
                boolean usa= lea.nextBoolean();

                pres[ cont] = new Prestamo_Vivienda(monto,cant,usa);
                }
                    if(tipo=='A'){
                        System.out.println("Ingrese el monto del prestamo");
                        monto= lea.nextDouble();
                        System.out.println("Ingrese cantidad de cuotas");
                        cant= lea.nextInt();
                        System.out.println("INGRESE el numero de serie");
                        serie= lea.next();

                        pres[cont]=new Prestamo_Auto(monto,cant,serie);
                }
                return true;
            }

            return false;
        }







        }



    



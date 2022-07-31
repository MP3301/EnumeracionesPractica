/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumeraciones;

import enumeracion.Dias;

/**
 *
 * @author X
 */
public class Enumeraciones {

    /**
     * @param args the command line arguments
     */
    
    private static void diaDeLaSemana(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("PRIMER DIA DE LA SEMANA");
                break;
                case MARTES:
                System.out.println("SEGUNDO DIA DE LA SEMANA");
                break;
                case MIERCOLES:
                System.out.println("TERCER DIA DE LA SEMANA");
                break;
                case JUEVES:
                System.out.println("CUARTO DIA DE LA SEMANA");
                break;
                case VIERNES:
                System.out.println("QUINTO DIA DE LA SEMANA");
                break;
                case SABADO:
                System.out.println("SEXTO DIA DE LA SEMANA");
                break;
                case DOMINGO:
                System.out.println("SEPTIMO DIA DE LA SEMANA");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        
        diaDeLaSemana(Dias.DOMINGO);
     
     
      
    }
    
   
    
}

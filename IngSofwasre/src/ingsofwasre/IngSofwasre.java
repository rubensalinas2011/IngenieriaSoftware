/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingsofwasre;

import java.util.Scanner;
/**
 *
 * @author RUBEN-ISABEL
 */
public class IngSofwasre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int inf, sup, medio, resp;
        String espe;
        inf = 0;
        sup = 100;
        int nroIntentos = 0;
        boolean encontrado = false;
        System.out.print("Piense un mumero del 1 al 100 \n");
        do {
            medio =(inf + sup)/2;
            System.out.printf("El numero que penso es %d \n",medio);
            nroIntentos ++;
            System.out.println("Digite: ");
            System.out.println("1. Si acerté: \n"
                    + "2. Si el numero que penso es mayor :\n"
                    + "3. Si el numero que penso es menor : \n  ");
            resp = lector.nextInt();
            switch (resp){
                case 1:
                    encontrado = true;
                    break;
                case 2:
                    inf = medio + 1;
                    break;
                case 3:
                    sup = medio - 1 ;
                    break;
                default:
                    System.out.println("Opcion no valida ");                    
            }
        }while (nroIntentos <= 8 && encontrado == false);
        System.out.printf("Nro. Intentos: %d\n ",nroIntentos);        
        // TODO code application logic here
    }
    
}

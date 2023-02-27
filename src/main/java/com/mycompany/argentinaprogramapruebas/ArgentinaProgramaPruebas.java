
package com.mycompany.argentinaprogramapruebas;

import java.util.Scanner;

public class ArgentinaProgramaPruebas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Ingrese un numero: ");
        //int next = sc.nextInt();
        //System.out.println(next);
        
        int destornillador = 1;
        boolean control = true;
        int input = 0;
        int input2 = 0;
        
        while (control) {
            input2 = 0;
            input = 0;
            
            System.out.println("Que desea hacer? " + "\n" + "(1)Pedir herramienta" + "\n" + "(2)Dejar herramienta");
            input = sc.nextInt();
            
            switch (input) {
                case 1:
                    if (destornillador > 0){
                        System.out.println("Quedan " + destornillador + " destornilladores");
                        System.out.println("¿Cuantos quiere retirar?");
                        input2 = sc.nextInt();
                        
                        if (input2 > destornillador){
                            
                            System.out.println("No quedan suficientes destornilladores");
                            
                        } else {
                            
                            destornillador = destornillador - input2;
                            
                            System.out.println("Ahora quedan " + destornillador + " herramientas");
                            
                            control=false;
                            
                        }
                    } else {
                        
                        System.out.println("No quedan destornilladores");
                        
                    }
                    
                    
                    break;
                    
                case 2:
                    
                    System.out.println("¿Cuantas herramientas devolvera?");
                    input2 = sc.nextInt();
                    System.out.println("Esperamos que vuelva!");
                    destornillador = destornillador + input2;
                    
                    control=false;
                    break;
                    
                default:
                    
                    System.out.println("No ingreso una opcion registrada");
                    throw new AssertionError();
                    
            }
            
        }
        
    
      
    }
}

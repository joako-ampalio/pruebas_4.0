package com.mycompany.argentinaprogramapruebas;

import com.mycompany.argentinaprogramapruebas.pruebas.Gato;
import com.mycompany.argentinaprogramapruebas.pruebas.Herramienta;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class ArgentinaProgramaPruebas {

    public static void main(String[] args) throws IOException {

        
        
        Gato[] listaGatos = new Gato[6];
        
        Gato gato1 = new Gato("Blake", "Chikita", "Negro", 2 );
        
        //Gato gato2 = crearGato();
        //System.out.println(gato2.toString());
        //Gato gato3 = crearGato();
        //System.out.println(gato3.toString());
        Integer num1 = 4;
        int num2 = 4;
        Boolean bul = true;
        
        int num3 = num1 + num2;
        System.out.println(num3);
                                
        System.out.println(num1);
        
    }
    
    public static Gato crearGato(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del gato");
        String nombre = sc.next();
        System.out.println("Ingrese el tamaño del gato");
        String tamaño = sc.next();
        System.out.println("Ingrese la raza del gato");
        String raza = sc.next();
        System.out.println("Ingrese la edad del gato");
        int edad = sc.nextInt();
        
    return new Gato(nombre, tamaño, raza, edad);
    }

    public static Perro crearPerro(String[] var) {

        String nombre = var[0];
        String color = var[1];

        return new Perro(nombre, color);

    }
    
    public static void leertxt() throws IOException{
        
    }
    
    public static void split() throws IOException{
    
        Path archivotxt = Paths.get("D:\\Users\\nes\\Desktop\\Argentina_Programa_4.0\\COM50\\prueba.txt");
        for (String linea : Files.readAllLines(archivotxt)) {
            System.out.println(linea);
        }
        String[] temp = new String[2];
        
        String frase = "Tarugo,mecha";

        temp = frase.split(",");

        Perro perro0 = crearPerro(temp);

        System.out.println(perro0.toString());

        int cont = 0;

        for (String linea : Files.readAllLines(archivotxt)) {

            temp = linea.split(",");

            switch (cont) {
                case 0:
                    Perro perro1 = crearPerro(temp);
                    System.out.println(perro1.toString());
                    break;
                case 1:
                    Perro perro2 = crearPerro(temp);
                    System.out.println(perro2.toString());
                    break;
                case 2:
                    Perro perro3 = crearPerro(temp);
                    System.out.println(perro3.toString());
                    break;

                default:
                    System.out.println("No deberia entrar aca :/");
                    throw new AssertionError();
            }
            cont++;

        }
    
    }

//    public static Perro ponerValores() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ingrese el nombre del perro");
//
//        String nombre = sc.next();
//
//        System.out.println("Ingrese el tamaño del perro");
//
//        String tamaño = sc.next();
//
//        System.out.println("Ingrese el color del perro");
//
//        String color = sc.next();
//
//        System.out.println("Ingrese la edad del perro");
//
//        int edad = sc.nextInt();
//
//        return new Perro(nombre, tamaño, color, edad);
//
//    }
}

/*System.out.println("Ingrese un numero: ");
        int next = sc.nextInt();
        System.out.println(next);
        
        
        for (int num1 =0; num1<10; num1++){
            System.out.println("buenas");
        }
        
        
        //System.out.println("Ingrese un numero: ");
        //int next = sc.nextInt();
        //System.out.println(next);
 */
//        int[] numeros = {1,4,3,664,25,6,7,8,4};
//        
//        for (int i = 0; i < numeros.length; i++) {
//            if ((numeros[i] % 2) != 0) {
//                System.out.println(numeros[i] + " - Es IMpar!!");
//            }
//            if ((numeros[i] % 2) == 0) {
//                System.out.println(numeros[i] + " - Es PAR!!");
//            }
//        }
//Arrays.sort(numeros);
//        for (int i = 0; i < numeros.length; i++) {
//            
//                System.out.println(numeros[i]);
//            
//        }
//    int destornillador = 1;
//        boolean control = true;
//        int input = 0;
//        int input2 = 0;
//        
//        while (control) {
//            input2 = 0;
//            input = 0;
//            
//            System.out.println("Que desea hacer? " + "\n" + "(1)Pedir herramienta" + "\n" + "(2)Dejar herramienta");
//            input = sc.nextInt();
//            
//            switch (input) {
//                case 1:
//                    if (destornillador > 0){
//                        System.out.println("Quedan " + destornillador + " destornilladores");
//                        System.out.println("¿Cuantos quiere retirar?");
//                        input2 = sc.nextInt();
//                        
//                        if (input2 > destornillador){
//                            
//                            System.out.println("No quedan suficientes destornilladores");
//                            
//                        } else {
//                            
//                            destornillador = destornillador - input2;
//                            
//                            System.out.println("Ahora quedan " + destornillador + " herramientas");
//                            
//                            control=false;
//                            
//                        }
//                    } else {
//                        
//                        System.out.println("No quedan destornilladores");
//                        
//                    }
//                    
//                    
//                    break;
//                    
//                case 2:
//                    
//                    System.out.println("¿Cuantas herramientas devolvera?");
//                    input2 = sc.nextInt();
//                    System.out.println("Esperamos que vuelva!");
//                    destornillador = destornillador + input2;
//                    
//                    control=false;
//                    break;
//                    
//                default:
//                    
//                    System.out.println("No ingreso una opcion registrada");
//                    throw new AssertionError();

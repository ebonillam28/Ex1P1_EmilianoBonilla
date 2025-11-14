/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1p1_emilianobonilla;

import java.util.Scanner;

/**
 *
 * @author eboni
 */
public class Ex1P1_EmilianoBonilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int respuesta = 0;

        while (respuesta != 5) {
            System.out.println("");
            System.out.println("Bienvenido, ingrese un numero:");
            System.out.println("1)Reemplazo");
            System.out.println("2)Vecinos");
            System.out.println("3)Triforce");
            System.out.println("4)Bono");
            System.out.println("5)Salida");
            respuesta = entrada.nextInt();

            System.out.println("");
            System.out.println("");

            if (respuesta == 1) {
                System.out.println("Ingrese la cadena original: ");
                String cadenaOriginal = entrada.nextLine();
                System.out.println("Ingrese el char a reemplazar: ");
                char caracterReemplazar = entrada.next().charAt(0);
                System.out.println("Ingrese el nuevo char: ");
                char caracterNuevo = entrada.next().charAt(0);
                String cadenaModificada = cadenaOriginal.replaceAll(caracterReemplazar + "", caracterNuevo + "");
                System.out.println("La cadena actualizada es: " + cadenaModificada);

            } else if (respuesta == 2) {
                System.out.println("Ingrese la primera cadena:");
                String cadena1 = entrada.nextLine();

                System.out.println("Ingrese la segunda cadena:");
                String cadena2 = entrada.nextLine();

                boolean iguales = cadena1.equals(cadena2);

                if (cadena1.equals(cadena2)) {
                    System.out.println("Las cadenas son iguales");

                } else {
                    System.out.println("Las cadenas son distintas");
                }
                if (cadena1.equalsIgnoreCase(cadena2)) {
                    System.out.println("Las cadenas son iguales");

                } else {
                    System.out.println("Las cadenas son distintas");
                }

            } else if (respuesta == 3) {
                System.out.println("Elaboraremos la figura.");
                System.out.println("Ingrese un numero entero impar: ");
                int num = entrada.nextInt();

                int c = num;

                for (int fila = 1; fila <= c; fila++) {
                    for (int espacio = c; espacio > fila; espacio--) {
                        System.out.print(" ");

                    }
                    for (int columna = 1; columna <= (2 * fila - 1); columna++) {
                        System.out.print("*");

                    }
                    System.out.println("");
                }

            }else if (respuesta ==4) {
                int cadena1 =0;
                int cadena2 = 0;
                System.out.println("Comenzaremos el anagrama");
                System.out.println("Ingrese Su primera cadena: ");
                cadena1 = entrada.nextInt();
                
                System.out.println("Ingrese su segunda cadena: ");
                cadena2= entrada.nextInt();
                
                
                
                
            }

        }

    }
}

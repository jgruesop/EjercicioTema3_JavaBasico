package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arraySize, i = 0, sum = 0; //Variable para el tamaño de la array
        boolean bandera = true;

        /*
         * 1.- Pedir datos al usuario
         *  1.1.- Pedir tamaño del array
         *  1.2.- Pedir tantos numeros de enteros como el tamaño
         * 2.- Suma todos los arrays
         * 3.- Devolver resultados
         */
        System.out.print("Digite el tamaño del Array: ");
        arraySize = sc.nextInt(); // Guardamos el tamaño de la array

        while (bandera) {

            if (arraySize <= 0) {
                System.out.print("El tamaño del Array no puede ser " + arraySize + ". \nDigite el tamaño del Array: ");
                arraySize = sc.nextInt(); // Guardamos el tamaño de la array
            }else {
                String nombres[]= new String[arraySize]; //Se define el tamaño del array


                for (i = 0; i < nombres.length; i++) {
                    sum += 1;
                    System.out.print("Digite nombre #" + sum + ": ");
                    nombres[i]= sc.next();  //Guardamos cada valor en su posicion
                }

                for (String nombre : nombres) {
                    System.out.print(nombre + " ");
                }

                bandera = false;
            }

        }



    }
}
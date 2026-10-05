/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Emilio
 */
public class Sumatoria {
     public static void main(String[] args) {

        int numero = 1;
        int suma = 0;

        do {
            suma += numero;
            numero++;
        } while (numero <= 50);

        System.out.println("La sumatoria del 1 al 50 es: " + suma);
    }
}

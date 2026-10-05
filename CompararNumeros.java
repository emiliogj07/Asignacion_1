/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Emilio
 */
import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es el mayor.");
            System.out.println(numero2 + " es el menor.");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es el mayor.");
            System.out.println(numero1 + " es el menor.");
        } else {
            System.out.println("Los dos números son iguales.");
        }
    }
}
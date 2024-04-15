/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc1_villanueva;

import java.util.Scanner;

public class Preg03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el número de horas de estacionamiento
        System.out.print("Ingrese el número de horas de estacionamiento: ");
        int horas = scanner.nextInt();

        // Calcular el importe a pagar
        double importe;
        if (horas <= 4) {
            importe = 6.0;
        } else {
            importe = 6.0 + (horas - 4) * 2.0;
        }

        // Mostrar el importe a pagar
        System.out.println("Datos de entrada:");
        System.out.println("Horas: " + horas);
        System.out.println("Datos de salida:");
        System.out.println("Importe a pagar = S/. " + importe);

        // Cerrar el objeto Scanner después de su uso para evitar fugas de recursos
        scanner.close();
    }
}

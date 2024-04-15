/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc1_villanueva;

import java.util.Scanner;

public class Preg04 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer las ganancias
        System.out.print("Ingrese las ganancias: ");
        double ganancia = scanner.nextDouble();

        // Calcular la donación basada en las ganancias
        double donacion;
        if (ganancia <= 1000) {
            donacion = ganancia * 0.05;
        } else if (ganancia <= 1500) {
            donacion = ganancia * 0.07;
        } else if (ganancia <= 2000) {
            donacion = ganancia * 0.08;
        } else if (ganancia <= 5000) {
            donacion = ganancia * 0.10;
        } else {
            donacion = ganancia * 0.15;
        }

        // Mostrar la donación
        System.out.println("Datos de entrada:");
        System.out.println("Ganancia: S/. " + ganancia);
        System.out.println("Datos de salida:");
        System.out.println("Donación = S/. " + donacion);

        // Cerrar el objeto Scanner después de su uso para evitar fugas de recursos
        scanner.close();
    }
}

package uc1_villanueva;

import java.util.Scanner;

public class Preg02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar y leer el valor de n
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        
        // Cerrar el objeto Scanner después de su uso para evitar fugas de recursos
        scanner.close();
        
        // Sumatoria de los n primeros números naturales
        int sumatoria = 0;
        for (int i = 1; i <= n; i++) {
            sumatoria += i;
        }
        
        // Mostrar la sumatoria
        System.out.println("Datos de entrada:");
        System.out.println("n: " + n);
        System.out.println("Datos de salida:");
        System.out.println("Sumatoria = " + sumatoria);
    }
}


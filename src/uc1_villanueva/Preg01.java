
package uc1_villanueva;

import java.util.Scanner;

public class Preg01 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar y leer el valor de A y B
        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();
        
        // Intercambio de valores
        int temp = A;
        A = B;
        B = temp;
        
        // Mostrar los valores intercambiados
        System.out.println("Datos de salida:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        // Cerrar el objeto Scanner después de su uso para evitar fugas de recursos
        scanner.close();
    }
}



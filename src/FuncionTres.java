package src;

import java.util.Scanner;

// Crear una función que determine si un número es par o impar.
public class FuncionTres {
    // Método que determina si un número es par o impar
    //Número par: Un número es par si el resto de dividirlo por 2 es 0 (numero % 2 == 0).
    public String determinarParidad(int numero) {
        if (numero % 2 == 0) {
            return "El número " + numero + " es par.";
            //Número impar: Un número es impar si el resto de dividirlo por 2 es 1 (numero % 2 != 0).
        } else {
            return "El número " + numero + " es impar.";
        }
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Crear una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número: ");
        int numero = scanner.nextInt();

        // Crear una instancia de la clase Funcion3
        FuncionTres funcion = new FuncionTres();

        // Determinar y mostrar si el número es par o impar
        System.out.println(funcion.determinarParidad(numero));

        // Cerrar el scanner
        scanner.close();
    }
}


package src;
import java.util.Scanner;

public class Funcion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los grados Celcius: ");
        float gradosCelcius = scanner.nextFloat();

        float gradosFarenheit = convertirGradosCelsiusAfahrenheit(gradosCelcius);
        System.out.println("Los grados en Farenheit son: " + gradosFarenheit + "°F");
    }

    public static float convertirGradosCelsiusAfahrenheit ( float gradosInCelcius){
           float gradosInFarenheit = (gradosInCelcius * 9 / 5) + 32;
        return gradosInFarenheit;
    }

}

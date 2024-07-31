package src;
// Crear una función que imprima los números del 1 al 10 en la consola.
public class FuncionUno {
    public void imprimirNumeros(){
        for (int i=1;i<=10;i++){ //itera con un for desde el 1 hasta el 10
            System.out.println("Número "+i);
        }
    }
    // Método main para ejecutar el programa
    public static void main (String[]args){
        FuncionUno funcion= new FuncionUno();
    //Llamar al método imprimirNumeros
        funcion.imprimirNumeros();
    }
}

package src;

public class FuncionDos {
    //Crea una funcion que calcule el factorial de un numero
    public void funcionDos(int num){
        int resultado = 1;

        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }

        System.out.printf("El factorial del numero %d es: %d", num, resultado);
    }

    public static void main(String[] args) {
        FuncionDos prueba = new FuncionDos();
        prueba.funcionDos(5); // para 5 resultado esperado 120
    }
}

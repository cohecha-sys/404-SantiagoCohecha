import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingresa numero de la casilla");
            numeros[i] = sc.nextInt();
        }
    }
}


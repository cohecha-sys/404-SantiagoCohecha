import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero" + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Total pares: " + pares);

    }
}

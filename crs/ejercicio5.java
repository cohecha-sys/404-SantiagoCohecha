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

        boolean encontrado = false;

        System.out.println("Ingrese el numero que quiere buscar");
        int numeroAbuscar = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == numeroAbuscar) {
                System.out.println("El numero se encuentra en la posicion" + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El numero no esta en el arreglo.");
        }
        sc.close();
    }
}


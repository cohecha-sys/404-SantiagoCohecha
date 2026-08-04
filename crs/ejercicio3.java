import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedir cantidad de números
        System.out.print("¿Cuántos números va a ingresar? ");
        int n = sc.nextInt();

        // 2. Crear array
        int[] numeros = new int[n];

        // 3. Pedir los números y guardarlos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 4. Inicializar mayor y menor con el primer valor
        int mayor = numeros[0];
        int menor = numeros[0];

        // 5. Recorrer el array para encontrar mayor y menor
        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // 6. Imprimir resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}

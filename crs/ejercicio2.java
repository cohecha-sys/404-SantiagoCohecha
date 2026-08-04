import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes hay? ");
        int n = sc.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }
        double promedio = suma / n;

        if (promedio >= 3.0) {
            System.out.println("Promedio del curso: " + promedio + " → Aprobado");
        } else {
            System.out.println("Promedio del curso: " + promedio + " → Reprobado");
        }
    }
}


import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas temperaturas va a registrar? (en grados celsius) ");
        int n = sc.nextInt();

        double[] temperatura = new double[n];

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Ingrese la temperatura " + (i + 1) + ":");
            temperatura[i] = sc.nextDouble();


        }
        System.out.println("\nClasificacion de temperaturas:");

        for (int i = 0; i < temperatura.length; i++) {

            if (temperatura[i] < 15) {
                System.out.println(temperatura[i] + "°C Frio");
            } else if (temperatura[i] <= 25) {
                System.out.println(temperatura[i] + "°C Templado");
            } else  {
                System.out.println(temperatura[i] + "°C Calor");

            }
        }

        sc.close();

    }
}


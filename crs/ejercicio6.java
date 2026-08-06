import java.util.Scanner;

public class ejercicio6 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos votos se van a registrar?: ");
        int n = sc.nextInt();

        String[] votos = new String[n];

        for (int i = 0; i < votos.length; i++) {
            System.out.print("Ingrese el voto " + (i + 1) + " (A, B o C): ");
            votos[i] = sc.next().toUpperCase();
        }

        int votosA = 0;
        int votosB = 0;
        int votosC = 0;

        for (int i = 0; i < votos.length; i++) {

            if (votos[i].equals("A")) {
                votosA++;
            } else if (votos[i].equals("B")) {
                        votosB++;
            } else if (votos[i].equals("C")) {
                votosC++;
            }
        }

        System.out.println("\nResultado de la votación:");
        System.out.println("Candidato A: " + votosA + " votos");
               System.out.println("Candidato B: " + votosB + " votos");
               System.out.println("Candidato C: " + votosC + " votos");

               if (votosA > votosB && votosA > votosC) {
                   System.out.println("Ganador: Candidato A");
               } else if (votosB > votosA && votosB > votosC) {
                   System.out.println("Ganador: Candidato B");
               } else if (votosC > votosA && votosC > votosB) {
                   System.out.println("Ganador: Candidato C");
               } else {
                    System.out.println("Hay un empate.");


                }
         sc.nextInt();
            }
        }
package Aulas;

import java.util.Scanner;

public class soma {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double n1 = lerNumero("NUMERO 1: ");
        double n2 = lerNumero("NUMERO 2: ");
        double result;
        boolean numeroValido = true;

        numeroValido = false;
        do {

            try {
                System.err.println("numero 1:  ");
                n1 = Double.parseDouble(leitor.nextLine());
                numeroValido = true;
            } catch (NumberFormatException ex) {
                System.err.println("\nERRO");
            }
        } while (!numeroValido);

        numeroValido = false;
        do {
            try {
                System.err.println("numero 2:  ");
                n2 = Double.parseDouble(leitor.nextLine());
                numeroValido = true;
            } catch (NumberFormatException ex) {
                System.err.println("\nERRO");
            }
        } while (!numeroValido);
        result = soma(n1, n2);

        System.err.println("resultado:  " + result);

    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double lerNumero(String mensagem) {
        Scanner leitor = new Scanner(System.in);

        double n = 0;
        boolean numeroValido = true;

        do {

            try {

                System.err.println(mensagem);
                n = Double.parseDouble(leitor.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("\nERRO");
            }
        } while (!numeroValido);

        return n;
    }

    public static int fatorial(int n) {

        if (n == 1) {
            return 1;

        } else {
            return n * fatorial(n - 1);

        }

    }
}

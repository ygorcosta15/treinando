package Aulas;

import java.util.Scanner;

public class TreinandoTratamentoDeErrosComRepeticao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double n1 = 0;
        boolean valido = false;

        do {
            try {
                System.out.println("entre com o primeiro valor:  ");
                n1 = Double.parseDouble(leitor.nextLine());
                valido = true;
            } catch (NumberFormatException ex) {
                System.err.println("ERRO... Entre com valor valido:  ");
            }
        } while (!valido);

        double n2 = 0;
        valido = false;

        do {
            try {
                System.out.println("entre com o segundo valor:  ");
                n2 = Double.parseDouble(leitor.nextLine());
                valido = true;
            } catch (NumberFormatException ex) {
                System.err.println(" ERRO... Entre com valor valido; ");
            }
        } while (!valido);

        String op = "";
        valido = false;

        do {
            try {

                System.out.println("OPerador:  + , - , * ou /  ?");
                op = (leitor.next());
                valido = true;
            } catch (NumberFormatException ex) {
                System.err.println("ERRO ... Operador invalido");
            }

            switch (op) {
                case "+":
                    System.out.println("resultado : " + (n1 + n2));
                    break;
                case "-":
                    System.out.println("resultado: " + (n1 - n2));
                    break;
                case "*":
                    System.out.println("resultado:  " + (n1 * n2));
                    break;
                case "/":
                    System.out.println("resultado : " + (n1 / n2));
                    break;
                default:
            }

        } while (!valido);

    }
}

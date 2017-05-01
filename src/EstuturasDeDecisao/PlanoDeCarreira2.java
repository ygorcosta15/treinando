package EstuturasDeDecisao;

import java.util.Scanner;

;

public class PlanoDeCarreira2 {

    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        String nome, nivel;
        double salario, hora, valor;

        System.err.println("nome do funcionario: ");
        nome = Leitor.next();

        System.err.println("seu nivel: ");
        nivel = Leitor.next();

        System.err.println("quantidade de horas trabalhadas: ");
        hora = Leitor.nextDouble();

        switch (nivel) {

            case "1":

                valor = 15;
                salario = valor * hora;

                System.out.printf(" o funcionario %s trabalhou %.2f horas\n  valor é %.2f\n  nivel dele é 1\n deve receber R$ %.2f\n ", nome, hora, valor, salario);
                break;

            case "2":

                valor = 18;
                salario = valor * hora;
                System.out.printf(" o funcionario %s trabalhou %.2f horas\n  valor é %.2f\n  nivel dele é 2\n deve receber R$ %.2f\n ", nome, hora, valor, salario);
                break;

            case "3":
                valor = 22;
                salario = valor * hora;
                System.out.printf(" o funcionario %s trabalhou %.2f horas\n  valor é %.2f\n  nivel dele é 3\n deve receber R$ %.2f\n ", nome, hora, valor, salario);
                break;

            case "4":

                valor = 27;
                salario = valor * hora;
                System.out.printf(" o funcionario %s trabalhou %.2f horas\n  valor é %.2f\n  nivel dele é 4\n deve receber R$ %.2f\n ", nome, hora, valor, salario);
                break;

            case "5":

                valor = 33;
                salario = valor * hora;
                System.out.printf(" o funcionario %s trabalhou %.2f horas\n  valor é %.2f\n  nivel dele é 5\n deve receber R$ %.2f\n ", nome, hora, valor, salario);
                break;

        }

    }
}

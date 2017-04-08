package EstuturasDeDecisao;

import java.util.Scanner;


public class CalculadoraIf {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor1, valor2, operador, resultado;

        System.out.println("ESCOLHA O OPERADOR");
        System.out.println("1. SOMA");
        System.out.println("2. SUBTRAÇÃO");
        System.out.println("3. MULTIPLICAÇÃO");
        System.out.println("4. DIVISÃO");
        operador = leitor.nextDouble();

        if (operador == 1) {
            System.out.println("PRIMEIRO VALOR: ");
            valor1 = leitor.nextDouble();
            System.out.println("SEGUNDO VALOR:  ");
            valor2 = leitor.nextDouble();

            resultado = valor1 + valor2;
            System.out.println(resultado);

        } else if (operador == 2) {
            System.out.println("PRIMEIRO VALOR: ");
            valor1 = leitor.nextDouble();
            System.out.println("SEGUNDO VALOR:  ");
            valor2 = leitor.nextDouble();

            resultado = valor1 - valor2;
            System.out.println(resultado);

        } else if (operador == 3) {
            System.out.println("PRIMEIRO VALOR: ");
            valor1 = leitor.nextDouble();
            System.out.println("SEGUNDO VALOR:  ");
            valor2 = leitor.nextDouble();

            resultado = valor1 * valor2;
            System.out.println(resultado);

        } else if (operador == 4) {
            System.out.println("PRIMEIRO VALOR: ");
            valor1 = leitor.nextDouble();
            System.out.println("SEGUNDO VALOR:  ");
            valor2 = leitor.nextDouble();

            resultado = valor1 / valor2;
            System.out.println(resultado);
        }else{
            System.out.println("TENTE NOVAMENTE.");
        }

    }
}

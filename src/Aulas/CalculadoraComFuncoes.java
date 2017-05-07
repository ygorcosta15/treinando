package Aulas;
import java.util.Scanner;
public class CalculadoraComFuncoes {

    public static void main(String[] args) {
        double n1 = leNumero("Número 1: ");
        double n2 = leNumero("Número 2: ");
        String op = leOperador();
        double resultado = calculaResultado(n1, n2, op);
        mostraResultado(n1, n2, op, resultado);
    }

    public static double leNumero(String mensagem) {
        Scanner console = new Scanner(System.in);

        double numero = 0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensagem);
                numero = Double.parseDouble(console.nextLine()); // essa linha pode LANÇAR uma NumberFormatException
                valido = true;
            } catch (NumberFormatException ex) { // PEGA a NumberFormatException e trata ela
                System.out.println("Por favor, entre com um número válido...");
            }
        } while (!valido);

        return numero;
    }

    public static String leOperador() {
        Scanner console = new Scanner(System.in);

        // note que, para a leitura do operador, não há necessidade de se usar exceções para o tratamento de erro
        String op = "";
        boolean valido = false;
        do {
            System.out.print("Operação: ");
            op = console.nextLine();
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                valido = true;
            } else {
                System.out.println("Por favor, entre com um operador válido (+, -, *, /)...");
            }
        } while (!valido);

        return op;
    }

    public static double calculaResultado(double n1, double n2, String op) {
        double resultado = 0;

        switch (op) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
        }

        return resultado;
    }

    public static void mostraResultado(double n1, double n2, String op, double resultado) {
        System.out.println(n1 + " " + op + " " + n2 + " = " + resultado);
    }

}


package Aulas;

 import java.util.Scanner ;
public class Vetor {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Quandos dados? ");
        int n = Integer.parseInt(console.nextLine());

        double[] dados = new double[n];

        for (int i = 0; i < dados.length; i++) {
            System.out.print("Entre com o número de índice " + i + ": ");
            dados[i] = Double.parseDouble(console.nextLine());
        }

        double soma = 0;
        for (int i = 0; i < dados.length; i++) {
            soma = soma + dados[i];
        }
        double media = soma / dados.length;

        System.out.print("Dados:");
        for (int i = 0; i < dados.length; i++) {
            System.out.print(" " + dados[i]);
        }
        System.out.println();

        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);
    }

}

package EstuturasDeDecisao;

import java.util.Scanner;

public class CalculadoraSwitch {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double n1, n2;
        int op;

        System.out.println("primeiro numero ");
        n1 = leitor.nextDouble();

        System.out.println("segundo numero  ");
        n2 = leitor.nextDouble();

        System.out.println("operação desejada  \n"
                + "1) soma\n"
                + "2) subtração\n"
                + "3) multiplicação\n"
                + "4) divisão");
        op = leitor.nextInt();

        switch (op) {
            case 1:
                System.out.println("resultado :  " + (n1 + n2));
                break;
            case 2:
                System.out.println("resultado :  " + (n1 - n2));
                break;
            case 3:
                System.out.println("resultado :  " + (n1 * n2));
                break;

            case 4:
                System.out.println("resultado :  " + (n1 / n2));
                break;
            default:
                System.out.println("ERRO !!! TENTE NOVAMENTE");
        }

    }

}

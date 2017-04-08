package EstuturasDeDecisao;

import java.util.Scanner;

public class PapelPedraTesoura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int papel = 11, pedra = 22, tesoura = 33, op;

        System.out.println("1. papel");
        System.out.println("2. pedra");
        System.out.println("3. tesoura");
        op = leitor.nextInt();

        if (op == 1 && op > pedra) {
            System.out.println("vc ganhou");

        } else if (op == 1 && op < tesoura) {
            System.out.println("vc perdeu");
        } else if (op == 2 && op > tesoura) {

        } else if (op == 2 && op < tesoura) {
            System.out.println("vc ganhou");
        } else if (op == 3 && op > pedra) {
            System.out.println("vc ganhou");
            
        }
    }
}


package EstuturasDeDecisao;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String us;
        int po, p1, p2, p3, p4, p5, p6, p7, p8, p9;

        System.out.println("de quem é a vez X || O");
        us = leitor.next();

        System.out.println("Exeplos de posições:\n"
                + " 1 | 2 | 3 \n"
                + "---+---+---\n"
                + " 4 | 5 | 6 \n"
                + "---+---+---\n"
                + " 7 | 8 | 9 \n");

        System.out.println("Qual posição desejada ? ");
        po = leitor.nextInt();

        if (po == 1) {
            System.out.println("Exeplos de posições:\n"
                    + " " + us + " | 2 | 3 \n"
                    + "---+---+---\n"
                    + " 4 | 5 | 6 \n"
                    + "---+---+---\n"
                    + " 7 | 8 | 9 \n");

        } else if (po == 2) {
            System.out.println("Exeplos de posições:\n"
                    + " 1 | " + us + " | 3 \n"
                    + "---+---+---\n"
                    + " 4 | 5 | 6 \n"
                    + "---+---+---\n"
                    + " 7 | 8 | 9 \n");

        } else if (po == 3) {
            System.out.println("Exeplos de posições:\n"
                    + " 1 | 2 |" + us + " \n"
                    + "---+---+---\n"
                    + " 4 | 5 | 6 \n"
                    + "---+---+---\n"
                    + " 7 | 8 | 9 \n");

        } else if (po == 4) {
            System.out.println("Exeplos de posições:\n"
                    + " 1 | 2 | 3 \n"
                    + "---+---+---\n"
                    + " " + us + "| 5 | 6 \n"
                    + "---+---+---\n"
                    + " 7 | 8 | 9 \n");

        } else if (po == 5) {
            System.out.println("Exeplos de posições:\n"
                    + " 1 | 2 | 3 \n"
                    + "---+---+---\n"
                    + " 4 | " + us + " | 6 \n"
                    + "---+---+---\n"
                    + " 7 | 8 | 9 \n");

        } else if (po == 6) {
            System.out.println("Exeplos de posições:\n"
                    + " 1 | 2 | 3 \n"
                    + "---+---+---\n"
                    + " 4 | 5 |" + us + " \n"
                    + "---+---+---\n"
                    + " 7 | 8 | 9 \n");

        } else if (po == 7) {
            System.out.println("Exeplos de posições:\n"
                    + " 1 | 2 | 3 \n"
                    + "---+---+---\n"
                    + " 4 | 5 | 6 \n"
                    + "---+---+---\n"
                    + " " + us + " | 8 | 9 \n");

        } else if (po == 8) {
            System.out.println("Exeplos de posições:\n"
                    + " 1 | 2 | 3 \n"
                    + "---+---+---\n"
                    + " 4 | 5 | 6 \n"
                    + "---+---+---\n"
                    + " 7 | " + us + " | 9 \n");

        } else if (po == 9) {
            System.out.println("Exeplos de posições:\n"
                    + " 1 | 2 | 3 \n"
                    + "---+---+---\n"
                    + " 4 | 5 | 6 \n"
                    + "---+---+---\n"
                    + " 7 | 8 |" + us + " \n");

        }

    }

}

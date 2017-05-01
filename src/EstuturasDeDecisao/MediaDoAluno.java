package EstuturasDeDecisao;

import java.util.Scanner;

public class MediaDoAluno {

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        float nota1, nota2, nota3, media, aux;

        System.err.print("Digite a nota 1:  ");
        nota1 = leitor.nextFloat();

        System.err.print("Digite a nota 2:  ");
        nota2 = leitor.nextFloat();

        media = ((nota1 + nota2) / 2);

        if (media >= 6) {

            System.err.println("\nVocê Passou: " + media);

        } else {

            System.err.println("\nVocê não Passou:  " + media);
        }
        System.err.println(" Digite a nota 3 : ");
        nota3 = leitor.nextFloat();

        if (nota1 < nota2) {
            media = ((nota2 + nota3) / 2);

        }
        if (media == 6) {
            System.err.println("\nVocê Passou " + media);

        } else {
            System.err.println("\nVocê foi reprovado " + media);
        }
        if (nota1 > nota2) {
            media = ((nota1 + nota3) / 2);

        }
        if (media == 6) {

            System.err.println("\nVocê Passou " + media);

        } else {
            System.err.println("\nVocê foi Reprovado " + media);
        }

    }
}

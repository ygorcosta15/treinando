package ProjetoJogo;

/*
1.Mostrar o tabuleiro e instruções aos jogadores  FEITO.
2.Pedir ao PLAYER 1 a entrada dos dados "Palavra  "  FEITO;
3.Pedir a confirmação ao PLAYER 1 se ele esta certo da palavra desejada.
4.Usario 2 tera 5 chances.
 */
import java.util.Arrays;
import java.util.Scanner;

public class PiJogoDaVelha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

//        String[] Resposta = new String[100];// rrespostas do player 2.

        tabuleiro();
       entradaDeDados();
       

    }

    public static void tabuleiro() {
        System.out.println("\n**** PROJETO INTEGRADOR ****");

        System.out.println("\n****JOGO DA FORCA ****");

        System.out.println("\n*****INTROÇÕES:*****\n");
        System.out.println("Esse jogo e para ser jogado de duas pessoas do seguinte modo: a primeira pessoa\n");
        System.out.println("Player 1 entrara com a palavra desejada, após inserir a\npalavra conifirmar se esta correta e o jogo se iciara");
        System.out.println("Player 2 tera 5 tentativas para acertar a palavra inserida pelo Player 1.\n");

        System.out.println("****-----¬**************************");
        System.out.println("****|***_|_*************************");
        System.out.println("****|****|**************************");
        System.out.println("****|****O**************************");
        System.out.println("****|***/|\\************************");
        System.out.println("****|****|**************************");
        System.out.println("****|****|**************************");
        System.out.println("****|***/*\\************************");
        System.out.println("****|*******************************");
        System.out.println("____|_________**********************");

    }

    public static String[] entradaDeDados() {
        Scanner leitor = new Scanner(System.in);

        
        String[] Frase = new String[100];
        int confirmar = 1;
        boolean valido = false;

        do {

            System.out.println("\n\n****PLAYER 1 ****");
            System.out.println("\nCertifique-se que o outro jogador nao veja e digite a palavra ou a frase desejada: ");
            

            try {
                System.out.printf("\n %s,? (PARA CONFIRMAR DIGITE '1' CASO NÃO ESTEJA DIGITE '2' ? ", Arrays.toString(Frase));
                confirmar = leitor.nextInt();
                valido = true;
            } catch (NumberFormatException ex) {
                System.out.println("ERRO!!! TENTE NOVAMENTE");
            }

        } while (confirmar != 1);

        return Frase;
    }

   

}

package Aulas;

/*  MATRIZ
CONJUNTOS DO MESMO TIPO EM TABULEIRO.

 */
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] m = new int[4][3]; //Primerio linha depois coluna

        for (int i = 0; i < m.length; i++) { // Linhas.
            for (int j = 0; j < m[i].length; j++) { // Colunas.
                m[i][j] = 0;
            }
        }

    }
}



/*
 ******EXERCICIOS*******
    CRIAR UM JOGO CONECTA 4
6 LINHAS 
7 COLUNAS

*/
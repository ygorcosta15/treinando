package Aulas;

import java.util.Scanner;

/*      VETOR 
    Conjunto de variaveis:
    - Do mesmo tipo.
    -  Tamanho fixo.
    - Conjunto de variaveis indexados.
 */
public class Vetor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double[] numeros = new double[4];
       
        for (int i = 0; i<numeros.length; i++ ) //length = dentro e fora do laço
        
        numeros [i] = Double.parseDouble(leitor.nextLine());
        
    }
}

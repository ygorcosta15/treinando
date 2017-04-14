/*
Escreva um programa que mostra 
a soma dos 10000 primeiros termos
da seguinte série:
soma = 1 + 3 + 5 + 7 + 9 + ...
 */
package EstrutasDerepeticao;

import java.util.Scanner;

public class SomaDaSerie {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int aux, soma = 0, numero;

        for (numero = 1; numero <=12; numero = numero + 2) {

            System.out.println("saida:" + numero);

        }
            while ( numero > 0){
                aux = numero %10;
                soma = soma + aux;
                numero = numero / 10;
            }
        System.out.println("soma:  "+ soma);
    }
    
}

/*
Escreva um programa que lê um 
número e mostra a soma dos seus dígitos.
 */
package EstrutasDerepeticao;

import java.util.Scanner;

public class SomasDosDigitos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        int aux,soma= 0,numero;
        
        System.out.println("informe numero:  ");
        numero = leitor.nextInt();
        
        while ( numero > 0){
            aux = numero %10;
            soma = soma + aux;
            numero = numero /10;
        }
        System.out.println("soma:  "+ soma);
    }

}


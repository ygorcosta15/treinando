package projeto.integrador;

import java.util.Scanner;

public class Consulmo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double km, combustivel, resultado;

        System.out.println("Quantos litros voce abasteceu o seu carro ?  ");
        combustivel = leitor.nextDouble();
        System.out.println("Quantos Km/l voce percorreu com o seu carro?  ");
        km = leitor.nextDouble();

        resultado = km / combustivel;

        System.out.println("Voce está consumindo :  " + resultado);
    }
}

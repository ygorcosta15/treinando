package EstruturasSequencias;

import java.util.Scanner;

public class SalarioPorHora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        double tHoras, vHoras, aSerPago;

        System.out.println("seu nome:  ");
        nome = leitor.next();

        System.out.println("Horas trabalhadas:  ");
        tHoras = leitor.nextDouble();

        System.out.println("Valor das horas trabalhadas:  ");
        vHoras = leitor.nextDouble();

        aSerPago = (tHoras * vHoras);

        System.out.println("O  " + nome);
        System.out.println("trabalhou:  " + tHoras);
        System.out.println("por:  " + vHoras);
        System.out.println("deve ser pago:  " + aSerPago);
        
    }
}

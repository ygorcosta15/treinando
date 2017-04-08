package EstuturasDeDecisao;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        double peso,imc; int altura ;

        System.out.println("seu nome:  ");
        nome = leitor.next();

        System.out.println("peso:  ");
        peso = leitor.nextDouble();

        System.out.println("altura:  ");
        altura = leitor.nextInt();

        imc = (peso / (altura * altura));

        if (imc < 18.5) {
            System.out.println("abaixo do peso");
        
        } else if (imc <= 18.5 && imc < 25) {
            System.out.println("peso normal");
        
        } else if (imc <= 25 && imc < 30) {
            System.out.println("acima do peso");
        
        } else if (imc >= 30) {
            System.out.println("obesidade");
        }
        System.out.println(nome + "  esta com o indice de massa corporal  " + imc);
    } 
}

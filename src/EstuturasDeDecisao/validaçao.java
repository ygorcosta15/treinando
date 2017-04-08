  package EstuturasDeDecisao;

import java.util.Scanner;

public class validaçao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int resultado;

        System.out.println("informe um valor de 1 a 12:   ");
        resultado = leitor.nextInt();
        
        resultado = resultado * 2;

        if (resultado <= 12) {
        
            System.out.println("valor valido:" + resultado);
        
        } else {
            
            System.out.println("valor invalido: " + resultado);
        }

    }

}

package EstuturasDeDecisao;

import java.util.Scanner;

public class TransportesDeMateriais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double temperatura;
        String tipo;
        boolean podeTransportar = false;

        System.out.println("TIPO DE MERCADORIA: ");
        tipo = leitor.next();
        tipo = tipo.toUpperCase();

        System.out.println("TEMPERATURA: ");
        temperatura = leitor.nextDouble();

        switch (tipo/*.toUpperCase()*/) {
            case "A":
                if (temperatura >= 10 && temperatura <= 17) {
                    
                    /*System.out.println("PODE TRANSPORTAR  ");*/
                    podeTransportar = true;
                } else {
                    /*System.out.println("não pode transportar");*/
                    podeTransportar = false;
                }
                break;
                
                
            case "B":
                if (temperatura >= 11 && temperatura <= 16) {
                    
                    /*System.out.println("PODE TRANSPORTAR");*/
                    podeTransportar = true;
                } else {
                    /* System.out.println("NÃO PODE TRANSPORTAR  ");*/
                    podeTransportar = false;
                }
                break;

            case "C":
                if (temperatura >= 12 && temperatura <= 15) {
                    
                    /*System.out.println("PODE TRANSPORTAR");*/
                    podeTransportar = true;
                } else {
                    /*System.out.println("NÃO PODE TRANSPORTAR ");*/
                    podeTransportar = false;
                }
                break;
                
            case "D":
                if (temperatura >= 13 && temperatura <= 14) {
                    /*System.out.println("PODE TRANSPORTAR  ");*/
                    podeTransportar = true;
                } else {
                    /*System.out.println("NÃO PODE TRANPORTAR  ");*/
                    podeTransportar = false;
                }
                break;

        }

        if (podeTransportar) {
            System.out.println("PODE TRANSPORTAR");
        } else {
            System.out.println("NÃO PODE TRANSPORTAR");
        }

    }
}

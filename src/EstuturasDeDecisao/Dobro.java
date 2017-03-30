package EstuturasDeDecisao;

import java.util.Scanner;

public class Dobro {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
            
        
        int a;
        
        System.out.println("informe um valor de 1 a 12:   ");
        a = leitor.nextInt();
        a= a*a;
        
        if(a <= 12){
            System.out.println("valor valido:" + a);
        }else{
            System.out.println("valor invalido: " + a);
        }
        
    }

}

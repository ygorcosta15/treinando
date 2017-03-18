package projeto.integrador;

import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double v1, v2, h;
        
        System.out.printf("entre com o valor 1:  ");
        v1 = leitor.nextDouble();
        
        System.out.printf("entre com o valor 2:  ");
        v2 = leitor.nextDouble();
        
        h = Math.sqrt(v1 * v1 + v2 * v2);
        
        System.out.printf("A hipotenusa é :  :   " + h);
    }
}

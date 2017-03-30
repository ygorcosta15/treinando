package EstruturasSequencias;

import java.util.Scanner;

public class ContaTelefonica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        double total;
        double assinatura = 23.32;
        double lgLocais;
        double lgInterubanas;
        double lgInternacionais;
        
        System.out.println("informe os minutos gastos na ligação locais:  ");
        lgLocais = leitor.nextDouble();
        
        System.out.println("informe os minutos gastos em locações internacionais:  ");
        lgInternacionais = leitor.nextDouble();
        
        System.out.println("informe os minutos gastos em locações interrubanas:  ");
        lgInterubanas = leitor.nextDouble();
        
        
        lgLocais = lgLocais * 0.09;
        lgInternacionais = lgInternacionais * 0.26;
        lgInterubanas = lgInterubanas * 0.86;
        
        total = lgLocais + lgInternacionais + lgInterubanas + assinatura;
        
        System.out.println("valor da assinatura:  " + assinatura);
        System.out.println("valor das ligações internacionais:  " + lgInternacionais);
        System.out.println("valor das ligações loicais: " + lgLocais);
        System.out.println("valor das ligações interubanas:" + lgInterubanas);
        System.out.println("total a pagar:  " + total);
        
        
    }
}

package projeto.integrador;

import java.util.Scanner;

public class Saudação {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int dias, mes;

        System.out.println("mes");
        mes = leitor.nextInt();

        if (mes == 2) {
            dias = 28;
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 31;

            }
        }
        System.out.println(dias);
    }

}

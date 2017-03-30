package EstruturasSequencias;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double c, f;

        System.out.println("Digite a temperatura em fahrenheit:");

        f = leitor.nextDouble();

        c = 5 / 9 * (f - 32);

        System.out.println(" A temperatura convertida para Graus Celsius é:" + c);

    }

}

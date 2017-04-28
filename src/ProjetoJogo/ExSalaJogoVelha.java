package ProjetoJogo;

import java.util.Scanner;

public class ExSalaJogoVelha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String p1="1", p2="2", p3="3", p4="4", p5="5", p6="6", p7="7", p8="8", p9="9";
        String usuario=" ", usuario2=" ";
        int pos;
        usuario.toLowerCase();
        usuario2.toLowerCase();
        
        System.out.println("de quem é a  vez  (X || O) ");
        usuario = leitor.next();
        if (usuario.contentEquals("x")) {
            usuario2 = "o";
        } else {
            usuario2 = "x";
        }

        System.out.println("Exeplos de posições:\n"
                + " 1 | 2 | 3 \n"
                + "---+---+---\n"
                + " 4 | 5 | 6 \n"
                + "---+---+---\n"
                + " 7 | 8 | 9 \n");

        System.out.println("Usuario 1 escolha a posição:  ");
        pos = leitor.nextInt();

        if (pos == 1) {
            p1 = usuario;

        } else if (pos == 2) {
            p2 = usuario;
        } else if (pos == 3) {
            p3 = usuario;
        
        } else if (pos == 4) {
            p4 = usuario;
        } else if (pos == 5) {
            p5 = usuario;
        } else if (pos == 6) {
            p6 = usuario;
        } else if (pos == 7) {
            p7 = usuario;
        } else if (pos == 8) {
            p8 = usuario;
        } else if (pos == 9) {
            p9 = usuario;

        }
         System.out.println("Exeplos de posições:\n"
                + p1 + "    |  " + p2 + "  |   " + p3+ "\n"
                + "-----+-----+-----\n"
                + p4 + "    |  " + p5 + "  |  " + p6+ "\n"
                + "-----+-----+-----\n"
                + p7 + "    |  " + p8 + "  |  " + p9+ "\n");
                
         
         for( int cont=0; cont<= 6; cont=cont+1) {
             System.out.println("Usuario 2 escolha a posição:" + usuario2);
             pos = leitor.nextInt();
             
           if (pos == 1) {
            p1 = usuario2;

        } else if (pos == 2) {
            p2 = usuario2;
        } else if (pos == 3) {
            p3 = usuario2;
        
        } else if (pos == 4) {
            p4 = usuario2;
        } else if (pos == 5) {
            p5 = usuario2;
        } else if (pos == 6) {
            p6 = usuario2;
        } else if (pos == 7) {
            p7 = usuario2;
        } else if (pos == 8) {
            p8 = usuario2;
        } else if (pos == 9) {
            p9 = usuario2;

        }
                    System.out.println("Exeplos de posições:\n"
                + p1 + "    |  " + p2 + "  |   " + p3+ "\n"
                + "-----+-----+-----\n"
                + p4 + "    |  " + p5 + "  |  " + p6+ "\n"
                + "-----+-----+-----\n"
                + p7 + "    |  " + p8 + "  |  " + p9+ "\n");
         } 
         
         System.out.println("Usuario 1 escolha a posição:" + usuario);
         pos = leitor.nextInt();
         
            if (pos == 1) {
            p1 = usuario;
        } else if (pos == 2) {
            p2 = usuario;
        } else if (pos == 3) {
            p3 = usuario;        
        } else if (pos == 4) {
            p4 = usuario;
        } else if (pos == 5) {
            p5 = usuario;
        } else if (pos == 6) {
            p6 = usuario;
        } else if (pos == 7) {
            p7 = usuario;
        } else if (pos == 8) {
            p8 = usuario;
        } else if (pos == 9) {
            p9 = usuario;

        }
                    System.out.println("Exeplos de posições:\n"
                + p1 + "    |  " + p2 + "  |   " + p3+ "\n"
                + "-----+-----+-----\n"
                + p4 + "    |  " + p5 + "  |  " + p6+ "\n"
                + "-----+-----+-----\n"
                + p7 + "    |  " + p8 + "  |  " + p9+ "\n");
    }
}

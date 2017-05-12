package ProjetoJogo;

import java.util.Scanner;

public class Connecta4 {

    
    final static int WIDTH = 6;
    final static int HEIGHT = 6;
    final static int BOTTOM_ROW = WIDTH - 1;

    
    static char[][] board = new char[WIDTH][HEIGHT];

    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        CreateBoard();

        
        System.out.println("Qual coluna?   ");

        
        PrintBoard();

        
        boolean flag = true;

        
        while (flag) {
            DropX();
            PrintBoard();

            
            if (!CheckX()) {
                flag = false;
                break; 
            }

            DropO();
            PrintBoard();

           
            if (!CheckO()) {
                flag = false;
                break; 
            }
        }
    }

    public static void CreateBoard() {
        
        for (int w = 0; WIDTH > w; w += 1) {
            for (int h = 0; HEIGHT > h; h += 1) {
                board[w][h] = '.';
            }
        }
    }

    public static void PrintBoard() {
        
        for (int w = 0; WIDTH > w; w += 1) {
            for (int h = 0; HEIGHT > h; h += 1) {
                System.out.print(board[w][h]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void DropX() {
        
        int counter = 1;

        
        System.out.println("JOGADOR 1");

        
        int column = scanner.nextInt();

        while (true) {
            if (column > WIDTH) {
                System.out.println("COLUNA INVALIDA");
                break;
            }

            if (board[BOTTOM_ROW][column] == '.') {
                board[BOTTOM_ROW][column] = 'X';
                break;
            } else if (board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O') {
                if (board[BOTTOM_ROW - counter][column] == '.') { 
                    board[BOTTOM_ROW - counter][column] = 'X';
                    break; 
                }
            }
            counter += 1; 
            if (counter == WIDTH) { 
                System.out.println("COLUNA CHEIA");
                break;
            }
        }
    }

    public static void DropO() {
        
        int counter = 1;

        
        System.out.println("Jogador 2");

        
        int column = scanner.nextInt();

        while (true) {
            if (column > WIDTH) {
                System.out.println("COLUNA INVALIDA");
                break;
            }

            if (board[BOTTOM_ROW][column] == '.') {
                board[BOTTOM_ROW][column] = 'O';
                break; 
            } else if (board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O') { 
                if (board[BOTTOM_ROW - counter][column] == '.') { 
                    board[BOTTOM_ROW - counter][column] = 'O';
                    break; 
                }
            }
            counter += 1; 
            if (counter == WIDTH) { 
                System.out.println("ESTA COLUNA ESTA CHEIA");
                break;
            }
        }
    }

    public static boolean CheckXHorizontal() {
        
        boolean flag = true;

        
        int counter = 0;
        while (flag) {

            
            for (int w = 0; WIDTH > w; w += 1) {
                for (int h = 0; HEIGHT > h; h += 1) {
                    if (board[w][h] == 'X') { 
                        counter += 1;
                    } else {
                        counter = 0; 
                    }
                    if (counter >= 4) {
                        System.out.println("Jogador 1 Ganhou");
                        flag = false;
                    }
                }
            }
            break;
        }
        return flag;
    }

    public static boolean CheckXVertical() {
      
        boolean flag = true;

      
        int counter = 0;
        while (flag) {

      
            for (int h = 0; HEIGHT > h; h += 1) {
                for (int w = 0; WIDTH > w; w += 1) {
                    if (board[w][h] == 'X') {
                        counter += 1;
                    } else {
                        counter = 0; 
                    }
                    if (counter >= 4) {
                        System.out.println("jogador 1 gamhou"); 
                        flag = false;
                    }
                }
            }
            break;
        }
        return flag;
    }

    public static boolean CheckOVertical() {
        //creates boolean to act as flag
        boolean flag = true;

        
        int counter = 0;
        while (flag) {

          
            for (int h = 0; HEIGHT > h; h += 1) {
                for (int w = 0; WIDTH > w; w += 1) {
                    if (board[w][h] == 'O') {
                        counter += 1;
                    } else {
                        counter = 0; // 
                    }
                    if (counter >= 4) {
                        System.out.println("ogador 2 gamhou"); 
                        flag = false;
                    }
                }
            }
            break;
        }
        return flag;
    }

    public static boolean CheckOHorizontal() {
       
        boolean flag = true;

       
        int counter = 0;
        while (flag) {

            
            for (int w = 0; WIDTH > w; w += 1) {
                for (int h = 0; HEIGHT > h; h += 1) {
                    if (board[w][h] == 'O') { 
                        counter += 1;
                    } else {
                        counter = 0; // 
                    }
                    if (counter >= 4) {
                        System.out.println("Jogadorr 2 Ganhou");
                        flag = false;
                    }
                }
            }
            break;
        }
        return flag;
    }

    public static boolean CheckXDiagonalForward() {
        
        boolean flag = true;

        int counter = 0;

        Boolean check = false;

        int checkColumn = 1;
        int checkRow = 1;

        while (flag) {
            for (int w = 0; WIDTH > w; w += 1) {
                for (int h = 0; HEIGHT > h; h += 1) {
                    if (board[w][h] == 'X') {
                        counter += 1;
                        check = true;
                        while (check) { //goes through diagonally looking for Xs
                            if (checkColumn + w <= WIDTH - 1 && checkRow + h <= HEIGHT - 1) {
                                if (board[w + checkColumn][h + checkRow] == 'X') {
                                    counter += 1;
                                }
                            }

                            checkColumn += 1;
                            checkRow += 1;

                            if (checkColumn == WIDTH - 1 || checkRow == HEIGHT - 1) {
                                check = false;
                                break;
                            }

                            if (counter >= 4) {
                                System.out.println("jogador 1 Ganhouuu");
                                check = false;
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (counter >= 4) {
                        flag = false;
                        break;
                    }

                    counter = 0;
                    checkColumn = 1;
                    checkRow = 1;
                }
            }
            break;
        }
        return flag;
    }

    public static boolean CheckODiagonalForward() {

        boolean flag = true;

        int counter = 0;

        Boolean check = false;

        int checkColumn = 1;
        int checkRow = 1;

        while (flag) {
            for (int w = 0; WIDTH > w; w += 1) {
                for (int h = 0; HEIGHT > h; h += 1) {
                    if (board[w][h] == 'O') {
                        counter += 1;
                        check = true;
                        while (check) {
                            if (checkColumn + w <= WIDTH - 1 && checkRow + h <= HEIGHT - 1) {
                                if (board[w + checkColumn][h + checkRow] == 'O') {
                                    counter += 1;
                                }
                            }

                            //adds 1 to checkers
                            checkColumn += 1;
                            checkRow += 1;

                            if (checkColumn == WIDTH - 1 || checkRow == HEIGHT - 1) {
                                check = false;
                                break;
                            }

                            if (counter >= 4) {
                                System.out.println("Jogador 2 Ganhou");
                                check = false;
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (counter >= 4) {
                        flag = false;
                        break;
                    }

                    counter = 0;
                    checkColumn = 1;
                    checkRow = 1;
                }
            }
            break;
        }
        return flag;
    }

    public static boolean CheckXDiagonalBack() {

        boolean flag = true;

        int counter = 0;

        Boolean check = false;

        int checkColumn = 1;
        int checkRow = 1;

        while (flag) {
            for (int w = 0; WIDTH > w; w += 1) {
                for (int h = 0; HEIGHT > h; h += 1) {
                    if (board[w][h] == 'X') {
                        counter += 1;
                        check = true;
                        while (check) {
                            if (w - checkColumn >= 0 && h - checkRow >= 0) {
                                if (board[w - checkColumn][h - checkRow] == 'X') {
                                    counter += 1;
                                }
                            }

                            checkColumn += 1;
                            checkRow += 1;

                            if (checkColumn == 0 || checkRow == HEIGHT - 1) {
                                check = false;
                                break;
                            }

                            if (counter >= 4) {
                                System.out.println("Jogador 1 Ganhou");
                                check = false;
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (counter >= 4) {
                        flag = false;
                        break;
                    }

                    counter = 0;
                    checkColumn = 1;
                    checkRow = 1;
                }
            }
            break;
        }
        return flag;
    }

    public static boolean CheckODiagonalBack() {

        boolean flag = true;

        int counter = 0;

        Boolean check = false;

        int checkColumn = 1;
        int checkRow = 1;

        while (flag) {

            for (int w = 0; WIDTH > w; w += 1) {
                for (int h = 0; HEIGHT > h; h += 1) {
                    if (board[w][h] == 'O') {
                        counter += 1;
                        check = true;
                        while (check) {
                            if (w - checkColumn >= 0 && h - checkRow >= 0) {
                                if (board[w - checkColumn][h - checkRow] == 'O') {
                                    counter += 1;
                                }
                            }

                            checkColumn += 1;
                            checkRow += 1;

                            if (checkColumn == 0 || checkRow == HEIGHT - 1) {
                                check = false;
                                break;
                            }

                            if (counter >= 4) {
                                System.out.println("jogador 2");
                                check = false;
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (counter >= 4) {
                        flag = false;
                        break;
                    }

                    counter = 0;
                    checkColumn = 1;
                    checkRow = 1;
                }
            }
            break;
        }
        return flag;
    }

    public static boolean CheckX() {

        boolean flag = true;

        if (!CheckXVertical() || !CheckXHorizontal() || !CheckXDiagonalBack() || !CheckXDiagonalForward()) {
            flag = false;
        }
        return flag;
    }

    public static boolean CheckO() {

        boolean flag = true;

        if (!CheckOVertical() || !CheckOHorizontal() || !CheckODiagonalBack() || !CheckODiagonalForward()) {
            flag = false;
        }
        return flag;
    }
}

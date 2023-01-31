package src_tictactoe;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainfile {
    static int input_num;
    static String sym1, sym2;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        System.out.println("oO--Welcome to Tic Tac Toe--Xx");
        System.out.println("Choose between X and O");
        System.out.println("Press 1 for [X], Press 2 for [O]");

        while (true) {
  
            try {
                System.out.print("Input: ");
                input_num = scan.nextInt();

                if (input_num < 3 && input_num != 0) {
                    gameMenu.main_menu(input_num);
                    sym1 = gameMenu.user_player;
                    sym2 = gameMenu.comp_player;

                    System.out.print("\nLoading");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(".");
                        Thread.sleep(1500);
                    }

                    clrscr();
                    gameScreen.game();
                    break;
                } else {
                    System.out.println("Your input is out of range. Please select 1 or 2 only");
                    continue;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again...");
                scan.nextLine();
            }

        } 

    }

    public static void clrscr() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }

    }

}

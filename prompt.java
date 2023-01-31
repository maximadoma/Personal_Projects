package src_tictactoe;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class prompt {

    static int input_num;
    static Scanner scan = new Scanner(System.in);
    static Random rndm = new Random();
    static boolean pos_taken = false;

    static void promtPlayer() {
        boolean pos_taken = false;
        while (true) {

            try{
            System.out.print("Enter your placement from 1-9: ");
            input_num = scan.nextInt();
            pos_taken = eval_input.VerifyPos(input_num);
            if (pos_taken == false) {
                eval_input.v_input(input_num, mainfile.sym1);
                break;
            } else if (whowins.winnerBasis(pos_taken) == true) {

                break;

            } else {
                System.out.println("Posistion is already taken!");
            }
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again...");
            scan.nextLine();
        }

        }
    }

    static void promtComputer() {
        Random rndm = new Random();
        boolean pos_taken = false;
        while (true) {
            input_num = rndm.nextInt(9) + 1;
            pos_taken = eval_input.VerifyPos(input_num);
            if (pos_taken == false) {
                System.out.println("Computer choose: "+input_num);
                eval_input.v_input(input_num, mainfile.sym2);
                break;
            } else if (whowins.winnerBasis(pos_taken) == true) {
                break;

            } else {
                input_num = rndm.nextInt(9) + 1;
            }
    

        }

    }



}

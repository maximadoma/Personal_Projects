package src_tictactoe;

import java.util.Random;

public class eval_input {

    static String v_input;
    static int com_input;
    static String[] table = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
    static Random rndm = new Random();

    static void Board() {
        System.out.println("\t  "+table[1] + " | " + table[2] + " | " + table[3]+"  ");
        System.out.println("\t----" + "+" + "---" + "+" + "----");
        System.out.println("\t  "+table[4] + " | " + table[5] + " | " + table[6]+"  ");
        System.out.println("\t----" + "+" + "---" + "+" + "----");
        System.out.println("\t  "+table[7] + " | " + table[8] + " | " + table[9]+"  \n\n");
        System.out.println("-".repeat(35));


    }

    static int v_input(int pos_num, String symbol) {

        switch (pos_num) {
            case 1:
                v_input = table[1] = symbol;
                break;
            case 2:
                v_input = table[2] = symbol;
                break;
            case 3:
                v_input = table[3] = symbol;
                break;
            case 4:
                v_input = table[4] = symbol;
                break;
            case 5:
                v_input = table[5] = symbol;
                break;
            case 6:
                v_input = table[6] = symbol;
                break;
            case 7:
                v_input = table[7] = symbol;
                break;
            case 8:
                v_input = table[8] = symbol;
                break;
            case 9:
                v_input = table[9] = symbol;
                break;
            default:
                break;
        }
        ;
        return pos_num;
    }

    static boolean VerifyPos(int input_num) {
        if (table[input_num].equals("X") || table[input_num].equals("O")) {
            return true;
        } else {
            return false;
        }

    }

}

package src_tictactoe;

public class whowins {
    static String title;

    static boolean winnerBasis(boolean winner) {

        if (eval_input.table[1].equals("X") && eval_input.table[2].equals("X") && eval_input.table[3].equals("X")
                || eval_input.table[4].equals("X") && eval_input.table[5].equals("X") && eval_input.table[6].equals("X")
                || eval_input.table[7].equals("X") && eval_input.table[8].equals("X") && eval_input.table[9].equals("X")
                || eval_input.table[1].equals("X") && eval_input.table[5].equals("X") && eval_input.table[9].equals("X")
                || eval_input.table[3].equals("X") && eval_input.table[5].equals("X") && eval_input.table[7].equals("X")
                || eval_input.table[1].equals("X") && eval_input.table[4].equals("X") && eval_input.table[7].equals("X")
                || eval_input.table[2].equals("X") && eval_input.table[5].equals("X") && eval_input.table[8].equals("X")
                || eval_input.table[3].equals("X") && eval_input.table[6].equals("X")
                        && eval_input.table[9].equals("X")) {
            if (mainfile.sym1.equals("X")) {
                title = "\tPLAYER [X]  WINS!\n";
            } else if (mainfile.sym2.equals("X")) {
                title = "\tCOMPUTER [X]  WINS!\n";
            }
            return true;

        } else if (eval_input.table[1].equals("O") && eval_input.table[2].equals("O") && eval_input.table[3].equals("O")
                || eval_input.table[4].equals("O") && eval_input.table[5].equals("O") && eval_input.table[6].equals("O")
                || eval_input.table[7].equals("O") && eval_input.table[8].equals("O") && eval_input.table[9].equals("O")
                || eval_input.table[1].equals("O") && eval_input.table[5].equals("O") && eval_input.table[9].equals("O")
                || eval_input.table[3].equals("O") && eval_input.table[5].equals("O") && eval_input.table[7].equals("O")
                || eval_input.table[1].equals("O") && eval_input.table[4].equals("O") && eval_input.table[7].equals("O")
                || eval_input.table[2].equals("O") && eval_input.table[5].equals("O") && eval_input.table[8].equals("O")
                || eval_input.table[3].equals("O") && eval_input.table[6].equals("O")
                        && eval_input.table[9].equals("O")) {
            if (mainfile.sym1.equals("O")) {
                title = "\tPLAYER [O]  WINS!\n";
            } else if (mainfile.sym2.equals("O")) {
                title = "\tCOMPUTER [O]  WINS!\n";
            }
            return true;

        }

        for (int i = 1; i < 9; ++i) {
            if (eval_input.table[i].equals(" ")) {
                return false;
            } else {
                title = "\t  DRAW!\n";
            }

        }

        return true;

    }

    static boolean declareWin(boolean winner) {
        System.out.println(title);
        return true;

    }
}

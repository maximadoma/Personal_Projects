package src_tictactoe;

public class gameScreen {
    static boolean winner = false;
    static void game () throws InterruptedException{
        while (true) {
            System.out.println("---Player [" + mainfile.sym1 + "] VS. Computer [" + mainfile.sym2 + "]---\n\n");
            eval_input.Board();
            if (winner == whowins.winnerBasis(winner)) {
                prompt.promtPlayer();
                prompt.promtComputer();
                Thread.sleep(1600);
                mainfile.clrscr();
            } else {
                whowins.declareWin(winner);   
                break;
            }
        }
    }

}

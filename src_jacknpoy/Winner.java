package src_jacknpoy;

public class Winner {
    
    static void check_whoWins(int sys_score,  int user_score){
        if (user_score == 5){
            System.out.println("---Final Score---");
            System.out.println("System Score: "+sys_score);
            System.out.println("User Score: "+user_score);
            System.out.println("---User Wins!---");
            System.out.println("Congratulations!");

        }
        if (sys_score == 5){
            System.out.println("---Final Score---");
            System.out.println("System Score: "+sys_score);
            System.out.println("User Score: "+user_score);
            System.out.println("Computer Wins!");
            System.out.println("Better Luck next time!");
        }
    }
}

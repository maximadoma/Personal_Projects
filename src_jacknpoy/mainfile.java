package src_jacknpoy;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class mainfile {
    static String[] opt = { "Rock", "Paper", "Scissors" };
    static Random rndm = new Random();
    static int sys_score, user_score, player_s, computer_s;
    static String input, sys_in;
 
    public static void main(String[] args) throws InterruptedException {
       Scanner scan = new Scanner(System.in);
       boolean gamecontinue;
 
       do {
          gamecontinue = true;
             System.out.println("Welcome to Rock,Paper,Scissors.\nThe first one to get 5 points, WINS!\n"); 
             System.out.println("SCOREBOARD");
             System.out.println("Computer's Score: " + sys_score);
             System.out.println("User's Score: " + user_score);
             System.out.println("-".repeat(20)+"\n");
          if (sys_score < 5 && user_score < 5) {
             System.out.print("Enter your input: ");
             input = scan.nextLine();
             System.out.print("System input: ");
             sys_in = opt[rndm.nextInt(opt.length)];
             System.out.println(sys_in);
             System.out.println(evaluate.check(sys_in));
             Thread.sleep(2000);
             clrscr();
          } else if (sys_score == 5 || user_score == 5) {
             gamecontinue = false;
             clrscr();
             Winner.check_whoWins(sys_score, user_score);
             break;
          }
       } while (gamecontinue);
 
       scan.close();
 
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

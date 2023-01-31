package src_tictactoe;

public class gameMenu {
    static String comp_player = "";
    static String user_player = "";
    static int main_menu(int input_num){ 

         if (input_num == 1){
             user_player = "X";
             comp_player = "O";
         } else if (input_num == 2){
             user_player = "O";
             comp_player = "X";
         }
         return input_num;
    }
}

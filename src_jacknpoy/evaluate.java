package src_jacknpoy;

public class evaluate {
    static int comp_score,plyr_score;

    static String check(String result) {
         String user_input = mainfile.input;
         String com_in = mainfile.sys_in;
         if (user_input.equalsIgnoreCase("Rock") && com_in.equalsIgnoreCase(mainfile.opt[2])
                 || user_input.equalsIgnoreCase("Paper") && com_in.equalsIgnoreCase(mainfile.opt[0])
                 || user_input.equalsIgnoreCase("Scissor")
                 || user_input.equalsIgnoreCase("Scissors") && com_in.equalsIgnoreCase(mainfile.opt[1])) {
             result = "----You win!----";
             plyr_score = mainfile.user_score++;
           
         } else if (user_input.equalsIgnoreCase("Rock") && com_in.equalsIgnoreCase(mainfile.opt[1])
                 || user_input.equalsIgnoreCase("Paper") && com_in.equalsIgnoreCase(mainfile.opt[2])
                 || user_input.equalsIgnoreCase("Scissor")
                 || user_input.equalsIgnoreCase("Scissors") && com_in.equalsIgnoreCase(mainfile.opt[0])) {
             result = "-----You Loose ):----";
             comp_score = mainfile.sys_score++;
 
         } else {
             result = "----Draw!----";
         }
 
         return result;
 
     }
 
}

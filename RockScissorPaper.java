import java.util.Random;

import java.util.*;
/* Conditions of game
            computer-->
            Rock[0]   Scissor[1]    Paper[2]
user !
Rock[0]     draw         win       loose

Scissor[1]     loose        draw       win   

Paper[2]        win         loose      draw
*/

class RockScissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // Result matrix
        String result[][] = {
                { "Draw", "Win", "Loose" },
                { "Loose", "Draw", "Win" },
                { "Win", "Loose", "Draw" }
        };
        // Display Game
        System.out.println("\n\n------ Rock --- Scissor --- Paper ------\n");
        System.out.println("    0 = Rock   1 = Scissor   2 = Paper   \n");
        // user input 0 - 2
        System.out.print("Enter Your Choice : ");
        int user = sc.nextInt();
        // bot input using Random(0-2)
        int bot = rand.nextInt(3);
        if (user >= 0 && user <= 2) {
            
            System.out.println("\n" + result[user][bot]);
            System.out.println("\nBot Choice : " + bot);
        }else{
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}

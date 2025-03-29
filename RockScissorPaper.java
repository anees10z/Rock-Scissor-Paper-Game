import java.util.Random;

import java.util.*;
/* Conditions of game
            computer-->
            snake[0]   water[1]    gun[2]
user !
snake[0]     draw         win       loose

water[1]     loose        draw       win   

gun[2]        win         loose      draw
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
        System.out.println("\n\n------- Snake --- Water --- Gun -------\n");
        System.out.println("    0 = Snake   1 = Water   2 = Gun   \n");
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
import java.util.*;
public class StonePaperScissor {
    public static void main(String[] args) {
        String[] game = { "STONE", "PAPER", "SCISSOR" };
        System.out.println("\tSTONE PAPER SCISSORS GAME");
        int one = 1;
        while (one == 1) {
            Scanner in = new Scanner(System.in);
            Random random = new Random();
            System.out.print("YOUR CHOICE   : ");
            String ch = in.nextLine();
            System.out.println();
            int yes = 0;
            for (int i = 0; i < game.length; i++) {
                if (ch.toUpperCase().equals(game[i])) {
                    yes=1;
                    break;
                }
            }
            if (yes == 1) {
                int sch = random.nextInt(game.length);
                System.out.println("SYSTEM CHOICE : " + game[sch]);
                if (ch.toUpperCase().equals("STONE") && game[sch].equals("PAPER")) {
                    System.out.println("\t\"System WINS\"");
                } else if (ch.toUpperCase().equals("STONE") && game[sch].equals("SCISSOR")) {
                    System.out.println("\t\"YOU WIN\"");
                } else if (ch.toUpperCase().equals("SCISSOR") && game[sch].equals("STONE")) {
                    System.out.println("\t\"System WINS\"");
                } else if (ch.toUpperCase().equals("SCISSOR") && game[sch].equals("PAPER")) {
                    System.out.println("\t\"YOU WIN\"");
                } else if (ch.toUpperCase().equals("PAPER") && game[sch].equals("SCISSOR")) {
                    System.out.println("\t\"System WINS\"");
                } else if (ch.toUpperCase().equals("PAPER") && game[sch].equals("STONE")) {
                    System.out.println("\t\"YOU WIN\"");
                } else if (ch.toUpperCase().equals(game[sch])) {
                    System.out.println("\tDraw");
                }
            } else {
                System.out.println("\tInvalid input");
            }
            System.out.println();
            System.out.print("ARE YOU READY[press 1] (or) EXIT[press 2] : ");
            one = in.nextInt();
        }
    }
}

import java.util.*;
public class QuizzGame {
    public static void main(String[] args) {
        int ch, cnt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Select your Subject[press NO] : \n1.English\n2.Math\n3.Science");
        ch = in.nextInt();
        switch (ch) {
            case 1:
                String[] question1 = { "\nA.)How many alphabets are there in English? \n\n1.)22\n2.)24\n3.)26",
                        "\nB.)A for? \n\n1.)Apple\n2.)Banana\n3.)Carrot", "\nC.)D for? \n\n1.)Eagle\n2.)Dog\n3.)Fox",
                        "\nD.)G for? \n\n1.)Helen\n2.)Ila\n3.)George", "\nE.)M for? \n\n1.)Male\n2.)Female\n3.)None" };
                int[] answers1 = { 3, 1, 2, 3, 1 };
                System.out.println("         English Quizz\nInstructions:\n**select any one option[press NO]");
                try {
                    for (int i = 0; 1 < question1.length; i++) {
                        System.out.print(question1[i] + "\nans.)");
                        ch = in.nextInt();
                        if (ch == answers1[i]) {
                            cnt++;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("    YOUR SCORE : " + cnt);
                }break;
            case 2:
                String[] question2 = { "\nA.)Find the prime Number in the following? \n\n1.)7\n2.)18\n3.)26",
                        "\nB.)Odd one out? \n\n1.)8\n2.)14\n3.)3", "\nC.)2+7 \n\n1.)9\n2.)5\n3.)8",
                        "\nD.)7*7 \n\n1.)42\n2.)49\n3.)56", "\nE.)0%1 \n\n1.)1\n2.)0\n3.)None" };
                int[] answers2 = { 1, 3, 1, 2, 2 };
                System.out.println("         Math Quizz\nInstructions:\n**select any one option[press NO]");
                try {
                    for (int i = 0; 1 < question2.length; i++) {
                        System.out.print(question2[i] + "\nans.)");
                        ch = in.nextInt();
                        if (ch == answers2[i]) {
                            cnt++;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("    YOUR SCORE : " + cnt);
                }break;
            case 3:
                String[] question3 = { "\nA.)Odd one out ? \n\n1.)Sun\n2.)Star\n3.)Moon",
                        "\nB.)Ozone? \n\n1.)O3\n2.)O2\n3.)O", "\nC.)Berry family? \n\n1.)Carrot\n2.)Beetroot\n3.)Tomato",
                        "\nD.)Botony is a study of? \n\n1.)Animals\n2.)Plants\n3.)Reptiles", "\nE.)Which is carniorous? \n\n1.)Tiger\n2.)Goat\n3.)Dog" };
                int[] answers3 = { 3, 1, 3, 2, 1 };
                System.out.println("         Science Quizz\nInstructions:\n**select any one option[press NO]");
                try {
                    for (int i = 0; 1 < question3.length; i++) {
                        System.out.print(question3[i] + "\nans.)");
                        ch = in.nextInt();
                        if (ch == answers3[i]) {
                            cnt++;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("    YOUR SCORE : " + cnt);
                }
        }

    }
}
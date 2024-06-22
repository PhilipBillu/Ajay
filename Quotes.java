import java.util.*;

public class Quotes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] quotes = { "Nice", "Good", "Excellant", "Outstanding","thanks" };
        String[] repeat;
        Random random = new Random();
        int ch, length = quotes.length, k = 0;
        try {
            do {
                System.out.print("for QUOTE[press1] | Exit[press2] : ");
                ch = in.nextInt();
                if (ch == 1) {
                    System.out.println();
                    int one = random.nextInt(length);
                    if (~length < 0) {
                        System.out.println(quotes[one]);
                    }
                    for (int i = one; i < length - 1; i++) {
                        quotes[i] = quotes[i + 1];
                    }
                    k++;
                    length--;
                }
            } while (ch == 1);
        } catch (Exception e) {
            System.out.println("----finish------");
        }
    }
}

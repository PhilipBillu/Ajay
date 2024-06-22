import java.util.Arrays;

public class LastElement {
    public static void main(String[] args) {
        String[] quotes = new String[] { "All the best", "Good luck", "Thank You", "Excellant", "Outstanding",
                "You are very lucky",
                "Say thanks to God" };
        int element = quotes.length - 1;
        String[] newarray = new String[quotes.length - 1];
        int index = 0;
        for (int i = 0; i < newarray.length; i++) {
            newarray[index] = quotes[index];
            index++;
        }
        System.out.println("original Arrays=" + Arrays.toString(quotes));
        System.out.println("News Array=" + Arrays.toString(newarray));

    }
}

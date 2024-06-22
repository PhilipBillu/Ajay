import java.util.HashSet;
import java.util.Random;

public class uniqueRandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hashset = new HashSet<>();
        while (hashset.size() < 1) {
            int rand=random.nextInt(7);
            hashset.add(rand);
        }
        for(int randomNumbers:hashset){
            System.out.println(randomNumbers);
        }
    }
}

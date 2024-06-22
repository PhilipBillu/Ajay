import java.util.*;
public class randomStringGenerator {
    public static void main(String[] args) {
        String[] game={"STONE","PAPER","SCISSOR"};
        StringBuilder strBuild =new StringBuilder();//random string builder
        Random random=new Random();//create object for random string
        int sch=random.nextInt(game.length);
        System.out.println(game[sch]);
    }    
}

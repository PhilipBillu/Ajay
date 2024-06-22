import java.util.*;
public class ConditionChecking {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter age : ");
        int age=in.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}

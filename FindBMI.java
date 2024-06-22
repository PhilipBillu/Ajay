import java.util.*;
public class FindBMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Weight : ");
        int weight=in.nextInt();
        System.out.print("Enter your Height : ");
        float height=in.nextFloat();
        float BMI=weight/height;
        System.out.println("BMI[Body Mass Index] : "+BMI);
    }
}

import java.util.*;
public class examScore{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int math=in.nextInt();
        int science=in.nextInt();
        int social=in.nextInt();
        int avgMark=(math+science+social)/3;
        System.out.println("Average score: "+avgMark);
        if(avgMark>=90){
            System.out.println("Classification: Excellent");
        }else if(avgMark>=80 && avgMark<=90){
            System.out.println("Classification: Good");
        }
        else if(avgMark>=60 && avgMark<=80){
            System.out.println("Classification: Pass");
        }
        else{
            System.out.println("Classification: Fail");
        }
    }
}
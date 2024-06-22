import java.util.*;
public class LengthOfWordLine {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Text : ");
        String text=in.nextLine();
        System.out.println();
        int cnt=0,acnt=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                cnt=cnt+1;
            }
            else if(text.charAt(i)=='.'){
                acnt=acnt+1;
            }
        }
        System.out.println("No of Words : "+(cnt+1)+"\nNo of Characters : "+text.length()+"\nNo of Lines : "+(acnt+1));
    }
}


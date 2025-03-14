package t2week2;
import java.util.Scanner;
public class last {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "cheesepizza";

        System.out.print("Enter a word: ");
        word=input.next();

        System.out.println("Last letter of "+word+" is "+word.charAt(word.length()-1));

        input.close();
    }
}

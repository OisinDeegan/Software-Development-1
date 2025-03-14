package t2week7;
import java.util.Scanner;
public class guess1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 69;
        int y =0 ;
        do {
            System.out.print("Enter your guess:");
            x=input.nextInt();
            y++;
        } while (x!=69);
        System.out.println("Congratulation! It took you "+y+" attempts to guess the number!");
        input.close();
    }
}

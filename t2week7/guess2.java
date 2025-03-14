package t2week7;
import java.util.Scanner;

public class guess2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 69;
        int y =0 ;
        double z = 69;
        String banana = "y";
        do {
            System.out.print("Enter your guess:");
            x=input.nextInt();
            y++;
        } while (x!=z);
        System.out.println("Congratulation! It took you "+y+" attempts to guess the number!");
        System.out.print("Do you want to play again? (y/n): ");
            banana=input.next();
        do {
            
            if (banana.equalsIgnoreCase("y")) {
                z=(Math.floor(Math.random()*100+1));
                x = 69;
                y =0 ;
                do {
                    System.out.print("Enter your guess:");
                    x=input.nextInt();
                    y++;
                } while (x!=z);
                System.out.println("Congratulation! It took you "+y+" attempts to guess the number!");
                System.out.print("Do you want to play again? (y/n): ");
                banana=input.next();
            }else {
                System.out.println("Program terminated.\n\n\n\n\n\n\n\nBut I'll be back.");
            }
        } while (banana.equalsIgnoreCase("y"));
        System.out.println("Program terminated.\n\n\n\n\n\n\n\nBut I'll be back.");
        input.close();
    }
}

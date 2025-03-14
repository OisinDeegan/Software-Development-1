package assessment4;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        /*Setting up variables */
        Scanner input = new Scanner(System.in);
        int x=1;
        /*made y -1 so that everything can be contained within the while loop and if the user enters no positives, 0 is displayed */
        int y=-1;
        
        while (x>0) {
            y++;
            System.out.print("Enter a positive number (Enter value less than 1 to stop): ");
            x=input.nextInt();
        }
        System.out.println("You entered "+y+" positive numbers.");
        input.close();
    }
}

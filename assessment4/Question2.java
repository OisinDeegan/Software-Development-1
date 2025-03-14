package assessment4;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        /*Setting up variables */
        Scanner input = new Scanner(System.in);
        String thingies =". Question 2";
        int x=0;

        /*Check to make sure an int is entered*/
        
        System.out.print("Enter a number: ");
        if (input.hasNextInt()) {
            x=input.nextInt();
            /*loop that prints */
            if (x>=3) {
                for (int y=1;y<=6;y++) {
                    System.out.println(y+thingies);
                }
                }else{
                for (int y=1;y<=12;y++) {
                    System.out.println(y+thingies);
                    }
                }
            }else{
            System.out.println("Please enter an integer.");
        }
        input.close();
    }
}

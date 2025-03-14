package assessment4;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        /*Setting up variables */
        Scanner input = new Scanner(System.in);
        String thingies ="";

        /*Receiving and storing the text the user wants repeated */
        System.out.print("Enter some text to be repeated: ");
        thingies=input.nextLine();

        /*The loop used for printing */
        for (int x=1; x<=12;x++) {
            System.out.println(x+". "+thingies);
        }

        /*closing the input to get rid of the "problem" gitpod found*/
        input.close();
    }
}

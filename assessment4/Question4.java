package assessment4;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        /*Setting up variables */
        Scanner input = new Scanner(System.in);
        String thingies ="";
        int x =0;
        /*Receiving and storing the text the user inputs */
        System.out.print("Enter some text: ");
        thingies=input.nextLine();

        /*done this way so that no matter the length of the inputted text, the code will run it all. 
        also, x=0 and x<length instead of x=1 x<=length as I normally do because charAt starts at 0*/
        while (x<thingies.length()) {
            System.out.println(thingies.charAt(x));
            x++;
        }
        input.close();
    }
}

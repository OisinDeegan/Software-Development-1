package t2week6;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        String check = "y";

        do {
            System.out.print("Enter a number: ");
            x=input.nextInt();
            if (x%2==0) {
                System.out.println(x+" is even");
            } else {
                System.out.println(x+" is odd"); 
            }
            System.out.print("Run code again? (y/n): ");
            check=input.next();
        } while (check.equalsIgnoreCase("y"));
        input.close();
    }
}

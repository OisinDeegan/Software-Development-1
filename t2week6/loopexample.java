package t2week6;
import java.util.Scanner;
public class loopexample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        do {
            System.out.print("Enter any other value than 0 to exit loop: ");
            x=input.nextInt();
        } while (x==0);

        input.close();
    }
}

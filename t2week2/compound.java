package t2week2;
import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        number +=2;
        System.out.println("Number updated to: "+number);

        number-=5;
        System.out.println("Number updated to: "+number);

        input.close();
    }
}

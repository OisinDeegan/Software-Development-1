package t2week2;
import java.util.Scanner;

public class fullname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = "amogus";
        String last= "amogus";

        System.out.print("Enter your first name: ");
        first=input.next();
        System.out.print("Enter your second name: ");
        last=input.next();

        System.out.println(first.concat(last));

        input.close();
    }
}

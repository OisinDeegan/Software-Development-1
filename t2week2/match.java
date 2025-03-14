package t2week2;
import java.util.Scanner;
public class match {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x, y="sussy";

        System.out.print("Enter anything: ");
        x=input.next();
        System.out.print("Enter another anything: ");
        y=input.next();

        if (x.equals(y)) {
            System.out.println("Both things entered are the same.");
        } else {
            System.out.println("Both things are not the same.");
        }
        input.close();
    }
}

package t2week2;
import java.util.Scanner;

public class increment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter a number: ");
        x= input.nextInt();

        System.out.println("Number before post increment: "+x);
        System.out.println("Post increment number: "+(x++));
        System.out.println("Number after post increment: "+x);
        System.out.println();
        x--;
        System.out.println("Number before pre increment: "+x);
        System.out.println("Pre increment number: "+(++x));
        System.out.println("Number after pre increment: "+x);

        input.close();
    }
}

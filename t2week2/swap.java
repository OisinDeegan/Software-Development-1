package t2week2;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b = "banana";

        System.out.print("Enter first string: ");
        a = input.next();
        System.out.print("Enter second string: ");
        b = input.next();

        a = a.concat(b);
        b = a.substring(0, a.length()-b.length());
        a = a.substring((b.length()));
        System.out.println(a+" "+b);
        
        input.close();
    }
}

package t2week7;
import java.util.Scanner;
public class sumagain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 1;
        
        while (z==1) {
            System.out.print("Enter first number: ");
            x=input.nextInt();
            System.out.print("Enter second number: ");
            y=input.nextInt();
            System.out.println(x+" + "+y+" = "+(x+y));
            System.out.print("Continue? (1 for yes, anything else no): ");
            z=input.nextInt();
        }
        System.out.println("Program exterminated.");
        input.close();
    }
}
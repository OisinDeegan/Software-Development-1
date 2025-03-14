package t2week6;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z = 0;

        System.out.print("Please enter a number: ");
        x=input.nextInt();

        while (x>0) {
            y = (x%10);
            z += Math.pow(y, y);
            System.out.println(y+" ^ "+y+" = "+Math.pow(y, y));
            x /=10;
        }
        System.out.println("Sum of digits raised to themselves:"+z);

        input.close();
    }
}

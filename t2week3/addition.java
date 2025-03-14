package t2week3;
import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int y = 0;

        while (x<=5) {
            System.out.print("Enter number "+x+": ");
            y +=input.nextInt();
            x++;
        }
        System.out.println("Sum of all numbers entered: "+y);
        input.close();
    }
}

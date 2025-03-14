package t2week3;
import java.util.Scanner;
public class fourthloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int y = 0;

        System.out.print("Wanna loop (1 for yes, 0 for no): ");
        y=input.nextInt();

        if (y==1) {
            while (x<=5) {
              System.out.println("Loop "+x);
              x++;  
            }
        }
        input.close();
    }
}

package t2week7;
import java.util.Scanner;
public class starsquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;

        System.out.print("Enter what you want the size of the square to be: ");
        x=input.nextInt();

        for (int rows = 1; rows <=x; rows++) {
            System.out.println();
            for (int columns = 1; columns <=x; columns++) {
                System.out.print("* ");
            }
            
        }
        System.out.println();
        input.close();
    }
}

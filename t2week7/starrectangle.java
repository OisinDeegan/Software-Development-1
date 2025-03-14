package t2week7;
import java.util.Scanner;
public class starrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int y = 1;

        System.out.print("Enter what you want the amount of rows of the square to be: ");
        x=input.nextInt();
        System.out.print("Enter what you want the amount of columns of the square to be: ");
        y=input.nextInt();

        for (int rows = 1; rows <=x; rows++) {
            System.out.println();
            for (int columns = 1; columns <=y; columns++) {
                System.out.print("* ");
            }
            
        }
        System.out.println();
        input.close();
    }
}

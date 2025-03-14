package t2week3;
import java.util.Scanner;
public class thirdloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y=0;
        int x=1;

        System.out.print("Enter number of loops: ");
        y=input.nextInt();

        while (x<=y) {
            System.out.println("Loop "+x+".");
            x++;
        }
        input.close();
    }
}

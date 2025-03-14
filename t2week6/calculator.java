package t2week6;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 69420;
        int total = 0;

        while (x != -1) {
            System.out.print("Enter number (-1 to quit): ");
            x=input.nextInt();
            if (x!=-1) {
                total+=x;
            }
        }
        System.out.println("Total: "+total);
        input.close();
    }
}

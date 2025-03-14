package t2week2;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        boolean isEven=true;

        System.out.print("Enter a number: ");
        x=input.nextInt();

        isEven=(x%2 ==0);

        if (isEven) {
            System.out.println(x+" is even");
        } else {
            System.out.println(x+" is odd");
        }

        input.close();
    }
}

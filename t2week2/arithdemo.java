package t2week2;
import java.util.Scanner;

public class arithdemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter a  number: ");
        x=input.nextInt();

        System.out.println(x);
        x-=1;
        System.out.println(x);
        x*=2;
        System.out.println(x);
        x/=2;
        System.out.println(x);
        x+=8;
        System.out.println(x);
        x%=7;
        System.out.println(x);

        input.close();
    }
}

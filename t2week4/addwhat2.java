package t2week4;
import java.util.Scanner;
public class addwhat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        
        System.out.print("Enter a number: ");
        x = input.nextInt();

        System.out.println();
        System.out.println("Number entered was: "+x);
        System.out.print("Number updated to: ");

        if (x>100) {
            x*=10;
        } else if (x>75 && x<=100) {
            x*=8;
        }else if (x>50&&x<=75) {
            x*=6;
        }else if (x>25&&x<=50) {
            x*=4;
        }else if (x<=25) {
            x/=2;
        }
        System.out.println(x);

        input.close();
    }
}

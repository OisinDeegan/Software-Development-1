package t2week7;
import java.util.Scanner;
public class size {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter size: ");
        x=input.nextInt();

        if (x>70 && x<=100) {
            System.out.println("Go for a large size");
        } else if (x>35 && x<=70) {
            System.out.println("Go for medium size");
        }else if(x> 10 && x <= 35) {
            System.out.println("Go for small size");
        }else {
            System.out.println("Size not available");
        }
        input.close();
    }
}

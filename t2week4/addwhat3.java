package t2week4;
import java.util.Scanner;
public class addwhat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        
        System.out.print("Enter a number: ");
        x = input.nextInt();

        System.out.println();
        System.out.println("Number entered was: "+x);
        System.out.print("Number updated to: ");

        if (x>100) {
            x+=10;
        } else if (x>50 && x<=100) {
            x+=5;
        }else if (x>20&&x<=50) {
            x+=2;
        }else if (x<=20) {
            x+=1;
        }
        System.out.println(x);

        input.close();        
    }
}

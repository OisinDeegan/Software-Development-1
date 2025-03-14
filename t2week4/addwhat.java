package t2week4;
import java.util.Scanner;

public class addwhat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter a number: ");
        x = input.nextInt();

        System.out.println();
        System.out.println("Number entered was: "+x);
        System.out.print("Number updated to: ");

        if (x>20) {
            x+=2;
        } else if (x>10 && x<=20) {
            x+=3;    
        }else if (x<=10) {
            x+=1;
        }
        System.out.println(x);

        input.close();
    }
}
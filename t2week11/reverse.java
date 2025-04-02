package t2week11;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to be reversed (-1 to exit): ");
        int x;
        x=input.nextInt();
        while (x!=-1) {
            System.out.println(reverseNum(x));
            System.out.print("Enter a number to be reversed (-1 to exit): ");
            x=input.nextInt();
        }
        System.out.println("PROGRAME TERMINATED");
        input.close();
    }
    static int reverseNum(int number){
        int reverseDig = 0;
        int placeVale = 0;

        while (number>0) {
            placeVale=number%10;
            number=number/10;
            reverseDig=reverseDig*10+placeVale;
        }
        return reverseDig;
    }
}

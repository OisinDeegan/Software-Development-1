package t2week11;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y = 0;
        System.out.print("Enter number to be raised: ");
        x=input.nextInt();
        System.out.print("Enter number to be the power: ");
        y=input.nextInt();
        System.out.println(x+" raised by "+y+" = "+powerof(x, y));
        input.close();
    }

    static int powerof(int value, int raise){
        int result=1;
        for (int i=0;i<raise;i++ ) {
            result*=value;
        };
        return result;
    }
}

package t2week2;
import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d =0;
        double result = 0;
        
        System.out.print("Enter the number of 50 cent coins: ");
        a = input.nextInt();
        System.out.print("Enter the number of 20 cent coins: ");
        b = input.nextInt();
        System.out.print("Enter the number of 10 cent coins: ");
        c = input.nextInt();
        System.out.print("Enter the number of 5 cent coins: ");
        d = input.nextInt();

        result=(((a*10)*.5)+((b*10)*.2)+((c*10)*.1)+((d*10)*.05))*.1;
       
        
        System.out.println(result);

        input.close();
    }
}

package t2week7;
import java.util.Scanner;

public class readset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x =0, y=0, z=0, a=0;
        String check = "y";

        System.out.print("Do you want to enter integers? (1 for yes, 2 for no): ");
        x = input.nextInt();
        if (x==1) {
            while (check.equalsIgnoreCase("y")) {
                System.out.print("\nEnter the number: ");
                y=input.nextInt();
                if (y%2==0) {
                    z+=y;
                } else {
                    a+=y;
                }
                System.out.print("Do you want to continue? (y/n): ");
                check=input.next();
            }
            System.out.println("\nSum of even numbers is: "+z);
            System.out.println("Sum of odd numbers is: "+a);
        }
            
        System.out.println("Program executed.");
        input.close();
    }    
}

package t2week7;
import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x =0, y=0, z=0, a=0, b=0;
        String check = "y";

        System.out.print("Do you want to enter integers? (1 for yes, 2 for no): ");
        x = input.nextInt();
        if (x==1) {
            while (check.equalsIgnoreCase("y")) {
                System.out.print("\nEnter the number: ");
                y=input.nextInt();
                if (y>0) {
                    z++;
                } else if (y<0) {
                    a++;
                }else{
                    b++;
                }
                System.out.print("Do you want to continue? (y/n): ");
                check=input.next();
            }
            System.out.println("\nAmount of positive numbers: "+z);
            System.out.println("Amount of negative numbers: "+a);
            System.out.println("Amount of zeros entered: "+b);
        }
            
        System.out.println("\nProgram executed.");
        input.close();
    }
}

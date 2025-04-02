package t2week11;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, z;
        System.out.print("Enter first number: ");
        x=input.nextDouble();
        System.out.print("Enter second number: ");
        y=input.nextDouble();
        System.out.print("Enter third number: ");
        z=input.nextDouble();
        double result = avg(x, y, z);
        System.out.println("Average is: "+result);
        input.close();
    }

    static double avg(double x, double y, double z){
        return ((x+y+z)/3);
    }
}

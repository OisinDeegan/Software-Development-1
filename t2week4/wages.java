package t2week4;
import java.util.Scanner;
public class wages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x =1;
        int y =3;
        int z=0;
        int a =0;
        int overtime = 0;
        double result=0;

        while (x<=y) {
            System.out.print("Enter hours worked: ");
            z=input.nextInt();
            System.out.print("Enter hourly rate: ");
            a=input.nextInt();
            if (z>40) {
                overtime=z-40;
                z=40;
            }
            result=(a*z)+((a*overtime)*1.5);
            System.out.println("Pay for Employee "+x+" is: "+result+"\n");
            x++;
            overtime=0;
        }
        input.close();
    }
}

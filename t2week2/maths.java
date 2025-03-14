package t2week2;
import java.util.Scanner;
public class maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d=0;

        System.out.print("Enter the first number: ");
        a=input.nextInt();
        System.out.print("Enter the second number: ");
        b=input.nextInt();
        System.out.print("What arithmetic do you want to perform on these numbers?\n1. Addition\n2. Subtractiom\n3. Multiplication\n4. Division\nEnter choice (1-4): ");
        c=input.nextInt();

        switch (c) {
            case 1:
                d=a+b;
                System.out.println("Result of "+a+" + "+b+" = "+d );
                break;
            case 2:
            d=a-b;
            System.out.println("Result of "+a+" - "+b+" = "+d );
                break;
                case 3:
                d=a*b;
                System.out.println("Result of "+a+" * "+b+" = "+d );
                break;
                case 4:
                d=a/b;
                System.out.println("Result of "+a+" / "+b+" = "+d );
                break;
            default:
                break;
        }
        input.close();
    }
}

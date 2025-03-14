package t2week2;
import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c, d, e = 0;
    
    System.out.print("Enter a number for a: ");
    a = input.nextInt();
    System.out.print("Enter a number for b: ");
    b = input.nextInt();
    System.out.print("Enter a number for c: ");
    c = input.nextInt();
    System.out.print("Enter a number for d: ");
    d = input.nextInt();
    System.out.print("Enter a number for e: ");
    e = input.nextInt();

    System.out.print("Value of a, "+a+", after adding 9 is: ");
    a +=9;
    System.out.println(a);
    System.out.print("Value of b, "+b+", after subtracting 4 is: ");
    b-=4;
    System.out.println(b);
    System.out.print("Value of c, "+c+", after multiplying by 3 is: ");
    c*=3;
    System.out.println(c);
    System.out.print("Value of d, "+d+", after divinding by 2 is: ");
    d/=2;
    System.out.println(d);
    System.out.print("Remainder of e, "+e+", after divinding by 5 is: ");
    e%=5;
    System.out.println(e);

    input.close();
    }
}

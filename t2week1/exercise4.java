import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y=0;

        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {
            x = input.nextInt();

            if (x>=1 && x<=5) {
                y=x+1;
                System.out.println(x+" is updated to "+y);
            } else if (x>=21 && x<=25) {
                y=x+2;
                System.err.println(x+" is updated to "+y);
            } else if (x>=41 && x<=45) {
                y=x+3;
                System.out.println(x+" is updated to "+y);
            } else {
                y=x*2;
                System.out.println(x+" is updated to "+y);
            }
        } else {
            System.out.println("Invalid number entered");
        }
        input.close();

    }
}

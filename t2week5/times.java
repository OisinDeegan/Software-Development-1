import java.util.Scanner;

public class times {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y = 0;
        int counter = 1;

        System.out.print("Enter a number: ");
        x=input.nextInt();
        System.out.print("Select option 1 or 2\n\n1. Output addition table (1 to 12) for number entered.\n2. Output multiplication table (1 to 12) for number entered.\n\nEnter choice: ");
        y=input.nextInt();

        if (y==1) {
            while (counter<=12) {
                
                System.out.println(x+" + "+counter+" = "+(x+counter));
                counter++;
            }
        } else if (y==2) {
            while (counter<=12) {
                
                System.out.println(x+" * "+counter+" = "+(x*counter));
                counter++;
            }
        } else {
            System.out.println("Invalid choice entered. Please enter 1 or 2.");
        }
        input.close();
    }
}

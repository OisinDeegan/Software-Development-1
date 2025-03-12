import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {
            number = input.nextInt();

        if (number>10) {
            System.out.println(number +" is greater than 10");
        }else{
            System.out.println(number +" is lesser than 10");
        }
        } else {
            System.out.println("You need to enter an integer");
        }

        
        
        input.close();
    }
}

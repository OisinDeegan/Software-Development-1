package t2week6;
import java.util.Scanner;

public class cubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x =0;
        int z =1;
        int count = 2;

        System.out.print("Enter a number: ");
        x=input.nextInt();
        input.close();
        System.out.print("Sum of cubes: 1^3 + ");
        for( ; count <x;count++){
            System.out.print(count+"^3 + ");
            z += (count*count*count);
        }
        z+=(count*count*count);
        System.out.println(count+ "^3 = "+z);
    }
}

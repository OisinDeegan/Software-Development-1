package t2week6;

import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, digit, total =0;
        String output = "";

        System.out.print("Please enter a number: ");
        number=input.nextInt();

        while (number>0) {
            digit = number % 10;
            total += digit;
            number /=10;
            output += digit +" + ";
        }
        output=output.substring(0, output.length()-3);
        String reverse = "";
        for(int x=output.length()-1;x>=0;x--){
            reverse+= output.charAt(x);
        }
        System.out.println("Sum of digits inputed is: "+total);
        System.out.println("Output: "+output);
        System.out.println("Reverse: "+reverse);
        System.out.println("\n"+reverse+" = "+total);
        input.close();
    }
}
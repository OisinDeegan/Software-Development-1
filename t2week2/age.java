package t2week2;
import java.util.Scanner;

public class age{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        String name = "banana";

        System.out.print("Enter your name: ");
        name=input.next();
        System.out.print("Enter your age: ");
        x=input.nextInt();

        if (x<4) {
            System.out.println(name+" you are a toddler.");
        } else if (x>=4 && x<13) {
            System.out.println(name+" you are a child.");
        } else if (x>=13 && x<20) {
            System.out.println(name+" you are a teenager.");
        }else if (x>=20 && x<66) {
            System.out.println(name+" you are an adult.");
        }else {
            System.out.println(name+ "you are a senior citizen.");
        }

        input.close();
    }

}
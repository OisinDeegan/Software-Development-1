package t2week10;
import java.util.Scanner;
public class instancemethods2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(method1());
        System.out.println(method2());
        System.out.print("Enter an int: ");
        System.out.println(method3(input.nextInt()));
        System.out.print("Enter 2 ints: ");
        System.out.println(method4(input.nextInt(), input.nextInt()));
        System.out.print("Enter 3 ints: ");
        System.out.println(method5(input.nextInt(), input.nextInt(), input.nextInt()));
        System.out.print("Enter a first name and last name: ");
        System.out.println(method6(input.next(), input.next()));
        System.out.print("Enter a first name and your age: ");
        System.out.println(method7(input.next(), input.nextInt()));
        System.out.println("Method 8 has returned a value of: "+method8());
        System.out.print("Enter first name and last name: ");
        System.out.println(method9(input.next(), input.next()));
        System.out.print("Enter 3 ints to be added together: ");
        System.out.println(method10(input.nextInt(), input.nextInt(), input.nextInt()));

        input.close();
    }

    static String method1(){
        return "Hello from method1";
    }
    static String method2(){
        return "Howdy from method2";
    }
    static String method3(int first){
        return "You passed me, method3, an int value of: "+first;
    }
    static String method4(int first, int second){
        return "You passed me, method4, an int value of: "+first+" and "+second;
    }
    static String method5(int first, int second, int third){
        return "You passed me, method5, an int value of: "+first+" and "+second+" and "+third;
    }
    static String method6(String fname, String lname){
        return "You passed me, method6, a name of: "+fname+" "+lname;
    }
    static String method7(String fname, int first){
        return "You passed me, method6, a name of: "+fname+" and an int of: "+first;
    }
    static int method8(){
        return 1000;
    }
    static String method9(String fname, String lname){
        return fname+" "+lname;
    }
    static int method10(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

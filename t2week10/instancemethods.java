package t2week10;
import java.util.Scanner;
public class instancemethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        instancemethods im = new instancemethods();
        im.method1();
        im.method2();
        im.method1();
        System.out.print("Enter an int: ");
        im.method3(input.nextInt());
        System.out.print("Enter 2 ints: ");
        im.method4(input.nextInt(), input.nextInt());
        System.out.print("Enter 3 ints: ");
        im.method5(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.print("Enter a first name and last name: ");
        im.method6(input.next(), input.next());
        System.out.print("Enter a first name and your age: ");
        im.method7(input.next(), input.nextInt());
        System.out.println("Method 8 has returned a value of: "+im.method8());
        System.out.print("Enter first name and last name: ");
        System.out.println(im.method9(input.next(), input.next()));
        System.out.print("Enter 3 ints to be added together: ");
        System.out.println(im.method10(input.nextInt(), input.nextInt(), input.nextInt()));

        input.close();
    }

    void method1(){
        System.out.println("Hello from method1");
    }
    void method2(){
        System.out.println("Howdy from method2");
    }

    void method3(int first){
        System.out.println("You passed me, method3, an int value of: "+first);
    }
    void method4(int first, int second){
        System.out.println("You passed me, method4, an int value of: "+first+" and "+second);
    }
    void method5(int first, int second, int third){
        System.out.println("You passed me, method5, an int value of: "+first+" and "+second+" and "+third);
    }
    void method6(String fname, String lname){
        System.out.println("You passed me, method6, a name of: "+fname+" "+lname);
    }
    void method7(String fname, int first){
        System.out.println("You passed me, method6, a name of: "+fname+" and an int of: "+first);
    }
    int method8(){
        return 1000;
    }
    String method9(String fname, String lname){
        return fname+" "+lname;
    }
    int method10(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

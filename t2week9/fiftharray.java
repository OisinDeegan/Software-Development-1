package t2week9;
import java.util.Scanner;
public class fiftharray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]x=new int[8];
        double y=0;

        for (int i=0;i<x.length;i++) {
            System.out.print("Enter value for element "+(i+1)+": ");
            x[i]=input.nextInt();
        }
        System.out.println("\nIndex\tValue");
        System.out.println("-----\t-----");
        for (int i =0; i<x.length;i++) {
            System.out.println(i+"\t"+x[i]);
            y+=x[i];
        }
        y/=x.length;
        System.out.println("Average of all numbers entered is: "+y);
        input.close();
    }
}

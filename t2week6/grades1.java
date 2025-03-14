package t2week6;
import java.util.Scanner;
public class grades1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0;
        int total=0;

        for (int i=1;i<=10;i++) {
            System.out.print("Enter grade "+i+": ");
            x=input.nextInt();
            total+=x;
        }
        System.out.println("Avergae: "+(total/10.0));
        input.close();
    }
}

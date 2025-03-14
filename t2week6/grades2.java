package t2week6;
import java.util.Scanner;
public class grades2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0;
        int total=0;
        int counter=0;

        while (x!=-1) {
            System.out.print("Enter grade (-1 to quit): ");
            x=input.nextInt();
            total+=x;
            if (x!=-1) {
                total+=x;
                counter++;
            }
        }
        if (counter!=0) {
            System.out.println("Average: "+(total/(counter*1.0)));
        } else {
            System.out.println("No grades entered");
        }
        
        input.close();
    }
}

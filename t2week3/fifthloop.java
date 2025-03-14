package t2week3;
import java.util.Scanner;

public class fifthloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=1;
        int y=11;
        while (x<=y) {
            System.out.println("Number "+x);
            x++;
        }
        x=1;
        while (x<=y) {
            if (x%2==0) {
                System.out.println("Number "+x);
                x++; 
            }
            
        }
        x=2;
        while (x<=y) {
            System.out.println("Number "+x);      
            x+=2;      
        }
        input.close();
    }
}

package t2week6;
import java.util.Scanner;
public class sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y= 0;

        for (int i=1; i<=4 ; i++) {
            System.out.print("Enter number sold of product item "+i+": ");
            x=input.nextInt();
            switch (i) {
                case 1:
                    y+=(x*(239.99));
                    break;
                case 2:
                    y+=(x*(129.75));
                    break;
                case 3:
                    y+=(x*(99.96));
                    break;
                case 4:
                    y+=(x*(350.89));
                    break;
            }
        }
        
        System.out.println("Earnings this week: "+Math.round(y*0.09+200));

        input.close();
    }
}

package t2week6;
import java.util.Scanner;
public class salesreport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y= 0;
        String div = "------------------------------\n";
        String output = div;
        output += "Item\t\tSold\tTotal\n";
        output += div;
       
        for (int i=1; i<=4 ; i++) {
            System.out.print("Enter number sold of product item "+i+": ");
            x=input.nextInt();
            output += "Product " + i+"\t"+x+"\t";
            switch (i) {
                case 1:
                    y+=(x*(239.99));
                    output += (x*(239.99))+"\n";
                    break;
                case 2:
                    y+=(x*(129.75));
                    output += (x*(129.75))+"\n";
                    break;
                case 3:
                    y+=(x*(99.96));
                    output += (x*(99.96))+"\n";
                    break;
                case 4:
                    y+=(x*(350.89));
                    output += (x*(350.89))+"\n";
                    break;
            }
        }
        output+= "\n"+div;
        output+= "Total:\t\t\t"+Math.round(y);
        output+= "\n"+div;
        output+= "Comission:\t\t"+Math.round(y*0.09)+"\n"+div;
        System.out.println(output);
        System.out.println("Earnings this week: "+Math.round(y*0.09+200));

        input.close();
    }
}

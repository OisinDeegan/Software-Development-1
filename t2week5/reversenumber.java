import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String x, y ="";
        int counter=1;

        System.out.print("Enter a number to be reversed: ");
        x=input.next();
        
        /*try to do loop thingy so that each number get's concated 
        while (counter<=x.length()) {
            y+=(x.substring(x.length()-counter));
            counter++;
        }

        System.out.println(y); */
        int number = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();
        System.out.println(number+" reversed is:");
        while (number>0) {
            System.out.print(number%10);
            number/=10;
        }
        System.out.println();

        String x ="";
        

        System.out.print("Enter a number to be reversed: ");
        x=input.next();
        
        int index=x.length()-1;

        /*try to do loop thingy so that each number get's concated   y+=(x.substring(x.length()-counter)); failed code put here for knowledge*/
        while (index>=0) {
            System.out.print(x.charAt(index));
          
            index--;
        }
        System.out.println();
        
        input.close();
    }
}

package t2week7;
import java.util.Scanner;

public class nestedloop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Basic counter controlled loop");
        for (int i = 1;  i <=5 ; i++) {
            System.out.println("Iteration "+i);
        }
        System.out.println();

        System.out.println("Counter loop with nested logic - example 1");
        for (int i = 1;  i <=5 ; i++) {
            if (i == 1 || i == 3 || i == 5) {
                System.out.println("Iteration "+i);
            }
        }
        System.out.println();

        System.out.println("Sentinal Loop");
        int count = 0;
        while(count == 0){
            System.out.print("Enter 0 to continue: ");
            count=input.nextInt();
        }
        System.out.println();

        System.out.println("Counter loop with nested logic - example 2");
         /* a table with 2 rows and 3 colimns:
          * 123
          * 123
          * loop twice for rows, loop 3 times for columns
          */
          for(int rows = 1; rows <=2; rows++){
            System.out.print("Row "+rows+": ");
            for(int cols = 1; cols <=3; cols++){
                System.out.print(cols+" ");
            }
            System.out.println();
          }
          System.out.println();
          System.out.println("Counter loop with nested logic - example 3");
          for (int runs = 1; runs <=2; runs++) {
            System.out.println("Run "+runs);
            for(int rows = 1; rows <=2; rows++){
                System.out.print("Row "+rows+": ");
                for(int cols = 1; cols <=3; cols++){
                    System.out.print(cols+" ");
                }
                System.out.println();
              }
          }
          
        input.close();
    }
}
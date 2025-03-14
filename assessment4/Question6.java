package assessment4;

public class Question6 {
    public static void main(String[] args) {
        /*no user inputs required for this question */
        System.out.println("Part A:\n-------\n");

        /*Moved the row part outside of the inner loop, which now only has to deal with columns. Otherwise the same as question 5*/
        
        /*Rows */
        for (int x=1;x<=2;x++) {
            System.out.print("Line "+x+":");

            /*Columns */
            for (int y=1;y<=2;y++) {
                System.err.print(" "+y);
            }
            System.out.println();
        }

        System.out.println("\nPart B:\n-------\n");


        /*Swapped the space and * loop conditions around from question 5 */
        /*the amount of rows */
        for (int x=1;x<=4;x++){

            /*the amount of spaces */
            for (int y=4;y>x;y--) {
                System.out.print(" ");
            }
            /*the amount of "*" , uses a decremental to show that I know how to use it*/
         for (int z=0;z<=(x-1);z++) {

            System.out.print("*");
            }
            System.out.println();
        }
    }
}

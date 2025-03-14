package assessment4;

public class Question5 {
    public static void main(String[] args) {
        /*no user inputs required for this question */
        System.out.println("Part A:\n-------\n");

        /*nested loops where the 2 loops don't influence each like with a triangle */

        /*Rows */
        for (int x=1;x<=2;x++) {

            /*Columns */
            for (int y=1;y<=2;y++) {
                System.out.print("Row"+x+"Column"+y+" ");
            }
            System.out.println();
        }

        System.out.println("Part B:\n-------\n");

        /*the amount of rows */
        for (int x=1;x<=4;x++){

            /*the amount of spaces */
            for (int z=0;z<(x-1);z++) {
                System.out.print(" ");
            }
            /*the amount of "*" , uses a decremental to show that I know how to use it*/
         for (int y=4;y>=x;y--) {

            System.out.print("*");
            }
            System.out.println();
        }
    }
}

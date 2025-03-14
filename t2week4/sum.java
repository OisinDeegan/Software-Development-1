package t2week4;

public class sum {
    public static void main(String[] args) {
        int x=1;
        int y=0;

        System.out.print("Sum of numbers 1 to 100:");
        while (x<=100) {
            y+=x;
            x++;
        }
        System.out.print(" "+y+"\nSum of even numbers 1 to 100: ");
        x=1;
        y=0;
        while (x<=100) {
            if (x%2==0) {
                y+=x;
            }
            
            x++;
        }
        System.out.print(" "+y+"\nSum of odd numbers 1 to 100: ");
        x=1;
        y=0;
        while (x<=100) {
            if (x%2!=0) {
                y+=x;
            }
            
            x++;
        }
        System.out.println(y);
    }
}

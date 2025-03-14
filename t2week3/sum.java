package t2week3;

public class sum {
    public static void main(String[] args) {
        int counter = 1;
        int total =0;

        while (counter<=75) {
            total +=counter;
            counter++;
        }
        System.out.println("Sum of all numbers from 1 to 75 is: "+total);
    }
}

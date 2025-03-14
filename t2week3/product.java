package t2week3;

public class product {
    public static void main(String[] args) {
        int counter = 1;
        int total =1;

        while (counter<=10) {
            total *= counter;
            counter++;
        }
        System.out.println("Product of all numbers from 1 to 10 is: "+total);
    }
}

package t2week9;

public class fourthloop {
    public static void main(String[] args) {
        int[]x={7,6,11,15,19};
        int y=0;
        for (int i=0;i<x.length;i++) {
            y+=x[i];
        }

        System.out.println("Sum of the numbers: "+y);
    }
}

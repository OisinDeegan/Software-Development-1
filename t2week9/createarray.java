package t2week9;
import java.util.Scanner;
public class createarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0;
        int y=0;
        int[]z={};
        double[]a={};
        System.out.print("Enter 1 for int array, 2 for double array: ");
        x=input.nextInt();
        while (x!=1&&x!=2) {
            System.out.print("Enter 1 for int array, 2 for double array: ");
            x=input.nextInt();
        }
        System.out.print("Enter how many values you need to store in the array:");
        y=input.nextInt();
        if (x==1) {
            z=new int[y];
        } else {
            a=new double[y];
        }

        for (int i=0;i<y;i++) {
            System.out.print("Enter value "+(1+i)+": ");
            if (x==1) {
                z[i]=input.nextInt();
            } else {
                a[i]=input.nextDouble();
            }
        }
        System.out.println("Values in array are:\n");
        for (int i=0;i<y;i++) {
            if (x==1) {
                System.out.print(z[i]+" ");
            } else {
                System.out.print(a[i]+" ");
            }
            
        }
        System.out.println();
        input.close();
    }
}

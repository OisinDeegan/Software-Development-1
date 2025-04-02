package t2week9;
import java.util.Scanner;
public class sixtharray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []x={23,104,69,3,1002,9001,77,88,99,10};
        int y=0;
        int i=-1;
        boolean print=false;
        System.out.print("Enter search number: ");
        y=input.nextInt();
        
        do {
            i++;
            if (i<x.length){
                
                if (y==x[i]) {
                    System.out.println("Number is contained in the array at index "+(i));
                    print=true;
                }
            }else{
                System.out.println("Number is not contained in array");
                print=true;
            }
        } while (print!=true);
        input.close();
    }
}

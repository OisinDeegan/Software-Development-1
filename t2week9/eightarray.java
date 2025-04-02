package t2week9;
import java.util.Scanner;
public class eightarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []x={23,104,69,3,1002,9001,77,88,99,10};
        int y=0;
        int i=-1;
        boolean print=false;
        boolean found=false;
        String output="";
        System.out.print("Enter search number: ");
        y=input.nextInt();
        
        do {
            i++;
            if (i<x.length){
                if (y==x[i]){
                    found=true;
                } 
                if (y!=x[i]) {
                    output+=i+"\t"+x[i]+"\n";
                }
            }else{
                print=true;
            }
        } while (print!=true);
        
        if (found==false) {
            System.out.println("Number not found in array");
        }else{
            System.out.print(output);
        }
        input.close();
    }
}

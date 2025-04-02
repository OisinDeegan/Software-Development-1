package t2week9;
import java.util.Scanner;
public class shoppinglist {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("How many items do you need to add to your shopping list: ");
        int y=input.nextInt();
        String[]x=new String[y];
        
        for (int i=0;i<y;i++) {
            System.out.print("Add item "+(i+1)+" to your shopping list: ");
            if(i==0){
            x[i]=input.nextLine();
            }
            
            x[i]=input.nextLine();
        }

        for (int i=0;i<y;i++) {
            System.out.println((i+1)+". "+x[i]);
        }
        input.close();
    }
}

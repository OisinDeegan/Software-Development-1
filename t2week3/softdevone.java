package t2week3;

public class softdevone {
    public static void main(String[] args) {
        int x = 1;
        while (x<=30) {
            
            if (x==4) {
                System.out.print("Soft ");
            }else if(x==15){
                System.out.print("Dev ");
            }else if (x==21) {
                System.out.print("One ");
            }else if (x==29) {
                System.out.print("SoftDevOne ");
            }else{
                System.out.print(x+" ");
            }
            x++;
        }
        System.out.println();
    }
}

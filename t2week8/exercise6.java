package t2week8;

public class exercise6 {
    public static void main(String[] args) {
        int z=6;
        System.out.println("Part A:");
        for (int x=1;x<=z;x++) {
            for (int y =1;y<=x;y++) {
                
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("\nPart B:");
        for (int x=1;x<=z;x++) {
            for (int y =0;y<x;y++) {
                
                System.out.print("1"+y+" ");
            }
            System.out.println();
        }
    }
}

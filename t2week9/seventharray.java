package t2week9;

public class seventharray {
    public static void main(String[] args) {
        
        int[]x={23,104,3,65,1002,9001,77,88,99,10};
        int[]y= new int[x.length];

        System.out.println("Index\tBefore\tAfter");
        System.out.println("-----\t------\t-----\n");
        for (int i=0;i<x.length;i++) {
            y[i]=x[((x.length-1)-i)];
            System.out.println(i+"\t"+x[i]+"\t"+y[i]);
        }

    }
}

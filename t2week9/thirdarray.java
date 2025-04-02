package t2week9;

public class thirdarray {
    public static void main(String[] args) {
        int[]y= new int[5];
        
        for (int i=0;i<y.length;i++) {
            y[i]=i+1;
        }

        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for (int i =0; i<y.length;i++) {
            System.out.println(i+"\t"+y[i]);
        }
    }
}

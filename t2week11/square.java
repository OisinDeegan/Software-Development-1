package t2week11;

public class square {
    public static void main(String[] args) {
        System.out.println("Number\tSquare");
        System.out.println("++++++\t++++++");
        for (int i =2; i<=7;i++) {
            System.out.println(i+"\t"+squareOf(i));
        }
        
    }

    static int squareOf(int value){
        return value*value;
    }
}

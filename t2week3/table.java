package t2week3;

public class table {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        System.out.println("Number\tSquare\tCube");
        while (x<=y) {
            System.out.println(x+"\t"+(x*x)+"\t"+(x*x*x));
            x++;
        }
    }
}

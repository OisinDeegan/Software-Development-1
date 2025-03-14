public class squares {
    public static void main(String[] args) {
        int x=1;
        int y=0;

        while (x<=10) {
            y+=(x*x);
            x++;
        }
        System.out.println(y);
    }
}

package t2week2;

public class casttoint {
    public static void main(String[] args) {
        double a =5;
        double b=8;
        int c=0;

        System.out.print(a+"*"+b+"=");
        a*=b;
        c= (int) a;
        System.out.println(c);
    }
}

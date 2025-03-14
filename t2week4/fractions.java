package t2week4;

public class fractions {
    public static void main(String[] args) {
        double sum = 0;
        int i =1;
        double term=0.0;

        while (i<=10) {
            
            term=(1.0/(i*i*i));
            sum+=term;
            i++;
        }
        System.out.println(sum);
    }
}

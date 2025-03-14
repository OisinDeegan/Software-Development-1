package t2week7;

public class five {
    public static void main(String[] args) {
        System.out.println("Divisible by 5");
        
        for (int i =1; i<=50; i++) {
            if (i%5==0 && i!=50) {
                System.out.print(i+", ");
            }else if(i==50){
                System.out.println(i);
            }
        }

        int count = 5;
        while (count <50) {
            System.out.print(count+", ");
            count+=5;
        }
        System.out.println(count);
    }
}

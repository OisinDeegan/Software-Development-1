import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();
        System.out.print(number);
        int count =0;
        while (number>0 || number<0) {
            count++;
            number/=10;
        }
        System.out.println(" contains "+count+" digits");
        for(int rng=0; rng <=10; rng++){
            System.out.println(Math.floor(Math.random()*100+1));
        }
        input.close();
    }
}

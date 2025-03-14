import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x =0;
        boolean submit = true;
        boolean part = true;
        String keyboard = "banan";
        String grade="";
        String postfix="";

        System.out.print("Enter score as whole number: ");
        if (input.hasNextInt()) {
            x = input.nextInt();

            if(x>=50){
                System.out.print("Did you submit all projects (true/false): ");
                submit=input.nextBoolean();
                System.out.print("Did you participate in all classes (true/false): ");
                part=input.nextBoolean();
                if(submit && part);{
                    postfix="+";
                }if(!submit && !part){
                    postfix="-";
                }
            }  
            if(x>=90&&x<=100){
                grade="A";
            }
            // the rest is simple, the mistake was solved above, just do the rest as in the test submission

        }else{
            System.out.println("Invalid number detected");
        }
        input.close();
    }
}


package t2week7;

public class fiveeleven {
    public static void main(String[] args) {
        String output = "";
        String output2="";
        String output3="";

        System.out.println("Divisible by 5 or 11:");
        for (int loop=1; loop<=50; loop++) {
            if(loop%5==0 || loop%11==0){
                output += (loop+", ");
            }
            if (loop%5==0) {
                output2 += (loop+", ");
            }
            if (loop%11==0) {
                output3 += (loop+", ");
            }
        }
        output=output.substring(0, output.length()-2);
        output2=output2.substring(0, output2.length()-2);
        output3=output3.substring(0, output3.length()-2);
        System.out.println(output);
        System.out.println("Divisible by 5\n"+output2);
        System.out.println("Divisible by 11\n"+output3);

    }
}

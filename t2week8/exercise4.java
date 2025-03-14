package t2week8;

public class exercise4 {
    public static void main(String[] args) {
        String output="";
        int x=20;
        int y  =0;

        while (x>=1) {
            if (x>=10) {
                if (x%2==0) {
                    output+=x+" + ";
                    y+=x;
                } 
            }
            
            x--;
        }
        output = output.substring(0,output.length()-3);
        output +=" = "+y;
        System.out.println(output);
    }
}

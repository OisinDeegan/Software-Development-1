package t2week8;

public class exercise5 {
    public static void main(String[] args) {
        String output="";
        for (int x = 1;x<=5;x++) {
            System.out.print(x+": ");
            for (int y=8;y>=2;y-=2) {
                
                output+=y+", ";
            }
            output=output.substring(0,output.length()-2);
            System.out.println(output);
            output="";
        }
    }
}

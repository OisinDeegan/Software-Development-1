public class twentynums{
    public static void main(String[] args) {
        int i=1;

        while (i<=20) {
            
            if (i!=20) {
                System.out.print(i+" + ");
            }else{
                System.out.println(i);
            }
            i++;
        }
        i=1;
        while (i<=19) {
            System.out.print(i+" + ");
            i++;
        }
        System.out.print(i);
        System.out.println();
    }  
}
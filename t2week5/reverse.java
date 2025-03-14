public class reverse {
    public static void main(String[] args) {
        int sum=0;
        for (int x=10; x>=1; x--) {
            System.out.println(x);
        }
        System.out.println();
        for(int i=1;i<=15;i+=2){
            sum+=i;
        }
        System.out.println(sum);
    }
}

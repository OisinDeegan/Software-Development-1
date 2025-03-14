public class testingquiz {
    public static void main(String[] args) {
        int temp = 180;

        if (temp>90) {
            System.out.println("This porrdige is too hot.");
            temp=temp-(200-100);
        }
        else
        {
            if (temp<70)
            {
                System.out.println();
                temp=temp+20;
            }
        }
        /* thought there was an else statement :( */
        if(temp==80)
        System.out.println("This porridge is just right");
    }
    

}

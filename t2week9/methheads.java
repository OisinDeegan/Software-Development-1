package t2week9;

public class methheads {
    public static void main(String[] args) {
        methheads m=new methheads();
        m.hello();
        
        String s = m.salutations();
        System.out.println(s);
        System.out.println(m.one());
        m.myPrinter("Giving my printer a job");
        m.numbers(200, 69);
        System.out.println(m.add(3, 4));
    }

    void hello(){
        System.out.println("Helo");
        System.out.println(salutations());
    }

    String salutations(){
        return "Good Everning to you";
    }
    int one(){
        return 1;
    }

    void myPrinter(String data){
        System.out.println(data);
    }
    void numbers(int first, int second){
        System.out.println(first + " and "+second);
    }

    int add(int x, int y){
        return x+y;
    }
}

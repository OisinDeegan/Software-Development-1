package t2week9;

public class arrays1 {
    public static void main(String[] args) {
        int [] x={100, 200, 300, 400};

        System.out.println("Value 1: "+x[0]);
        System.out.println("Value 2: "+x[1]);
        System.out.println("Value 3: "+x[2]);
        System.out.println("Value 4: "+x[3]);

        for(int i=0;i<x.length;i++){
            System.out.println("Element "+(1+i)+": "+x[i]);
        }

        double [] y ={2.5,3.4};
        for(int i=0;i<y.length;i++){
            System.out.println("Element "+(1+i)+": "+y[i]);
        }

        String [] names ={"Kevin","JOHN CEENNA!!"};
        for(int i=0;i<names.length;i++){
            System.out.println("Element "+(1+i)+": "+names[i]);
        }

        int [][] mda={{10,20},{1000, 2000, 3000}};
        for(int i=0;i<mda.length;i++){
            for(int j=0;j<mda[i].length;j++){
                System.out.print(mda[i][j]+" ");
            }
            System.out.println();
        }
    }
}

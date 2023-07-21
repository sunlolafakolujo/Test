package test;

public class VarArg {
    final synchronized  strictfp static public void main(String ...sunlola){
        m(1,2,3);
        m(true,2,7,9);
        m(10,20);
        person("fola","dupe","Ishola");

        int[] a={10,20,30};
        int[] b={40,50,60};
        k(a,b);
    }

    public static void k(int[]... x){
        for (int[]xi:x){
            System.out.println("First element of xi: "+xi[0]);
            for (int y: xi){
                System.out.println("Elements of y: "+y);
            }
        }
    }
    public static void m(int... args){
        int sum=0;
        for (int i: args){
            sum+=i;
        }
        System.out.println("Sum of variables: "+sum);
    }

    public static void m(int y, double z){
        int sum=0;
        sum+=y+z;

        System.out.println("Sum of normal variable: "+sum);
    }

    public static void m(boolean p,double... args){
        int multiplication=1;
        for (double i: args){
            multiplication*=i;
        }
        System.out.println("Multiplications of variables: "+multiplication);
    }

    public static void person(String... name){
        for (String names:name){
            System.out.print(names+" ");
        }
        System.out.println();
        System.out.println("Number of names: "+name.length);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
    }
}

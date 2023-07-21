package test;

public class Test1 {
    static int x=20;
    int y=30;
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        int z;
        Test1 t1=new Test1();
        t1.x=800;
        t1.y=400;
        System.out.println("x: "+t1.x +" ,"+"y: "+t1.y);
        Test1 t2=new Test1();
        System.out.println("x2: "+t2.x +" ,"+"y2: "+t2.y);
        t1.mimi();

        if (args.length>0){
            z=10;
        }else {
            z=20;
        }
        System.out.println(z);
        System.out.println();
        mimi2();
        mimi2(10);
        mimi2(10,20);
    }

    public void mimi(){
//        int[] x;
//        System.out.println(x);
//        System.out.println(x[0]);
        int[] x=new int[3];
        System.out.println(x);
        System.out.println(x[0]);
    }

    public static void mimi2(int... x){
        System.out.println("Var-arg Methods");
    }
}

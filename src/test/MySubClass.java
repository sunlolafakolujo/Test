package test;

public class MySubClass extends MyClass{
    int w;

    public MySubClass(int i, String j, int w) {
        super(i, j);
        this.w = w;
    }


    public static void main(String[] args) {
        MySubClass m=new MySubClass(10,"Hello",40);
//        m.w=30;
        System.out.println(m.getClass().getName());
        System.out.println(m.i+"......"+m.j+"..."+m.w);
    }
}

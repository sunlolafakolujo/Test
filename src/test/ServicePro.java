package test;

public class ServicePro extends ServiceProvider{
    @Override
    public void m1() {
        System.out.println("Jesus reigns");
    }

    @Override
    public void m2() {
        System.out.println("God is the greatest");
        System.out.println("X:"+ x);
    }

    public static void main(String[] args){
        ServicePro s=new ServicePro();
        s.m1();
        s.m2();

    }
}

package test;

public class Pupil {

    static int count;
    {
        count++;
    }

     public Pupil() {
        System.out.println("Non-parameterized constructor");
    }

    public Pupil(int i) {
        System.out.println("Int-parameterized constructor");
    }

    public Pupil(double i) {
        System.out.println("Double-parameterized constructor");
    }

    public static void main(String[] args){
        Pupil p=new Pupil();

        Pupil p2=new Pupil(10);

        Pupil p3=new Pupil(10.5);

        System.out.println(count);
    }
}

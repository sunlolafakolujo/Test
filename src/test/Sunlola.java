package test;

public class Sunlola {

    public Sunlola() {
        this(10);
        System.out.println("No-arg constructor");
    }
    public Sunlola(int i) {
        this(10.5);
        System.out.println("int-arg constructor called");
    }
    public Sunlola(double j){
        System.out.println("double-arg constructor called");
    }

    public static void main(String[] args){
        Sunlola s=new Sunlola();
    }
}

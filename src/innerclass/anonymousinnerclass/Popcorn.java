package innerclass.anonymousinnerclass;

public class Popcorn {
    public void m1(){
        System.out.println("Sweet");
    }

    public static void main(String[] args) {
        Popcorn p = new Popcorn();
        System.out.println("Class name: "+p.getClass().getName());
        p.m1();
        System.out.println();
        Popcorn p1 = new Popcorn(){
            public void m1(){
                System.out.println("sour");
            }
        };
        System.out.println("Class name: "+p1.getClass().getName());
        p1.m1();
        System.out.println();
        Popcorn p2 = new Popcorn(){
            public void m1(){
                System.out.println("bitter");
            }
        };
        System.out.println("Class name: "+p2.getClass().getName());
        p2.m1();
    }
}

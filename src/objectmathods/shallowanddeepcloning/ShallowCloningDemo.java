package objectmathods.shallowanddeepcloning;

public class ShallowCloningDemo implements Cloneable{
    int i;
    Cat cat=new Cat();

    public ShallowCloningDemo() {
    }

    public ShallowCloningDemo(int i, Cat cat) {
        this.i = i;
        this.cat = cat;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowCloningDemo demo = new ShallowCloningDemo();
        demo.i=50;
        demo.cat.j=300;
        demo.cat.k=700;

        ShallowCloningDemo demo2=(ShallowCloningDemo) demo.clone();
        demo2.i=100;
        demo2.cat.j=1000;

        System.out.println(demo.i+" "+demo.cat.j+" "+demo.cat.k);
        System.out.println();
        System.out.println(demo2.i+" "+demo2.cat.j+" "+demo2.cat.k);

    }

    @Override
    public String toString() {
        return "ShallowCloningDemo{" +
                "i=" + i +
                ", cat=" + cat +
                '}';
    }
}

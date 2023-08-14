package objectmathods.shallowanddeepcloning;

public class DeepCloningDemo implements Cloneable {
    int i;
    Cat cat = new Cat();

    public DeepCloningDemo() {
    }

    public DeepCloningDemo(int i, Cat cat) {
        this.i = i;
        this.cat = cat;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloningDemo deepCloningDemo = (DeepCloningDemo) super.clone();
        deepCloningDemo.cat = new Cat();
        deepCloningDemo.cat.j = cat.j;
        deepCloningDemo.cat.k = cat.k;
        return deepCloningDemo;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepCloningDemo demo = new DeepCloningDemo();
        demo.i=200;
        demo.cat.j=300;
        demo.cat.k=800;

        DeepCloningDemo demo1=(DeepCloningDemo) demo.clone();
        demo1.i=250;
        demo1.cat.j=450;
        System.out.println(demo.i+" "+demo.cat.j+" "+demo.cat.k);
        System.out.println(demo1.i+" "+demo1.cat.j+" "+demo1.cat.k);
        System.out.println();
        demo1.i=5000;
        demo1.cat.j=10000;

        System.out.println(demo.i+" "+demo.cat.j+" "+demo.cat.k);
        System.out.println(demo1.i+" "+demo1.cat.j+" "+demo1.cat.k);


    }


    @Override
    public String toString() {
        return "DeepCloningMethod{" +
                "i=" + i +
                ", cat=" + cat +
                '}';
    }
}

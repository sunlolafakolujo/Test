package test;

public final class ImmutableClassDemo {
    int i;
    ImmutableClassDemo(int i) {
        this.i = i;
    }
    public ImmutableClassDemo modify(int i) {
        if (this.i==i){
            return this;
        }else {
            return new ImmutableClassDemo(i);
        }
    }

    public static void main(String[] args) {
        ImmutableClassDemo demo = new ImmutableClassDemo(1);
        ImmutableClassDemo demo2 = new ImmutableClassDemo(2).modify(2);
        System.out.println(demo==demo2);
        System.out.println(demo.i==demo2.i);
        System.out.println(demo);
    }

    @Override
    public String toString() {
        return "ImmutableClassDemo{" +
                "i=" + i +
                '}';
    }
}

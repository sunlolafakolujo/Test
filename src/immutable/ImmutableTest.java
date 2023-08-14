package immutable;

final public class ImmutableTest {
    private final int id;
    public ImmutableTest(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public ImmutableTest modify(int id){
        if (this.id==id) return this;
        else return new ImmutableTest(id);
    }

    @Override
    public String toString() {
        return "ImmutableTest{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        ImmutableTest immutableTest=new ImmutableTest(20);
        System.out.println(immutableTest.hashCode());
        System.out.println(immutableTest.modify(40).hashCode());
        System.out.println(immutableTest.modify(20).hashCode());
    }

}

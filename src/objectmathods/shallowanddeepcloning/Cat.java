package objectmathods.shallowanddeepcloning;

public class Cat {
    int j;
    int k;

    public Cat() {
    }

    public Cat(int j, int k) {
        this.j = j;
        this.k = k;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "j=" + j +
                '}';
    }
}

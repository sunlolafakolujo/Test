package collectionframework.mapinterface;

import java.util.Objects;

public class Test {
    int i;
    public Test(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Test{" +
                "i=" + i +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}

package collectionframework.mapinterface;

import java.util.Objects;

public class Test1 {
    int i;
    public Test1(int i) {
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
        return Objects.hash(i)%9;
    }
}

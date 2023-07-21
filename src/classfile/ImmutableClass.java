package classfile;

import java.util.Objects;

public class ImmutableClass {
    int i;
    public ImmutableClass(int i) {
        this.i=i;
    }

    public ImmutableClass modify(int i) {
        if (this.i==i) {
            return this;
        }
        else {
            return new ImmutableClass(this.i);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutableClass)) return false;
        ImmutableClass that = (ImmutableClass) o;
        return i == that.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "i=" + i +
                '}';
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass=new ImmutableClass(10);
        ImmutableClass immutableClass1=new ImmutableClass(100);
        ImmutableClass immutableClass2=immutableClass;
        System.out.println(immutableClass);
        System.out.println(immutableClass1);
        System.out.println(immutableClass==immutableClass1);
        System.out.println(immutableClass==immutableClass2);
        System.out.println(immutableClass.modify(100));//immutable object
    }
}

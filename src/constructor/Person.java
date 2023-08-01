package constructor;

public class Person {
    private int id;
    String name;
    int age;
    int count=0;

    {
        count++;
    }
    public Person() {
        System.out.println("No-arg constructor");
    }

    public Person(int id, String name, int age) {
        this(name, age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person(101,"John",20);
        System.out.println(p.count+" "+p);
        Person p1=new Person("Johnny",24);
        System.out.println(p1.count+" "+p1);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

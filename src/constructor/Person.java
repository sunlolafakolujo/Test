package constructor;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person() {
        System.out.println("No-arg constructor");
    }

    public Person(int id, String name, int age) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person(101,"John",20);
        Person p1 = new Person(102,"Johnny",30);
        System.out.println(p.getId() + " " + p.getName() + " "+ p.getAge());
        System.out.println(p1.getId() + " " + p1.getName() + " "+ p1.getAge());
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

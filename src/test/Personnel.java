package test;

import java.util.Objects;

public class Personnel {
    String name;
    int age;

    public Personnel() {
    }

    public Personnel(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return age == personnel.age && Objects.equals(name, personnel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args)  {
        Personnel p=new Personnel("John",10);
        Personnel p2=new Personnel("Hakeem",100);
        System.out.println(p);
//        System.out.println(p.equals(p));
//        System.out.println(p.hashCode());
        System.out.println(p2);
//        System.out.println(p.equals(p2));
//        System.out.println(p.hashCode()==p2.hashCode());
//        System.out.println(p2.hashCode());


    }
}

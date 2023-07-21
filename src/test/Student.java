package test;

public class Student extends Person{
    int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo=rollNo;
    }

    public static void main(String[] args) {
        Student s=new Student("Durga",30,101);
        System.out.println("Student1: "+"\nName: "+s.name+"\nAge: "+s.age+"\nRollNo: "+s.rollNo);
    }
}

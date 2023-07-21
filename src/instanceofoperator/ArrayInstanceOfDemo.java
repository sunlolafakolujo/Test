package instanceofoperator;

import test.Student;
import java.util.ArrayList;

public class ArrayInstanceOfDemo {
    public static void main(String[] args) {
        Student s1=new Student("Kayode",12,101);
        Student s2=new Student("Tayo",10,102);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        Object o=students.get(0);

        System.out.println(o instanceof Student);

        String s="Student";
        System.out.println(s instanceof Object);
        System.out.println(4 | 3);

    }
}

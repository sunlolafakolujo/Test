package collectionframework.listinterfaceclasses.comparatorinlistinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101,"Sunlola"));
        students.add(new Student(102,"John"));
        students.add(new Student(121,"Emmanuel"));
        students.add(new Student(141,"Lowo"));
        students.add(new Student(131,"Akinwunmi"));

        System.out.println("Size of Student");
        System.out.println(students.size());
        System.out.println();
        System.out.println("List of students");
        for(int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i)+" ");
        }

        System.out.println();
        //Sorting by roll number in ascending order
        System.out.println("Sorting by roll number in ascending order");
        Collections.sort(students,new SortByRollNumber());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Sorting by name in ascending order");
        //sorting by name in ascending order
        Collections.sort(students,new SortedByName());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Sorting by roll number in descending order");
        Collections.sort(students,new SortByRollNumberInDescendingOrder());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Sorting by name in descending order");
        Collections.sort(students,new SortByNameInDescendingOrder());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

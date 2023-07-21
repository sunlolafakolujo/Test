package collectionframework.listinterfaceclasses.comparatorinlistinterface;

import java.util.Comparator;

public class SortByRollNumber implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student)o1;
        Student student2 = (Student)o2;

        //Ascending order of the roll number
        return student1.getRollNumber() - student2.getRollNumber();
    }
}

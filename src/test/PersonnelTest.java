package test;

import constructor.P;

import java.util.List;
import java.util.stream.Collectors;

public class PersonnelTest {
    public static void main(String[] args) {
        int age=0;
        List<Personnel> personnelList = List.of(new Personnel("John", 12),
                new Personnel("Peter", 11), new Personnel("Kayode", 14),
                new Personnel("Akin", 20));

        System.out.println(personnelList.stream().map(c -> c.getName()).collect(Collectors.toList()));


    }

}

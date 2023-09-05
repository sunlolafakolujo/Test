package test;

import java.util.ArrayList;
import java.util.List;

public class Test16 {
    public static void main(String[] args) {
        int count = 0;
        List<Character> chars = new ArrayList<>();
        do {
            chars.add('x');
            for (Character c : chars) count -= 1;
        } while (count > 0);
        System.out.println(chars.size());
    }
}

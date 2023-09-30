package controlflow;

import java.util.Arrays;

public class ForLoopDemo3 {
    public static void main(String[] args) {
        String[] strings=new String[]{"11", "2", "3", "4", "5",};
        for (int i=0; i<strings.length; i++){
            if (strings[i].length()<2) {
                System.out.println(i);
                break;
            }
        }

    }
}

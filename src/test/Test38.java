package test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Test38 {
    public static void main(String[] args) {
        int[] crosswords []=new int[10][10];
        for (int i=0; i<crosswords.length; i++){
            for (int j=0; j<crosswords[i].length; j++){
                crosswords[i][j] = 'x';
            }
        }
        System.out.println(crosswords.length);
        System.out.println(Arrays.deepToString(crosswords));

        StringBuilder sb=new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(1,1);
        System.out.println(sb);

        LocalDate date = LocalDate.parse("2020-07-09");
        String dateString = date.toString();
        System.out.println(dateString.substring(0,8).concat(String.valueOf(new Random().nextInt(10000))));
    }
}

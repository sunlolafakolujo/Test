package test;

import java.util.Arrays;

public class Calculator {
    public static void main(String[] args){
       System.out.println("Max: "+ maximum(10,20,800,60,900,80,100,500));
//        int[] a={1,78,90,76,100,1,24};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
       System.out.println("Min: "+ minimum(10,20,800,7,60,900,80,100,500));
       String[] daysOfTheWeek={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
       for(int i=0; i<daysOfTheWeek.length;i++) {
           switch (daysOfTheWeek[i]) {
               case "Sunday":
                   System.out.println("First day of the week is: "+daysOfTheWeek[i]);
                   break;
               case "Monday":
                   System.out.println("Second day of the week is: "+daysOfTheWeek[i]);
                   break;
               case "Tuesday":
                   System.out.println("Third day of the week is: "+daysOfTheWeek[i]);
                   break;
               case "Wednesday":
                   System.out.println("Fourth day of the week is: "+daysOfTheWeek[i]);
                   break;
               case "Thursday":
                   System.out.println("Fifth day of the week is: "+daysOfTheWeek[i]);
                   break;
               case "Friday":
                   System.out.println("Sixth day of the week is: "+daysOfTheWeek[i]);
                   break;
               case "Saturday":
                   System.out.println("Seventh day of the week is: "+daysOfTheWeek[i]);
                   break;

               default:
                   System.out.println("Not days of week");

           }
       }
    }
    public static int maximum(int... x){
        int max=x[0];
        for (int i=0; i<x.length; i++){
                if (x[i]>max){
                    max=x[i];
                }
        }
        System.out.println("Array Length: " + x.length);
        return max;
    }
    public static int minimum(int... x){

        int min=x[0];
//        int max= Arrays.stream(x).max().getAsInt();
        for (int i=0; i<x.length; i++){
            if (x[i]<min){
                min=x[i];
            }
        }
        System.out.println("Array Length: " + x.length);
//        System.out.println("Max: " + max);

        return min;
    }
}

package controlflow.forloop;

public class ForLoopOnTwoDimensionalStringArray {
    public static void main(String[] args) {
        String[][] daysOfTheWeek=new String[][]{{"January","February","March","April","May","June"}
                ,{"July","August","September","October","November","December"}};
        for (int day=0; day<daysOfTheWeek.length; day++){
            for (int i=0; i<daysOfTheWeek[day].length; i++){
                System.out.print(daysOfTheWeek[day][i]+" ");

            }
        }
        System.out.println("\n\nReverse days of the week ");
        for (int day=daysOfTheWeek.length-1;day>=0; day--){
            for (int i=daysOfTheWeek[day].length-1; i>=0; i--){
                System.out.print(daysOfTheWeek[day][i]+" ");
            }
        }
        System.out.println("\nLength of days of the week: "+daysOfTheWeek.length);
    }
}

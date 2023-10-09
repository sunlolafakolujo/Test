package controlflow.forloop;

public class ForLoopPattern {
    public static void main(String[] args) {
        String[] daysOfTheWeek = new String[]{"1", "2", "3", "4", "5"};

        for (int i = 0; i < daysOfTheWeek.length; i++) {
            System.out.print(daysOfTheWeek[i] + " ");
        }
        System.out.println();
        for (int j = daysOfTheWeek.length - 1; j >= 0; j--) {
            System.out.print(daysOfTheWeek[j] + " ");
        }
        System.out.println();
        for (int i = 0; i < daysOfTheWeek.length; i++) {
            System.out.print(daysOfTheWeek[i] + " ");
        }
        System.out.println();
        for (int j = daysOfTheWeek.length - 1; j >= 0; j--) {
            System.out.print(daysOfTheWeek[j] + " ");
        }
    }
}

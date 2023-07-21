package controlflow;

public class DoWhileLoopPatternDemo {
    public static void main(String[] args) {
        int i=1;
        do{
            int j=1;
            do{
                if (j<=i) {
                    System.out.print("*");
                    j++;
                }
            }while (j<=i);
            System.out.println();
            i++;
        }while (i<=5);

    }
}

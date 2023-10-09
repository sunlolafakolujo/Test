package controlflow.transferstatement;

public class ForLoopContinueStatement1 {
    public static void main(String[] args) {
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) {
                    continue;
                }
                System.out.println(i+ " "+j);
            }
        }
    }
}

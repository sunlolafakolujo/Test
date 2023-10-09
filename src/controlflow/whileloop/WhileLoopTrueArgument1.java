package controlflow.whileloop;

public class WhileLoopTrueArgument1 {
    public static void main(String[] args) {
        int count=0;
        while (true){
            if (count<=10){
                System.out.println(count);
                count++;
            }
        }
    }
}

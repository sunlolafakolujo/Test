package controlflow;

public class TransferStatementContinueDemo {
    public static void main(String[] args) {
        int count=10;
        while(count>=0) {
            if (count==7) {
                count--;
                continue;
            }
            System.out.print(count+" ");
            count--;
        }
        System.out.println();
        System.out.println("do-while loop");
        int j=0;
        do{
            if (j==7){
                j++;
                continue;
            }
            System.out.print(j+" ");
            j++;
        }while (j<10);
    }
}

package controlflow.transferstatement;

public class DoWhileTransferStatement {
    public static void main(String[] args) {
        int j=0;
        do {
            j++;
            System.out.print(j+" ");
            if (j==7){
                break;
            }
        }while (j<10);
        System.out.println();
        System.out.println(j);
    }
}

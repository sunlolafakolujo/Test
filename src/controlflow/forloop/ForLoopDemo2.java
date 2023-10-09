package controlflow.forloop;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        String[] strings=new String[]{"11", "2", "3", "4", "5",};
        String[] strings1=new String[]{"6", "7", "8"};
        for (int i=0,j=0; i<strings.length; i++,j++){
            System.out.println(strings[i]+" "+strings1[j]);
        }
    }
}

package classfile;

public class Pablo {
    static int start =2;
//    final int end;
    int t, i=5;
    public Pablo(){
    }
    public Pablo(int x) {
        x = 4;
//        end=x;
    }

    public void fly(int distance){
//        System.out.println(end-start+"");
//        System.out.println(distance);
    }

    public static void main(String[] args){
//        new Pablo(10).fly(5);
        Pablo p=new Pablo();
        System.out.println(p.i);
    }
}

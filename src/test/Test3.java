package test;

public class Test3 {
    int i;
    Test3(int i) {
        this.i = i;
    }
//    public String toString() {
//        return this.i+"";
//    }

    public int hashCode() {
        return this.i;
    }
    public static void main(String[] args){
        Test3 t=new Test3(10);
        Test3 t2=new Test3(100);
        Test3 t3=new Test3(10);
        Test3 t4=t;
        System.out.println(t);//t1 hashcode
        System.out.println(t2);//t2 hashcode
        System.out.println(t.equals(t2));
        System.out.println(t.equals(t4));
        System.out.println(t.equals(t3));
    }
}

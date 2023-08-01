package objecttypecasting;

public class ObjectTypeCastDemo {
    public static void main(String[] args) {
        Object o=new String("Sunlola");
        StringBuffer sb=(StringBuffer) o;
        System.out.println(sb);//It will throw ClassCastException at Runtime.
    }
}

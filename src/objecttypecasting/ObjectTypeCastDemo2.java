package objecttypecasting;

public class ObjectTypeCastDemo2 {
    public static void main(String[] args) {
        Object o=new String("hello");
        String s=(String) o;//downcast child/parent relationships
        System.out.println(s);

        Object o2=o;//same type
        System.out.println(o2);

        String str=new String("hello World");
        Object ob=str;
        System.out.println(ob);
    }
}

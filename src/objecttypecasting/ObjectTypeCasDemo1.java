package objecttypecasting;

public class ObjectTypeCasDemo1 {
    public static void main(String[] args) {
        String s=new String("hello");
//        StringBuffer sb=(StringBuffer) s;//Throws incompatible Types: cannot convert string to StringBuffer
       try {
           Object obj = new Object();
           String str = (String) obj;
           System.out.println(str);
       }catch (ClassCastException e) {
           e.printStackTrace();
       }
    }
}

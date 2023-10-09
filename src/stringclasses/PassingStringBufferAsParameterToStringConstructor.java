package stringclasses;

public class PassingStringBufferAsParameterToStringConstructor {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("In God I trust");
        String str=new String(buffer);
        System.out.println(str);
    }
}

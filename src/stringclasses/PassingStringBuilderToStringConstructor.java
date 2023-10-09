package stringclasses;

public class PassingStringBuilderToStringConstructor {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("In every situation, always give thanks");
        String string=new String(stringBuilder);
        System.out.println(string);
    }
}

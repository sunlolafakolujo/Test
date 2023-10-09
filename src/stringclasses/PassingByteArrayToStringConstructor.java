package stringclasses;

public class PassingByteArrayToStringConstructor {
    public static void main(String[] args) {
        byte[] bytes=new byte[]{100,101,102,103,104,105,106,107,108};
        String string=new String(bytes);
        System.out.println(string);
        System.out.print("Character in index 2: ");
        System.out.print(string.charAt(2));
        String str=null;
        str="Sun";
        System.out.println();
        System.out.println(str);
    }
}

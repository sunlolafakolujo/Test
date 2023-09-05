package wrapperobject;

public class WrapperClassDemo4 {
    public static void main(String[] args) {
        String s1=new String("You cannot change me");
        String s2=new String("You cannot change me");
        System.out.println(s1==s2);
        String s3="You cannot change me";
        String s4="You cannot change me";
        System.out.println(s3==s4);
        String s5="You cannot"+" change me";
        System.out.println(s3==s5);
        String s6="You cannot";
        String s7=s6+" change me";
        System.out.println(s3==s7);
        final String s8="You cannot";
        String s9=s8+" change me";
        System.out.println(s3==s9);
        System.out.println(s6==s8);

        String str="Sunlola";
        char[] chr=new char[str.length()];
        System.out.println(str);
        char[] c=new char[str.length()];
        for (int i=0; i<str.length(); i++){
            c[i] = str.charAt(i);
            chr=c;
        }
        System.out.print("c1: ");
        for (char c1:chr){
            System.out.print(c1+" ");
        }
    }
}

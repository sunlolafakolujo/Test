package java8.functionalinterface;

public class SumLengthOfString implements LengthOfString1{
    @Override
    public int getSumStringLength(String s, String s1) {
        return (s.length()+s1.length());
    }

    public static void main(String[] args) {
        LengthOfString1 l=new SumLengthOfString();
        System.out.println(l.getSumStringLength("Sunlola","Fakolujo"));
    }
}

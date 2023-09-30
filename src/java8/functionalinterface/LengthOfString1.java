package java8.functionalinterface;

public interface LengthOfString1 {
    default int getSumStringLength(String s,String s1){return s.length()+s1.length();}
}

package java8.functionalinterface;

public interface LengthOfString {
    int getLength(String s);
    default int getSumStringLength(String s,String s1){return s.length()+s1.length();}
    private void goal(){};
}

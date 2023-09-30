package java8.functionalinterface;

public interface SayLabel {
    default void say(String s){
        System.out.println(s);
    }
}

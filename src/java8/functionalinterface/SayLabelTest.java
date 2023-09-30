package java8.functionalinterface;

public class SayLabelTest implements SayLabel{
    public static void main(String[] args) {
//        SayLabel sayLabel=(s)-> System.out.println(s);
        SayLabel sayLabel=new SayLabelTest();
        sayLabel.say("I love you");
    }
}

package controlflow.whileloop;

public class NumberOfCharacterInStringDemo {
    public static void main(String[] args) {
        String s="Hello World";
        int count=0;
        System.out.printf("%s %15s%n", "Index","Character");
        while (count<s.length()){
            System.out.printf("%d%15s%c%n",count,"",s.charAt(count));
            count++;
        }
        System.out.println("Number of characters in String s: "+count);
    }
}

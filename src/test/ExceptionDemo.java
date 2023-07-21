package test;

public class ExceptionDemo {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        if (age >40){
            throw new TooOldException("Too old get married");
        }else if (age <18){
            throw new TooYoungException("Too young get married");
        }else{
            System.out.println("Within age bracket");
        }
    }
}

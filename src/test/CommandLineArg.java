package test;

public class CommandLineArg {
    public static void main(String[] args) {
//        for (int i=0; i<args.length; i++) {
//            System.out.print(args[i]+" ");
//        }
        String[] str={"A", "B", "C", "D", "E", "F"};
        args=str;
        for (String st:args) {
            System.out.print(st+" ");
        }
        byte a=10;
        byte b=20;
        byte c=(byte)(a+b);
        System.out.println("\n"+c);
        char chr='a';
        char cha='b';
        int q=chr+cha;
        System.out.println("\n"+q);
        System.out.println(10.0/0);
        System.out.println(0.0/0);
        m();

    }

    public static void m() throws RuntimeException{
        try {
//            int score=1;
//            System.out.print('A');
            throw new RuntimeException("Out of bounds");
        }catch (RuntimeException e){
            System.out.print('B');
//            throw new ArrayIndexOutOfBoundsException();
        }finally {
            System.out.print('C');
        }
    }
}

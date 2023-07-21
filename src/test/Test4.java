package test;

import java.util.Objects;

public class Test4 {
    String name;
    int rollno;

    public Test4(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test4)) return false;
        Test4 test4 = (Test4) o;
        return rollno == test4.rollno && Objects.equals(name, test4.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, rollno);
    }

    public static void main(String... args){
        char[] name ={'a','b','c','d','e','f'};
        String person="Sunlola";
        char[] name1=new char[person.length()];
        String str=new String(name);
        String s =new String("durga");
        String s1=new String("DURGA");
        String t= s.concat(" software");
        String t1=s.concat("software");
        System.out.println(s);
        System.out.println(t);
        System.out.println(t1);
        person.getChars(3,7,name1,0);
        System.out.println(name1);


        //Find a primitive value of the wrapper object
        Integer I =new Integer(130);
        System.out.println(I.byteValue());
        System.out.println(I.intValue());
        System.out.println(I.longValue());
        System.out.println(I.floatValue());
        System.out.println(I.doubleValue());
        Double D=new Double(10000);
        System.out.println(D.byteValue());
        System.out.println(D.intValue());
        System.out.println(D.longValue());
        System.out.println(D.floatValue());
        System.out.println(D.doubleValue());


        for (int i=name.length-1;i>=0;i--){
            System.out.print(name[i]+" ");
        }
        System.out.println("");

        for (int j= str.length()-1;j>=0;j--){
            System.out.print(str.charAt(j)+" ");
        }
        System.out.println(" ");
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,3));//substring(1, 3-1)
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(t.trim().equals(t1));// false.
        System.out.println(s.toCharArray());
        System.out.println(t.contentEquals(t1));
        System.out.println(s.getClass());
        System.out.println(t.getClass().getName());
        System.out.println(t1.compareTo(t));
        System.out.println(str.copyValueOf(name));

        Boolean x=new Boolean("yes");//false
        Boolean y=new Boolean("no");//false
        System.out.println(x.equals(y));

        Character ch=new Character('a');
        System.out.println(ch.charValue());

        String s2=Integer.toHexString(15);
        System.out.println(s2);
        String s3=Integer.toOctalString(15);
        System.out.println(s3);
        String s4=Integer.toBinaryString(15);
        System.out.println(s4);

    }
}

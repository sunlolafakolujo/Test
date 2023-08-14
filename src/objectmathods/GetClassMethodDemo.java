package objectmathods;

import java.lang.reflect.Method;

public class GetClassMethodDemo {
    public static void main(String[] args) {
        String o = new String();
        Class c = o.getClass();
        System.out.print(o.getClass().getName());
        System.out.println();
        Method[] methods = c.getDeclaredMethods();
        System.out.println("String class method");
        for (int i = 0; i < methods.length; i++) {
            System.out.println(i + " " + methods[i].getName() + " ");
        }

        Object ob = new Object();

        System.out.println(ob.getClass().getDeclaredMethods().length);
        System.out.println();
        Method[] methods1 = ob.getClass().getDeclaredMethods();

        for (Method m : methods1) {
            System.out.println(m.getName());
        }
    }
}

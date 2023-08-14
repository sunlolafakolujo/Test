package innerclass.methodlocalinnerclass;

public class MethodLocalClassDemo {
    public static void message(){
         class MethodClass{
            public void innerClassMethod(){
                System.out.println("Inner Class Method");
            }
        }
        MethodClass m=new MethodClass();
        m.innerClassMethod();
    }

    public static void main(String[] args) {
//        MethodLocalClassDemo m=new MethodLocalClassDemo();
        message();
    }
}

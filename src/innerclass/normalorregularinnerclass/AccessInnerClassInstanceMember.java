package innerclass.normalorregularinnerclass;

public class AccessInnerClassInstanceMember {
    private class Inner{
        String innerClassName;
        public void sum(int a, int b){
            System.out.println(a + b);;
            System.out.println(innerClassName);
        }
    }
    public void result(int a, int b){
        Inner inner=new Inner();
        inner.innerClassName="inner";
        inner.sum(a,b);

    }

    public static void main(String[] args) {
        AccessInnerClassInstanceMember outerClass=new AccessInnerClassInstanceMember();
        outerClass.result(3,6);
    }
}

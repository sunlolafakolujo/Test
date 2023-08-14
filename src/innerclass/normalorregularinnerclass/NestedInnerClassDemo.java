package innerclass.normalorregularinnerclass;

public class NestedInnerClassDemo {
    public class NestedInnerClass{
        private String c;
        public void setC(String c){
            this.c = c;
        }
        public String getC(){
            return this.c;
        }
        public class InnerInnerClass{
            private int rollNumber;
            public void setRollNumber(int rollNumber){
                this.rollNumber = rollNumber;
            }
            public int getRollNumber(){
                return this.rollNumber;
            }
        }
    }

    public static void main(String[] args) {
        NestedInnerClassDemo n=new NestedInnerClassDemo();
        NestedInnerClassDemo.NestedInnerClass i=n.new NestedInnerClass();
        i.setC("Sunlola");
        System.out.print("May name is: "+i.getC()+" ");

        NestedInnerClassDemo.NestedInnerClass.InnerInnerClass in=n.new NestedInnerClass().new InnerInnerClass();
        in.setRollNumber(101);
        System.out.print("and my roll number is: "+in.getRollNumber());
    }
}

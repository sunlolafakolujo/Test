package innerclass.methodlocalinnerclass;

public class MethodLocalClassDemo2 {
    private static String schoolName;
    String schoolAddress;

    public static void schoolDetail(){
         class InnerMethodClass{
            public void displayDetail(){
                System.out.println(schoolName);
            }
        }

        InnerMethodClass innerMethodClass=new InnerMethodClass();
         innerMethodClass.displayDetail();
    }

    public void detailOfSchool(){
        class  InnerInstanceMethodClass{
            public void displaySchoolDetails(){
                System.out.print("School name: "+schoolName+", "+"School Address: "+schoolAddress);
            }
        }
        InnerInstanceMethodClass innerInstanceMethodClass=new InnerInstanceMethodClass();
        innerInstanceMethodClass.displaySchoolDetails();
    }
    public static void main(String[] args) {
        MethodLocalClassDemo2 m=new MethodLocalClassDemo2();
        System.out.print("School name: ");
        schoolName="Mind Builder Schools";
        schoolDetail();
        System.out.print("School address: ");
        System.out.print(m.schoolAddress="Jobi Fele Road Alahusa lagos");
        System.out.println();
        schoolName="Babington Junior Seminary School";
        MethodLocalClassDemo2 m2=new MethodLocalClassDemo2();
        m2.schoolAddress="Ikorodun";
        m2.detailOfSchool();
    }
}

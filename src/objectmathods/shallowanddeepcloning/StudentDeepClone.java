package objectmathods.shallowanddeepcloning;

public class StudentDeepClone implements Cloneable{
    String studentId;
    String studentName;
    Address address=new Address();

    public StudentDeepClone() {
    }

    public StudentDeepClone(String studentId, String studentName, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        StudentDeepClone studentDeepClone=(StudentDeepClone)super.clone();
//        Address address=(Address)super.clone();
        studentDeepClone.address = address;
        studentDeepClone.address.streetNumber=address.streetNumber;
        studentDeepClone.address.streetName=address.streetName;
        studentDeepClone.address.city=address.city;
        return studentDeepClone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        StudentDeepClone student=new StudentDeepClone();
        student.studentId="123";
        student.studentName="Gbenga Ariyibi";
        student.address.streetNumber="101";
        student.address.streetName="Akoka Road";
        student.address.city="Yaba";

        StudentDeepClone student1=(StudentDeepClone) student.clone();
//        student1.studentId="Student101";
//        student1.studentName="Stanley Asiwe";
        student1.address.streetNumber="10";
        student1.address.streetName="Bank Antony Road, Alagomeji";
        student1.address.city="Yaba";

        System.out.println("id: " + student.studentId+", "+"name: "+student.studentName+", "+"address: "+student.address);
        System.out.println(student.hashCode());
        System.out.println();
        System.out.println("id: " + student1.studentId+", "+"name: "+student1.studentName+", "+"address: "+student1.address);
        System.out.println(student1.hashCode());
    }
}

package objectmathods.shallowanddeepcloning;

public class StudentShallowClone implements Cloneable{
    String studentId;
    String studentName;
    Address address=new Address();

    public StudentShallowClone() {
    }

    public StudentShallowClone(String studentId, String studentName, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "StudentShallowClone{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        StudentShallowClone student=new StudentShallowClone();

//        Address address=new Address("10A","Orelope Street","Agege");
        student.studentId="101";
        student.studentName="Akeju Oluwatosin";
        student.address.streetNumber="10A";
        student.address.streetName="Orelope Street";
        student.address.city="Agege";

        StudentShallowClone student2 = (StudentShallowClone)student.clone();
        student2.studentName="Akeju Olwatosin Michael";
        student2.address.streetNumber="20";
        student2.address.streetName="Fagba Road";
        student2.address.city="Fagba";

        System.out.println("id: " + student.studentId+", "+"name: "+student.studentName+", "+"address: "+student.address);
        System.out.println();
        System.out.println("id: " + student2.studentId+", "+"name: "+student2.studentName+", "+"address: "+student2.address);
    }
}

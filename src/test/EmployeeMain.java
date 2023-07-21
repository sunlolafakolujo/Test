package test;

public class EmployeeMain extends Employee{

    public EmployeeMain(int x){
        super();
        System.out.println(x);
    }

    public void employeeMainMessage(){
        super.message();
        System.out.println("Hello Employee Main");
    }
    public static void main(String[] args){
        EmployeeMain test = new EmployeeMain(4);
        EmployeeMain test2 = new EmployeeMain(6);

        test.employeeMainMessage();
    }

    public String convert(int value){
//        return value.toString;
        return String.valueOf(value);

    }

}

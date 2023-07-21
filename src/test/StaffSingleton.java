package test;

public class StaffSingleton {
    private static StaffSingleton staffSingleton;
    private String message;
    {
        message="Singleton class";
    }
    static {
        staffSingleton=new StaffSingleton();
    }
    private StaffSingleton() {

    }

    public static StaffSingleton getSingleton(){
        return staffSingleton;
    }

    public static void main(String[] args){
        StaffSingleton s=StaffSingleton.getSingleton();
        System.out.println(s.hashCode());

        System.out.println(s.message);
    }

}

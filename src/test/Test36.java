package test;

public class Test36 {
    static int teeth;
    double scaleToughness;
    public Test36(){
        teeth++;
    }
    public void snap(int teeth){
        System.out.print(teeth);
        teeth--;
    }
    public static void main(String[] args) {
        new Test36().snap(teeth);
        System.out.print(" ");
        new Test36().snap(teeth);
    }

    @Override
    public String toString() {
        return ""+teeth;
    }
}

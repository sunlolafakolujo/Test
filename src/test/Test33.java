package test;

public class Test33 {
    public static void main(String[] args) {
        final Test33 test33 = new Test33();
        System.out.println(test33.runTest(false,true));
    }

    public String runTest(boolean spanner, boolean roller) {
        if (spanner = roller) return "up";
        else return roller? "down" : "middle";
    }
}

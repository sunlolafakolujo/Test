package classfile;

public class GarbageCollector {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        GarbageCollector gc=new GarbageCollector();
        gc=null;
        GarbageCollector gc2=new GarbageCollector();
        gc2=null;
        System.gc();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        System.out.println("End of main");
    }
    public void finalize(){
        System.out.println("finalize");
    }
}

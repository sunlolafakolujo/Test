package test;

public class Test9 {
    public static void main(String[] args) {
        int p = 6;
        long l = 3;
        if (p % 3 >= 1)
            l++;
            l--;
        System.out.println(l);

//        int k=1;
//        k=k+++k--;
//        if (k==1){
//            System.out.println("Plan A");
//        }else {
//            if (k==2){
//                System.out.println("Plan B");
//            }
//        }else System.out.println("Plan C");

        String c="Hello am I practicing Java";

        if (c.startsWith("H")){
            c=c.trim();
            c=c.replace("am", "was");
            c=c.substring(3,5);
            System.out.println(c);
            byte[] b=c.getBytes();
            for (int i=0; i<b.length; i++){
                System.out.println(b[i]);
            }
        }
    }
}

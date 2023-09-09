package test;

public class Test32 {
    public static void main(String[] args) {
        long plan = 15;
//        plan=plan++ + --plan;
//        System.out.println(plan);
//        if (plan==1){
//            System.out.println("planA");
//        }else {
//            if (plan==2)
//                System.out.println("planB");
//            else System.out.println("planC");
//        }

        if (plan >= 15 && plan < 37) {
            System.out.println("Not enough");
        }
        if (plan == 37) {
            System.out.println("just right");
        } else {
            System.out.println("too many");
        }
    }
}

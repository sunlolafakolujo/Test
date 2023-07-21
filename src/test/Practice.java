package test;

public class Practice {
   public static strictfp synchronized void main(String[] args){
        int[] a=new int['a'];
        float[] c=new float[6];
        c[0]=2.0f;
        a[0]=1;
        String[] b=new String[10];
        System.out.println(a.getClass().getName());
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(a.toString());
        System.out.println(a[2]);
        System.out.println(c.getClass().getName());
        System.out.println(c[0]);
        System.out.println(b);

        int arr[][]={{11,22,33},{34,41,67}};

        for (int i =0; i<2; i++){
             for (int j =0; j<3; j++){
               System.out.print(arr[i][j]+" ");
             }
             System.out.println("");
        }
        int[][] num=new int[2][3];
        System.out.println(num.length);//size of 2 dimensional is determined by base size:2
        System.out.println(num[1].length);
        System.out.println(num);//[[I@7cca494b
        System.out.println(num[0]);//[I@7ba4f24f
        System.out.println(num[1]);//[I@3b9a45b3

        int[][] num2=new int[2][];
        System.out.println(num2);//[[I@7699a589
        System.out.println(num2[0]);//null
        System.out.println(num2[1]);//null

//        int arr2[][][]={{{11,22,33},{34,41,67}},{{238,7},{5,7,9}}};
//
//        for (int i =0; i<3; i++){
//             for (int j =0; j<2; j++){
//                  System.out.print(arr2[i][j]+" ");
//             }
//             System.out.println("");
//        }

        int arr1[][][]={{{11,22,33},{34,41,67}},{{238,7},{5,7,9}}};

        for (int i[][]:arr1){
             for (int j[]:i){
                  for (int k: j){
                       System.out.print(k+" ");
                  }
             }
             System.out.println("");
        }

        int[] k={1,2,3,4};
        int[] v={5,6};
        v=k;
        for (int i=0;i<v.length;i++) {
             System.out.print(k[i]+" ");
        }
        System.out.println();
        for (int i:v) {
          System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum of integers: "+sum(10,20,40,70,778));
        System.out.println("Sum of doubles: "+sum(new int[]{20,60,100}));
        System.out.println("Total: "+total(new int[][]{{20,60,100},{6,8,10}}));
//        Practice.main(4,5);
   }

   public static int sum(int... x){
        int total=0;
        for (int i:x){
             total+=i;
        }
        for (int i:x){
             System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(x.length);
        return total;
   }

   public static int total(int[]... x){
        int sum=0;
        for (int[] i:x){
             for (int j:i){
                  sum+=j;
             }
        }
        return sum;
   }
//   public static void main(int[] args){
//        System.out.println("int[] args main method");
//   }
}

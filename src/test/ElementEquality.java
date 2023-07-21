package test;

public class ElementEquality {
    public static void main(String[] args) {
        checkElementsEquality();
    }
    public static void checkElementsEquality(){
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={1,2,3,4,5,6,8,19,160};

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i]==b[j]){
                    System.out.println("Elements are the same: "+"a: "+a[i]+" == "+"b: "+b[j]);
                }
            }
        }
    }
}

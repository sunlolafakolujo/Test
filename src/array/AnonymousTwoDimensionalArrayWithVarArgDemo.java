package array;

public class AnonymousTwoDimensionalArrayWithVarArgDemo {
    public static void main(String[] args) {
        addition(new int[][]{{1,2,3,4},{24,23,80,90}});
    }

    public static void addition(int[]... array) {
        int total=0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                total+=array[i][j];
            }
        }
        System.out.println(total);

    }
}

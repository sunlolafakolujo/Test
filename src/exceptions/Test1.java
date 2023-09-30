package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        new Test1().performBackup();
    }

    public void performBackup(){
        try {
            throw new IOException("");
        }catch (Exception e) {
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException t){
                System.out.println();
            }
        }
    }
}

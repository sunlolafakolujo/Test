package exceptions;

import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("circuit");
        }finally {
            System.out.println("Flipped");
        }
    }
}

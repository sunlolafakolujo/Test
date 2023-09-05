package test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test18 {
    public void openDrawBridge() throws Exception {
        throw new RuntimeException("Error");
    }

    public static void main(String[] args) throws Exception {
       try {
           new Test18().openDrawBridge();
           System.out.println("Ping");
       }catch (NullPointerException e) {
           e.printStackTrace();
       }
//       catch (Exception e) {
//           System.out.println("Pong");
//           throw e;
//       }
       finally {
           throw new Exception("own goal");
       }

    }
}

class CastleUnderSiegeException extends Exception {

}

class KnightAttackingException extends CastleUnderSiegeException {
}

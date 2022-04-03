package cryptography;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCryptography {

    @Test
    public static void testCaeserCypher(){
        CaesarCypher test = new CaesarCypher(3);
        System.out.println("Encryption Code = " + new String(test.encoder));
        System.out.println("Encryption Code = " + new String(test.decoder));
        String message = "THE BRITISH ARE COMING";

    }
}

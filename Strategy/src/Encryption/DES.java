package Encryption;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DES {

    private static final String DES_ALGORITHM = "DES";
    private static final String SECRET_KEY = "mysecret"; // Chave secreta de 8 caracteres

    public static void main(String[] args) {
        String plainText = "Hello, World!";
        String encryptedText = encrypt(plainText);
        System.out.println("Encrypted Text: " + encryptedText);
    }

    public static String encrypt(String plainText) {
        try {
            DESKeySpec desKeySpec = new DESKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES_ALGORITHM);
            SecretKey secretKey = keyFactory.generateSecret(desKeySpec);

            Cipher cipher = Cipher.getInstance(DES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

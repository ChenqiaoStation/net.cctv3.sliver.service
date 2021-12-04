package net.cctv3.sliver.xUtils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Security;

// http://www.toocruel.net/aes-ecb/
public class AESUtils {
    private static final String EncryptAlg = "AES";
    private static final String Cipher_Mode = "AES/ECB/PKCS7Padding";
    private static final String Encode = "UTF-8";
    private static final String PASSWORD = "@react-native-jj";

    public static String encrypt(String content) {
        String result = "";
        try {
            Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
            byte[] raw = PASSWORD.getBytes(Encode);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, EncryptAlg);
            // 算法/模式/补码方式
            Cipher cipher = Cipher.getInstance(Cipher_Mode);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] data = cipher.doFinal(content.getBytes(Encode));
            result = Base64.encodeBase64String(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String decrypt(String content) {
        String result = "";
        try {
            byte[] raw = PASSWORD.getBytes(Encode);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, EncryptAlg);
            Cipher cipher = Cipher.getInstance(Cipher_Mode);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] encrypted1 = new Base64().decode(content);
            byte[] original = cipher.doFinal(encrypted1);
            result = new String(original, Encode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
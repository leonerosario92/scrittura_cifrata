package com.cgmconsulting.jsonserver.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;

public class EncryptionUtils {

	private static Cipher ecipher;
    private static Cipher dcipher;
	private static  SecretKey ENCRYPTION_KEY;
    public static void init() throws FileNotFoundException, IOException {
         try {
        	byte[] byteArray = IOUtils.toByteArray(
        			new FileInputStream(
							new ClassPathResource("encryptionKey").getFile()));
     		ENCRYPTION_KEY = new SecretKeySpec(byteArray, "DES");
        	ecipher = Cipher.getInstance("DES");
        	ecipher.init(Cipher.ENCRYPT_MODE, ENCRYPTION_KEY);
			dcipher = Cipher.getInstance("DES");
			dcipher.init(Cipher.DECRYPT_MODE, ENCRYPTION_KEY);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException  | InvalidKeyException e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());		
		}
    }
	
	private EncryptionUtils() {}
	
	public static byte[] encrypt(String stringToEncrypt) {
		try {
			byte[] utf8 = stringToEncrypt.getBytes("UTF8");
			byte[] enc = ecipher.doFinal(utf8);
			return enc;
		}
	  	catch (Exception e) {
			    e.printStackTrace();
		}
		return null;
    }	
	
	
	public static String decrypt(byte[] valueToDecrypt) {
		try {
			byte[] utf8 = dcipher.doFinal(valueToDecrypt);
			return new String(utf8, "UTF8");
		}
  		catch (Exception e) {
		    e.printStackTrace();
		}
		return null;
	}

}

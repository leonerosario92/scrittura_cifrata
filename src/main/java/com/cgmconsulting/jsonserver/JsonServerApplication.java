package com.cgmconsulting.jsonserver;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cgmconsulting.jsonserver.utils.EncryptionUtils;

@SpringBootApplication
public class JsonServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JsonServerApplication.class, args);
	}
	
	@PostConstruct
	void init() throws IOException {
		EncryptionUtils.init();
//		SecretKey encryptionKey = EncryptionUtils.getEncryptionKey();
//		byte[] encoded = encryptionKey.getEncoded();
//		File encryptionKeyFile = new File("C:\\Users\\CGM Consulting\\Desktop\\encryptionKey");
//		encryptionKeyFile.createNewFile();
//		FileUtils.writeByteArrayToFile(encryptionKeyFile, encoded);
//		
//		

	}



}

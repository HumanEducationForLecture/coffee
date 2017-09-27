package com.human.util;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
/**
 * 
 * @author kwongiho
 *
 */
public class RSA {
	private Key publicKey;
	private Key privateKey;
	private String key;
	private KeyPair keyPair;
	private Cipher cipher ; 
	private RSAPublicKeySpec publicKeySpec;
	private RSAPrivateKeySpec privateKeySpec;
	private KeyFactory keyFactory ;
	
	private static RSA instance ;
	static {
		try {
			instance = new RSA();
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
	}
	public static RSA getInstance() {
		return instance;
	}
	//String logger = "public key modulus(" + clsPublicKeySpec.getModulus() + ") exponent("+ clsPublicKeySpec.getPublicExponent() + ")"
	//String logger = "private key modulus(" + clsPrivateKeySpec.getModulus() + ") exponent("+ clsPrivateKeySpec.getPrivateExponent() + ")"
	private RSA() throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException{
		// RSA 공개키/개인키를 생성한다.
		KeyPairGenerator clsKeyPairGenerator = KeyPairGenerator.getInstance("RSA");
		clsKeyPairGenerator.initialize(2048);
		keyPair = clsKeyPairGenerator.genKeyPair();
		cipher = Cipher.getInstance("RSA");
		
		this.publicKey = keyPair.getPublic();
		this.privateKey = keyPair.getPrivate();
		
		keyFactory = KeyFactory.getInstance("RSA");
		publicKeySpec = keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);
		privateKeySpec = keyFactory.getKeySpec(privateKey, RSAPrivateKeySpec.class);
	}
	public void resetKey() {
		this.publicKey = keyPair.getPublic();
		this.privateKey = keyPair.getPrivate();
	}
	
	public String encrypt(String plainStream ) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		this.key = key;
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] encryptByte = cipher.doFinal(plainStream.getBytes());
		return new String(encryptByte);
		
	}
	public String decrypt(String encryptStream ) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] decryptByte = cipher.doFinal(encryptStream.getBytes());
		return new String(decryptByte);
	}

	public static void main(String[] args) {
		try {
			RSA rsa = RSA.getInstance();
			String encrypt = rsa.encrypt("Hello");
			System.out.println("암호화 : "+encrypt);
			String decrypt = rsa.decrypt(encrypt);
			System.out.println("복호화 : "+decrypt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

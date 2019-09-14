package Encryption;

public class Encmain {

	public static void main(String[] args) {
		String s1,s2;
		int s3;
		s1="enc.txt";
		s2="encrypted.txt";
		s3=3;
		
		
		FileEncryption se = new FileEncryption();
		se.encrypt(s1, s2, s3);
		
		System.out.println("Display Encrypted Words : ");
		se.viewFileContent(s2);

	}

}

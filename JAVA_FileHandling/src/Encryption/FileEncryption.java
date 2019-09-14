package Encryption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryption {

	public void encrypt(String source ,String dest, int shift) {
		BufferedReader reader;
		BufferedWriter writer;
		
		try {
			reader = new BufferedReader(new FileReader(source));
			writer = new BufferedWriter(new FileWriter(dest));
			int data;
			String line = reader.readLine();
			while(line!=null) {
				for(int i=0;i<line.length();i++) {
					//if(line.charAt(i))
					data = (int) line.charAt(i) + shift;
					writer.write(data);
				}
				writer.write((int)'\n');
				line = reader.readLine();
			}
			reader.close();
			writer.close();
			
		}catch(Exception e) {
			
		}
		
	}
	
	
	public void viewFileContent(String source) {
	BufferedReader reader;
	try {
		reader = new BufferedReader(new FileReader(source));
		String line;
		
		while((line=reader.readLine())!=null) {
			System.out.print(line);
			int count = 0;
			for(int i=0;i<line.length();i++) {
			  if(line.charAt(i)=='a'|| line.charAt(i)=='e'|| line.charAt(i)=='i'|| line.charAt(i)=='o'||line.charAt(i)=='u'||
					  line.charAt(i)=='A'|| line.charAt(i)=='E'|| line.charAt(i)=='I'|| line.charAt(i)=='O'|| line.charAt(i)=='U') {
				  count ++;
			  }
				  
			}
			System.out.println(" "+count);
		}
		reader.close();
	}catch(IOException e) {
		
	}
		
	}
	
	
}

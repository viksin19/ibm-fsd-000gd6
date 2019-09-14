package Charhandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Chario {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("inputFile.txt");
		FileWriter out = new FileWriter("char.txt");
		int  c;
		while((c = in.read())!=-1 ){
			char ch = (char)c;
			System.out.println(ch);
			out.write(ch);
		}
		
		in.close();
		out.close();

	}

}

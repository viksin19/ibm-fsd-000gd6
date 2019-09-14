package Charhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader in = new FileReader("inputFile.txt");
		FileWriter out = new FileWriter("line.txt");
		
		BufferedReader inputStream = new BufferedReader(in);
		PrintWriter  outputStream = new PrintWriter(out);
		
		String l;
		while(( l = inputStream.readLine())!=null) {
			System.out.println(l);
			outputStream.println(l);
		}
	}

}

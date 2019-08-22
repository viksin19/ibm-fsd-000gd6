package FIRSTHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileiostream {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("inputFile.txt");
		FileOutputStream out = new FileOutputStream("outputFile.txt");
		int c;
		while((c = in.read())!= -1) {
			System.out.println(c);
			try {
				out.write(c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		in.close();
		out.close();
		

	}

}

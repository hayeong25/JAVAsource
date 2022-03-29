package io;

import java.io.*;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		
		try(Reader in = new FileReader("c:\\temp\\file1.txt"); // InputStreamReader in = new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"));
				BufferedReader br = new BufferedReader(in);
				Writer out = new FileWriter("c:\\temp\\output2.txt");
				BufferedWriter bw = new BufferedWriter(out)) {
			
			String str = null;
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine(); // Enter
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
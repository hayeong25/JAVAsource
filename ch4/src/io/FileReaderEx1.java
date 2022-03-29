package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx1 {
	public static void main(String[] args) {
		
		try(Reader reader = new FileReader("c:\\temp\\file2.txt")) { // AutoClosing
			int ch;
			while((ch = reader.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}
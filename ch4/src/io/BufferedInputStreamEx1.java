package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
	입력 스프림 >> 보조 입력 스프림 >> 프로그램 >> 보조 출력 스프림 >> 출력 스프림
	원래는 InputStream에 Input 하고 OutputStream으로 Output
	Buffer에 Input 하고 Buffer로 Output
	
	// 입력 스트림
	InputStream in = new FileInputStream("c:\\temp\\file1.txt");
	
	// 보조 입력 스프림
	BufferedInputStream bis = new BufferedInputStream(in);
	
	// 출력 스트림
	OutputStream out = new FileOutputStream("c:\\temp\\file2.txt");
	
	// 보조 출력 스프림
	BufferedOutputStream bos = new BufferedOutputStream(out);
*/

public class BufferedInputStreamEx1 {
	public static void main(String[] args) {
		
		try(InputStream in = new FileInputStream("c:\\temp\\file1.txt");
				BufferedInputStream bis = new BufferedInputStream(in);
				OutputStream out = new FileOutputStream("c:\\temp\\file2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(out);) {
			
			// 프로그램
			byte b[] = new byte[1024];
			while(bis.read(b) != -1) {
				bos.write(b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}
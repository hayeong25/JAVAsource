package io;

import java.io.*;

public class InputStreamEx2 {
	public static void main(String[] args) {
		
		InputStream in = System.in;
		
		int input = 0;
		
		try {
			while((input = in.read()) != -1) { // 읽어오는 스트림의 마지막 -1
				System.out.print((int)input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
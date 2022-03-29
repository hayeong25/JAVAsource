package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
	try with resource
	- InputStream이나 File 등에서 자원 자동 해제(close)할 때
	
	try(resource1; resource2) {
	
	} catch {
	
	}
*/

public class InputStreamEx4 {
	public static void main(String[] args) {
		
		byte arr[] = new byte[100];
		
		// 자원 자동 해제
		try(InputStream in = System.in; OutputStream out = System.out;) {
			// read(byte[] b)
			while(in.read(arr) != -1) {
				out.write(arr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
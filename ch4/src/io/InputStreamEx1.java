package io;

import java.io.IOException;
import java.io.InputStream;

// 키보드에서 입력 받아오기

public class InputStreamEx1 {
	public static void main(String[] args) {
		
		InputStream in = System.in; // Scanner scanner = new Scanner(System.in);
		
		try {
			int input = in.read(); // read() : 1byte만 읽어오는 기능
			System.out.println((char)input);
			// int - abc 입력 시 a만 읽어와서 ASCII CODE 값인 97 return
			// char - 가나다 입력 시 ê return (한글은 한 글자가 1byte 초과하기 때문에 깨진다)
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // finally : 자원 해제
			// Stream 통로 닫기
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
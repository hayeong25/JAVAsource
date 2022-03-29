package exception;

import java.io.*;

// FileNotFoundException

/*
	<try 단독 사용 불가>
	try {
		
	}
	
	<try ~ catch>
	try {
	
	} catch ( ) {
	
	}
	
	<try ~ finally>
	try {
	
	} finally {
	
	}
	
	<try ~ catch ~ finally>
	try {
	
	} catch ( ) {
		
	} finally {
	
	}
*/

public class FileInputEx {
	public static void main(String[] args) {
				
//		FileInputStream fis = null;
//		
//		try {
//			fis = new FileInputStream("file.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally { // 자원 해제
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		// 자동 리소스 닫기 (자바 7 버전 이상)
		// finally로 자원 해제 할 필요 X
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			
		} catch (Exception e) {
			
		}
		
	}
}
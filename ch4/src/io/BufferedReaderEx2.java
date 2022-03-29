package io;

import java.io.*;

/* 
	자바 파일을 읽어서 화면에 출력
	출력문 앞에 번호를 붙여서 화면에 보여주기
 */

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("src\\io\\PerformanceEx2.java");
			BufferedReader br = new BufferedReader(fr)) {
			
			File temp = new File("C:\\Users\\hayeo\\JAVAsource");
			File[] files = temp.listFiles();

			for(File file : files) {
				if(file.isDirectory()) {
					System.out.print("\t<DIR>\t\t\t" + file.getName());
				}else {
					System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

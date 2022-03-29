package io;

import java.io.FileWriter;
import java.io.Writer;

// JAVA로 파일에 입력하기

public class FileWriterEx1 {
	public static void main(String[] args) {
		
		// FileWriter(파일명) : write() 할 때마다 내용 다 지우고 새로 생성
		// FileWriter(파일명, true) : append true 라는 의미로, 뒤에 덧붙이는 개념
		try(Writer writer = new FileWriter("c:\\temp\\file1.txt", true)) {
			writer.write("FileWriter는 한글로 된\n"); // 타자기에서는 \n이 아닌 \r\n (한 줄 올리고 커서를 맨 앞으로 이동)
			writer.write("문자열을 출력할 수 있다.\n");
			writer.write("Writer 클래스는 문자 단위의\n");
			writer.write("출력만 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
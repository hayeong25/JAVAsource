package io;

import java.io.*;
import java.util.Scanner;

// Scanner로 입력받은 데이터를 파일로 작성하기

public class FileWriterEx2 {
	public static void main(String[] args) {
		
		// output1 파일 생성
		File file = new File("c:\\temp\\output1.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(Scanner scanner = new Scanner(System.in); Writer writer = new FileWriter(file)) {
			System.out.println("입력하세요. (q를 입력하면 프로그램이 종료됩니다)");
			String input = "";
			while(!(input = scanner.nextLine()).equals("q")) {
				writer.write(input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
}
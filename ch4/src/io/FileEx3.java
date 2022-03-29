package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Java로 폴더에 파일 만들기

public class FileEx3 {
	public static void main(String[] args) {
		
		// File 객체 생성
		File temp = new File("c:\\temp");
		File dir = new File("c:\\temp\\dir");
		File file1 = new File("c:\\temp\\file1.txt");
		File file2 = new File("c:\\temp\\file2.txt");
		File file3 = new File(temp, "file3.txt");
		File file4 = new File(dir, "file4.txt");
		
		// Directory 생성
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("디렉토리가 생성되었습니다.");
		}
		
		// file 생성
		try {
			if(!file1.exists()) {
				file1.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			}
			if(!file2.exists()) {
				file2.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			}
			if(!file3.exists()) {
				file3.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			}
			if(!file4.exists()) {
				file4.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		System.out.println("\t날짜\t시간\t형태\t\t크기\t이름");
		System.out.println("==========================================");
		
		// file 읽어오기
		File[] files = temp.listFiles();
		for(File file : files) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			}else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
		
	}
}
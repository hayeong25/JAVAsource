package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		
		// File(pathName)
		File f1 = new File("c:\\temp\\test1.txt");
		
		// File(String parent, String child)
		File f2 = new File("c:\\temp", "test1.txt");
		
		// File(File parent, String child)
		File dir = new File("c:\\temp");
		File f3 = new File(dir, "test1.txt");
		
		// 파일명 확인하기
		String fileName = f1.getName();
		System.out.println("경로를 제외한 파일명 : " + fileName);
		
		// 경로를 포함한 파일명
		System.out.println("경로를 포함한 파일명 : " + f1.getPath());
		System.out.println("파일 절대경로 : " + f1.getAbsolutePath());
		System.out.println("파일 정규경로 : " + f1.getCanonicalPath());
		System.out.println("파일 디렉토리 경로 : " + f1.getParent());
		
		// 확장자를 제외한 파일명
		int position = fileName.lastIndexOf("."); // 제일 마지막의 . 인덱스 return
		System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, position)); // 파일명 처음부터 . 전까지 return
		
		// 확장자 확인하기
		System.out.println("확장자 : " + fileName.substring(position + 1));
		
		System.out.println("File.pathSeparator : " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
		System.out.println("File.separator : " + File.separator);
		System.out.println("File.separatorChar : " + File.separatorChar);
		
	}
}
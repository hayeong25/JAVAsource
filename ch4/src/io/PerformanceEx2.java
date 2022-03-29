package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PerformanceEx2 {
	public static void main(String[] args) {
		
		// FileInputStream만 사용하면
		try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4")) {
			
			long start = System.currentTimeMillis();
			while(fis.read() != -1) {
				
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream만 사용하면 " + (end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileInputStream + BufferedInputStream 사용하면
		try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			
			long start = System.currentTimeMillis();
			while(bis.read() != -1) {
				
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream 사용하면 " + (end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileInputStream + BufferedInputStream 사용 시 + byte 배열
		try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			
			byte data[] = new byte[4096];
			
			long start = System.currentTimeMillis();
			while(bis.read(data) != -1) {
				
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream 사용 시 + byte 배열 " + (end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileInputStream + BufferedInputStream + FileOutputStream + BufferedOutputStream 사용하면
		try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\hold_copy.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data;
			
			long start = System.currentTimeMillis();
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream + FileOutputStream + BufferedOutputStream 사용하면 " + (end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileInputStream + BufferedInputStream + FileOutputStream + BufferedOutputStream 사용 시 + byte 배열
		try(FileInputStream fis = new FileInputStream("c:\\temp\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\hold_copy.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			byte data[] = new byte[4096];
			
			long start = System.currentTimeMillis();
			while(bis.read(data) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream + FileOutputStream + BufferedOutputStream 사용 시 + byte 배열 " + (end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
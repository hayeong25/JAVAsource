package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
	객체 전송
	- 직렬화(Serialization)
*/

public class PersonEx {
	public static void main(String[] args) {
		
		Person personChan = new Person("찬료리", "엉아");
		Person personGom = new Person("곰탱이", "셰프");
		
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personChan);
			oos.writeObject(personGom);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 역직렬화
		try (FileInputStream fis = new FileInputStream("c:\\temp\\serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis)){	
			
			for(int i = 0; i < 2; i++) {
				Person p = (Person)ois.readObject();
				System.out.println(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

package interfacetest;

// interface도 다형성 가능

public class AppInfoEx {
	public static void main(String[] args) {
		
		// SeparateVolume obj1 = new SeparateVolume("863ㄱ774", "개미", "베르나르 베르베르");
		Lendable obj1 = new SeparateVolume("863ㄱ774", "개미", "베르나르 베르베르"); // 다형성
		obj1.checkOut("찬료리", "2022-03-11");
		
		AppCD obj2 = new AppCD("2022-01", "Oracle");
		obj2.checkOut("곰탱이", "2020-09-17");
		
	}
}
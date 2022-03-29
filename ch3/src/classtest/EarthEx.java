package classtest;

import java.util.Scanner;
// import : 다른 패키지에 있는 클래스를 사용할 때 필요
// java.lang : 자바에서 제공하는 패키지로, import 구문 없이 사용 가능 ex) Scanner는 import 필요하지만 Math.random()은 import 안 하고 사용
// java.util : 패키지명
// Scanner : 클래스명

public class EarthEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");
		
		scanner.close();
	}
}
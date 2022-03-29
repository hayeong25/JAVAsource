package operation;

import java.util.Scanner;

// Scanner를 이용해 화씨온도를 입력받아 섭씨온도로 변환하기

// format 지정 : %f(실수형), %d(정수형), %c(문자), %s(문자열)

public class Degrees {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("온도를 입력해주세요 : ");
		int degree = scanner.nextInt();
		
		System.out.println(degree + "도는 섭씨 " + ((degree - 32) * 5 / 9.0) + "도입니다."); // 5 / 9는 몫이 0이기 떄문에 double 타입에 9.0으로 나누어주어야 한다
		System.out.printf("%d도는 섭씨 %.3f도입니다.\n", degree, ((degree - 32) * 5 / 9.0)); // %.3f = 소수점 3자리까지 출력
		
		scanner.close();
	}
}
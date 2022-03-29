package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx8 {
	public static void main(String[] args) {
		
		// Scanner로 5개의 실수값을 사용자로부터 받아서 ArrayList에 저장한 후 검색해 가장 큰 수 출력
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>(5);
		
		System.out.print("실수를 5개 입력하세요 : ");
		
		String number = scanner.nextLine();
		StringTokenizer token = new StringTokenizer(number);
		
		
		while(token.hasMoreTokens()) {
			list.add(Double.parseDouble(token.nextToken()));
		}
		
		System.out.println(list + " 중 가장 큰 수는 " + Collections.max(list) + "입니다.");
		
		scanner.close();
		
	}
}

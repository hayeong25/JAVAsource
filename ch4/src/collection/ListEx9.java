package collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

// 한 아이의 키를 2015년 ~ 2021년 1년 단위로 입력받아 ArrayList에 저장해 가장 키가 많이 자란 연도 출력

public class ListEx9 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("2015년 ~ 2021년까지 1년마다의 키를 입력하세요 : ");
		String height = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(height);
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int max = 0;
		int year = 0;
		
		for(int i = 0; i < list.size()-1; i++) {
			if(max < (list.get(i+1) - list.get(i))) {
				max = (list.get(i+1) - list.get(i));
				year = i + 1;
			}
		}
		
		System.out.println(list + " 중 가장 키가 많이 자란 연도는 " + (2015 + year) + "년 " + max + "cm");
		
	}
}
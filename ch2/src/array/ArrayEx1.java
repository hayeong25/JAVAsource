package array;

// 배열 : 같은 타입을 연속적으로 저장 > heap 공간에 저장(new 키워드 사용)
//       기본값으로 초기화 해줌(정수는 0, 실수는 0.0, boolean은 false) 

public class ArrayEx1 {
	public static void main(String[] args) {
		
		// 5개의 변수 (정수 타입)
		int num1 = 3, num2 = 4, num3 = 5, num4 = 6, num5 = 7;
		// System.out.println(num6); >> 로컬변수 num6이 아직 초기화 되지 않았기 때문
		
		// 배열로 선언
		// int arr[] = {3, 4, 5, 6, 7};
		
		// 배열 선언 및 생성
		int arr[] = new int[5]; // new 필수
		System.out.println(arr); // [I@7d6f77cc >> arr 배열의 heap 주소
		System.out.println(arr[1]); // 배열 주소가 아닌 원소 값을 알고 싶다면 배열의 인덱스로. index 번호는 0부터 시작
		
		// 새로운 값 저장
		arr[0] = 78;
		arr[2] = 77;
		arr[4] = 80;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]); // 값 지정하지 않은 변수들은 초기값인 0
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
	}
}
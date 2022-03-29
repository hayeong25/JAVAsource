package condition;

// for문으로 삼각형 만들기

public class ForEx8 {
	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
//	  	    *
//	 	   **
//		  ***
//		 ****
//		*****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if(j <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
//		*****
//		****
//		***
//		**
//		*
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
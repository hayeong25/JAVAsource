package api;

public class StringCount {
	public static void main(String[] args) {
		
		String str1 = "aabbccAABBCCaa";
		int cnt = count(str1, "aa", 0);
		
		System.out.println("원본 문자열에 aa 패턴이 " + cnt + "개 있습니다.");
		
	}
	
	public static int count(String src, String key, int pos) {
		// key에 해당하는 패턴이 몇 번 나오는지 확인하는 메소드
		int count = 0;
		boolean status = true;
		while(status) {
			if(src.indexOf(key, pos) >= pos) {
				count++;
				pos = src.indexOf(key, pos) + key.length();
			}else {
				status = false;
			}
		}
		return count;
	}
	
//	public static int count(String src, String key, int pos) {
//		int count = 0;
//		int index = 0;
//		
//		if((key == null) || (key.length() == 0)) {
//			return -1;
//		}
//		
//		while((index = src.indexOf(key, pos)) != -1) {
//			count++;
//			pos = index + key.length();
//		}
//		
//		return count;
//	}
	
}
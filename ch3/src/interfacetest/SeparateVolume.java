package interfacetest;

public class SeparateVolume implements Lendable {

	// 멤버 변수 생성
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	int state;
	
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(state != 0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*** " + bookTitle + "이/가 대출되었습니다. ***");
		System.out.println("대출한 사람 : " + borrower);
		System.out.println("대출한 날짜 : " + date);
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*** " + bookTitle + "이/가 반납되었습니다. *** ");
	}

}
package interfacetest;

public class AppCD extends CDInfo implements Lendable {

	String borrower;
	String checkOutDate;
	int state;
	
	public AppCD(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(state != 0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*** " + title + " CD가 대출되었습니다. ***");
		System.out.println("대출한 사람 : " + borrower);
		System.out.println("대출한 날짜 : " + date);
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*** " + title + " CD가 반납되었습니다. *** ");
	}

}
package shop;

import java.util.Scanner;

// 상점 하나 만들 때마다 MyShop 객체 생성

public class MyShop implements IShop {

	private String title;
	private User users[] = new User[2];
	private Product product[] = new Product[5];
	private Product[] cart = new Product[10];
	private Scanner scanner = new Scanner(System.in);
	private int selUser; // 계정선택에서 선택한 고객 정보 담기
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// User 객체를 이용해 2명 배열로 생성
		users[0] = new User("찬료리", PayType.CARD);
		users[1] = new User("곰탱이", PayType.CASH);
	}

	@Override
	public void genProduct() {
		// CellPhone 3개, SmartTV 2개 생성
		product[0] = new CellPhone("갤럭시 노트5", 1000000, "SKT");
		product[1] = new CellPhone("갤럭시 A31", 370000, "KT");
		product[2] = new CellPhone("아이폰 12", 980000, "LG");
		product[3] = new SmartTV("삼성 Smart TV", 4000000, "4K");
		product[4] = new SmartTV("LG QLED", 600000, "Full HD");
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("==============================");
		
		int i = 0;
		for(User user : users) {
			System.out.printf("[%d] %s(%s)\n", i++, user.getName(), user.getPaytype());
		}
		
		System.out.println("[x] 종료");
		System.out.println();
		
		System.out.print("선택 : ");
		String input = scanner.nextLine();
		
		System.out.println("##### " + input + " 선택 #####");
		
		switch (input) {
		case "0": case "1":
			selUser = Integer.parseInt(input);
			productList();
			break;
		case "x": case "X":
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("입력값을 확인해주세요. 계정선택 화면으로 돌아갑니다.");
			start();
			break;
		}
	}

	public void productList() {
		System.out.println(title + " : 메인 화면 - 상품 선택");
		System.out.println("==============================");
		
		int i = 0;
		for(Product product : product) {
			System.out.printf("[%d]\n", i++, product.getName());
			product.printDetail();
		}
		
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크아웃");
		
		System.out.print("선택 : ");
		String input = scanner.nextLine();
		
		System.out.println("### " + input + " 선택 ###");
		
		switch (input) {
		case "0": case "1": case "2": case "3": case "4":
			for(i = 0; i < cart.length; i++) {
				if(cart[i] == null) {
					cart[i] = product[Integer.parseInt(input)];	
					break;
				}			
			}
			System.out.println(product[Integer.parseInt(input)].getName() + "을 장바구니에 담았습니다.");
			productList();
			break;
		case "h": case "H":
			System.out.println("계정선택 화면으로 돌아갑니다.");
			start();
			break;
		case "c": case "C":
			System.out.println("체크아웃 합니다.");
			checkOut();
			break;
		default:
			System.out.println("메뉴를 확인해주세요. 상품 선택 화면으로 돌아갑니다.");
			productList();
			break;
		}
	}
	
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("==============================");
		int i = 0;
		int sum = 0;
		for(Product cart : cart) {
			if(cart != null) {
				System.out.printf("[%d] %s(%d)\n", i++, cart.getName(), cart.getPrice());
				sum += cart.getPrice();
			}
		}
		System.out.println("==============================");
		
		System.out.println("결제방법 : " + users[selUser].getPaytype());
		System.out.println("합계 : " + sum + "원");
		System.out.println("[p] 이전, [q] 결제완료");
		
		System.out.print("선택 : ");
		String input = scanner.nextLine();
		
		System.out.println("### " + input + " 선택 ###");
		
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println(sum + "원 결제가 완료되었습니다. 감사합니다.");
			break;
		default:
			checkOut();
			break;
		}
	}
	
}
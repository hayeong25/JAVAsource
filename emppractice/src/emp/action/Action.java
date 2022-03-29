package emp.action;

import java.util.Scanner;

public interface Action {
	// Interface에서 public void가 아닌 void로 설정해도 overriding 될 때는 public이 자동 붙어서 메소드 생성됨
	void execute(Scanner scanner) throws Exception;
}
package emp.action;

import java.util.Scanner;

// 작업 효율화를 위한 인터페이스

public interface Action {
	void execute(Scanner scanner) throws Exception;
}
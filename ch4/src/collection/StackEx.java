package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
	Stack
	- LIFO : 마지막에 저장한 데이터를(Last In) 가장 먼저 꺼냄(First Out)
	- push(), pop(), empty()
	
	Queue
	- FIFO : 처음에 저장한 데이터를(First In) 가장 먼저 꺼냄(First Out)
	- offer(), poll()
*/

public class StackEx {
	public static void main(String[] args) {
		
		// Stack
		Stack<String> stack = new Stack<String>();
		
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		System.out.println("== Stack pop() ==");
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println();
		
		// Queue
		// Queue는 Interface이므로 new로 직접 객체 생성 불가
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("10");
		queue.offer("9");
		queue.offer("8");
		queue.offer("7");
		queue.offer("6");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}
}
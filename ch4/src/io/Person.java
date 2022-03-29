package io;

import java.io.Serializable;

/*
	직렬화 : 인스턴스를 저장, 전송
	역직렬화 : 직렬화 했던 객체를 다시 원래대로 가져오는 것
	
*/

public class Person implements Serializable {
	
	// 역직렬화 시 직렬화 된 것과 같은 클래스인지 구별
	// private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = -2806855282281182967L;
	
	private String name;
	private String job;
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "Person [name = " + name + ", job = " + job;
	}
	
}
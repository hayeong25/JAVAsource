package emp.dto;

import java.util.Date;
import lombok.*;

/*
	DTO(Data Transfer Object)
	- 객체간 데이터를 주고받기 위해 만들어진 Class
	- 테이블의 Column이 멤버 변수
*/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DTO {
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
}
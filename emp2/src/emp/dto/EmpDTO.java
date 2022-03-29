package emp.dto;

import java.util.Date;
import lombok.*;

// 데이터를 주고 받는 클래스

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
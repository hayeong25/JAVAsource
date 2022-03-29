package emp.db2;

import java.util.*;

public class EmpMain {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean status = true;
      EmpDAO dao = new EmpDAO();
      
      while(status) {
         System.out.println("─────────────────────────────────────────────────────");
         System.out.println("1 . Emp 전체 조회");
         System.out.println("2 . Emp 사원 조회");
         System.out.println("3 . Emp 사원 수정");
         System.out.println("4 . Emp 사원 탈퇴");
         System.out.println("5 . Emp 사원 추가");
         System.out.println("0 . 종료");
         System.out.println("─────────────────────────────────────────────────────");
         System.out.println();
         System.out.print("메뉴선택 >> ");
         int no = Integer.parseInt(scanner.nextLine());
         
         switch(no) {
         case 1 :
            List<EmpDTO> list = dao.getList();
            for(EmpDTO dto : list) {
            	System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n", dto.getEmpno(), dto.getEname(), dto.getJob(), dto.getMgr(), dto.getHiredate(), dto.getSal(), dto.getComm(), dto.getDeptno());
            }
            break;
         case 2:
        	 System.out.print("조회할 사원 번호 입력 >> ");
        	 int empno = Integer.parseInt(scanner.nextLine());
        	 EmpDTO dto = dao.getRow(empno);
        	 if(dto == null) {
                 System.out.println("존재하지 않는 사원입니다. 메인메뉴로 돌아갑니다.");
                 continue;
              }
        	 System.out.printf("%d\t%s\t%s\t%s\t%d\n", dto.getEmpno(), dto.getEname(), dto.getJob(), dto.getHiredate(), dto.getDeptno());
        	 break;
         case 3:
        	 System.out.print("수정할 사원 번호 입력 >> ");
        	 empno = Integer.parseInt(scanner.nextLine());
        	 System.out.print("변경할 매니저 번호 입력 >> ");
        	 int mgr = Integer.parseInt(scanner.nextLine());
        	 
        	 System.out.println(dao.update(empno, mgr) ? "수정 성공" : "수정 실패");
        	 break;
         case 4:
        	 System.out.print("탈퇴할 사원 번호 입력 >> ");
        	 empno = Integer.parseInt(scanner.nextLine());
        	 System.out.println(dao.delete(empno) ? "탈퇴 성공" : "탈퇴 실패");
        	 break;
         case 5:
        	 System.out.println("추가할 사원 정보 입력");
//        	 System.out.print("사원 번호 : ");
//        	 empno = Integer.parseInt(scanner.nextLine());
//        	 System.out.print("사원명 : ");
//        	 String ename = scanner.nextLine();
//        	 System.out.print("직급 : ");
//        	 String job = scanner.nextLine();
//        	 System.out.print("매니저 번호 : ");
//        	 mgr = Integer.parseInt(scanner.nextLine());
//        	 System.out.print("급여 : ");
//        	 int sal = Integer.parseInt(scanner.nextLine());
//        	 System.out.print("추가수당 : ");
//        	 int comm = Integer.parseInt(scanner.nextLine());
//        	 System.out.print("부서 번호 : ");
//        	 int deptno = Integer.parseInt(scanner.nextLine());
        	 
        	 // boolean result = dao.insert(empno, ename, job, mgr, sal, comm, deptno);
        	 
        	 EmpDTO insertDTO = new EmpDTO();
        	 System.out.print("사원 번호 : ");
        	 insertDTO.setEmpno(Integer.parseInt(scanner.nextLine()));
        	 System.out.print("사원명 : ");
        	 insertDTO.setEname(scanner.nextLine());
        	 System.out.print("직급 : ");
        	 insertDTO.setJob(scanner.nextLine());
        	 System.out.print("매니저 번호 : ");
        	 insertDTO.setMgr(Integer.parseInt(scanner.nextLine()));
        	 System.out.print("급여 : ");
        	 insertDTO.setSal(Integer.parseInt(scanner.nextLine()));
        	 System.out.print("추가수당 : ");
        	 insertDTO.setComm(Integer.parseInt(scanner.nextLine()));
        	 System.out.print("부서 번호 : ");
        	 insertDTO.setDeptno(Integer.parseInt(scanner.nextLine()));
        	 
        	 boolean result = dao.insert(insertDTO);
        	 
        	 System.out.println(result ? "추가 성공" : "추가 실패");
        	 break;
         case 0 :
            System.out.println("프로그램을 종료합니다.");
            status = false;
            break;
         default :
            break;
         }
      }
      
      scanner.close();
   }
}
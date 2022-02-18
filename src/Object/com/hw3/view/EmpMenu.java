package Object.com.hw3.view;

import java.util.Scanner;

import Object.com.hw3.model.vo.Employee;

public class EmpMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {//기본생성자
		}
	
	public void mainMenu() {
		
		//mainMenu() 메소드에 초기 사원 객체 null로 초기화 후 진행
		Employee emp = null;
		
		// 메뉴 화면 출력 --> 반복 실행 처리
		while(true) {
			
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력 ");
			System.out.println("2. 사원 정보 수정 ");
			System.out.println("3. 사원 정보 삭제 ");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			
			switch(num) {
			case 1 :
				emp = inputEmployee(); //새로 만든 객체를 emp에 넣어준다.
				break;
			case 2 : 
				modifyEmployee(emp);
				break;
			case 3 : 
				emp = null; //객체를 null로 바꾸면 가비지 컬렉터가 지워준다.
				break;
			case 4 : 
				System.out.println(emp.information());
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
		}
		
	}

	public Employee inputEmployee() { //반환을 객체 Employee형으로 하기 때문에 반환형 Employe
		// 키보드를 통해 사원 정보를 입력받게끔 구현
		// 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
		// 생성된 객체의 주소 값 반환
	
		System.out.println("이름 : ");
		String empName = sc.nextLine();
		
		System.out.println("부서 : ");
		String dept = sc.nextLine();
		
		System.out.println("직급 : ");
		String job = sc.nextLine();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		
		System.out.println("보너스 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("핸드폰 번호 : ");
		String phone = sc.nextLine();
		
		System.out.println("주소 : ");
		String address = sc.nextLine();
		
		Employee newEmp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);		
		return newEmp;		
	}

	public void modifyEmployee(Employee emp) { //매개변수가 emp -> setter이용
		//서브 메뉴 화면 출력 --> 반복 실행 처리
		while(true) {
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.println("번호를 입력해주세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			// 각 번호에 맞춰 변경할 값을 입력 받고 setter 메소드를 이용하여 수정
			switch(num) {
			case 1 :
				System.out.println("변경할 이름을 입력해주세요 : ");
				String name = sc.nextLine();
				emp.setEmpName(name);
				break;
			case 2 :
				System.out.println("변경할 급여를 입력해주세요 : ");
				int salary = sc.nextInt();
				sc.nextLine();
				emp.setSalary(salary);
				break;
			case 3 :
				System.out.println("변경할 부서를 입력해주세요 : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
			case 4 :
				System.out.println("변경할 직급을 입력해주세요 : ");
				String job = sc.nextLine();
				emp.setJob(job);
				break;
			case 9 :
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			default :
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
		}
	}
}

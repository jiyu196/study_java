package student;

public class StudentService {
	Student[] students = new Student[2];  
	int count; //필드는 원래 처음 시작값이 0이라 int count = 0;이라고 안해도 됨
	//{null,null,null,null,null,null,null,null,null,null} 이렇게 null값이 여러개 들어가있음
	
	//1. 평균 계산 double type
	//2. 수정, 삭제 기능 구현. 학번 입력받아서 그에 해당하는 학생만 삭제해야함
	//( 수정 및 삭제 구현. 이름새로 입력받고 순차적으로 입력받은 후 덮어쓰기) 1,2,3,4 학번있으면 2번 나갔을 때 1,3,4가 되어야함
	// 수정 및 삭제 구현. 이름새로 입력받고 순차적으로 입력받은 후 덮어쓰기
	//3. 배열의 길이를 넘는 추가 학생 등록시 배열 길이 늘리기
	// 배열 늘리기. 3명째 입력하는 순간 터지는데 배열 늘리기- 전에 한번 했었음
	
	//등록

	void register() {
		System.out.println("등록 기능");
		//학생 생성
		//학번, 이름, 국어,영어,수학 데이터필요
		int no = StudentUtils.nextInt("학번 > ");
		String name = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어 >" );
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");
//		students[0] = new Student(); //null 포인터를 깨주는. 학생타입 인스턴스가 필요한거
//		students[0].no = no;
		students[count++] = new Student(no,name,kor,eng,mat);  
		
//		students[count++] = new Student
		//다 적긴 힘드니까 이렇게 넣어주는
	} //count++ ->등록하고 1이 증가해야하니까 ++표시함
	
	//조회
	void read() {
		System.out.println("조회 기능");
		for(int i =  0 ; i < count ; i++) {
			System.out.println("학번은 "+students[i].no + "/" +"이름은 "+students[i].name + "/" +"총점은 " + students[i].total()+"점/평균은" + students[i].avg()+ "점 입니다.");
		}
		
	}
	
	
	//수정
	void modify() {
	
		System.out.println("수정 기능");
		int no = StudentUtils.nextInt("수정할 학번을 입력하세요 > ");
		System.out.println("입력하신 학번은 "+no+ "입니다.");
		int noChange = StudentUtils.nextInt("새로운 학번을 입력해주세요 > ");
		
		no = noChange;
		System.out.println("변경된 학번은 " + no+ "입니다.");
	}
	
	//삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학번을 입력하세요 > ");
		System.out.println("입력하신 학번은 "+no+ "입니다.");
	
			
		
	}

	void sum() {
		System.out.println("총점 확인");
	}
	void avg() {
		System.out.println("평균 확인");
	}

	
		
	}
	
	


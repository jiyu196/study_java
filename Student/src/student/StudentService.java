package student;

import java.util.Arrays;



public class StudentService {
	//1. 평균 계산 double type
	//2. 수정, 삭제 기능 구현. 학번 입력받아서 그에 해당하는 학생만 삭제해야함
	//( 수정 및 삭제 구현. 이름새로 입력받고 순차적으로 입력받은 후 덮어쓰기) 1,2,3,4 학번있으면 2번 나갔을 때 1,3,4가 되어야함
	//3. 배열의 길이를 넘는 추가 학생 등록시 배열 길이 늘리기
	// 배열 늘리기. 3명째 입력하는 순간 터지는데 배열 늘리기- 전에 한번 했었음
	
	Student[] students = new Student[2];  
	
	int count; //필드는 원래 처음 시작값이 0이라 int count = 0;이라고 안해도 됨
	//{null,null,null,null,null,null,null,null,null,null} 이렇게 null값이 여러개 들어가있음
	
	
	
	{
		students[count++] = new Student(1, "개똥이", 90,80,90); 
		students[count++] = new Student(2, "새똥이", 70,50,80);   //계속 등록한 학생이 초기화괴는게 귀찮을때 '초기화블록'사용해서 애초에 2학생을 임의로만들어놓음
	}
	
	
	//등록

	void register() {  //조건을 활용.만약  students보다?
		if(count == students.length) {
		students = new Student[students.length*2];  //2배가 가장 효율적이어서 2배를 함.
		//if 안에 students = Arrays.copyof(students, stedents.length *2); 이거 넣어도 됨.
		
		//--배열 늘리기.배열복사 사용   등록한 학생의 수와 들어갈 수 있는 공간이 같으면 배열을 늘린다. 학생이 더 들어갈 수 있는 공간을 만들기위해 배열늘리기를 하는거
//		System.out.println(Arrays.toString(students2));
		}
		
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
	
	
	//수정    students 객체를 활용해서 수정.
	void modify() {
	
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생. 가져와서 수정
		int no = StudentUtils.nextInt("수정할 학번을 입력하세요 > ");
		//student사용해서 등록된 이름, 점수 나타내기
		Student s = null;  
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				s = students[i];
				break;
			}
		}
		
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 >" );
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");
	}
//		System.out.println("현재 정보는 : "+students+"입니다");
//		
//		int noChange = StudentUtils.nextInt("새로운 학번을 입력해주세요 > ");
//		
//		no = noChange;
//		System.out.println("변경된 학번은 " + noChange+ "입니다.");           // 문제점 :다시 조회하면 바뀌지 않음. 
//	}
	
	//삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번을 입력하세요 > ");
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- -1-i);
				// //학생을 지웠으면 학생 수도 지워야함. count--;해도 되고 위에 처럼 적어도됨
				break;
			}
	
	void avgSub() {
		System.out.println("과목별 평균확인");
		
	}
	
	void seq() {
		System.out.println("석차 점수확인");
		
	}
		//없는 학번이면 없다고도 나와야하고 바뀐 학번이면 틀렸다고도 나와야할거같은
//		int del = StudentUtils.nextInt("삭제하시겠습니까? (Y 또는 N) > ");
//		
//		//삭제한다
//		System.out.println("삭제되었습니다.");
		//한명 삭제. 삭제 어떻게..
//		중복 사용? 없어진 학번은 다시 겹치면 안되는
		//arrycopy 사용. 덮어씌울거. 자기 자신한테 복사. 
			
		
	}
	//0417 과제
	//1. 중복 학번 학생 등록 방지
	//2. 과목별 평균값 출력= 신규메뉴 생성. 국어의 평균,수학의평균,영어의 평균 + 0총평균
	//3. 석차 순 정렬. 1,2,3등 안해도 석차순으로 점수 나오기.총점으로 =신규메뉴 생성.
	//어떤문제에서 버블 사용이라했는데 뭐더라
	//4. Student 클래스의 toString 재정의-조회쪽에 있던 긴~거 .편의성 위해서 하는거임
		//product했던거(전자제품 했던mart),책은 226,227페이지에 관련내용 있음
	
		
	}
	
	

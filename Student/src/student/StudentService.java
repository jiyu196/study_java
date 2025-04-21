package student;

import java.util.Arrays;

<<<<<<< HEAD
public class StudentService {
	
	//try ,catch 예외처리 사용하기. 
	//private은 사용자가 더 활용하기 편하게 넣는. 막는 목적도 있지마
	
	Student[] students = new Student[4];
	Student[] sortedStudents = new Student[students.length];
	int count; //등록 학생수
	

	{
		students[count++] = new Student(1, "개똥이", 60, 80, 90);
		students[count++] = new Student(2, "새똥이", 90, 30, 40);
		students[count++] = new Student(3, "말똥이", 10, 30, 60);
		students[count++] = new Student(4, "소똥이", 100, 100, 90);
		
		sortedStudents = students.clone(); //정렬만 수행하는거, 조회만 수행하는거 따로할거임  Arrays.copyOf(students, students.length)원래 이거했는데 대신clone집어넣음
		rank();
	}
=======


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
>>>>>>> 22aa491aad9f2f3c52b76fede94c876af707b4b2
	
//	Random ran = new random(); //랜덤 객체 생성.??하고 60~100 사이 배정?????
	
	//입력: 학번
	//출력: 학생
	Student findBy(int no) {
		Student student = null;  //0값 부여하는것처럼 
		for(int i = 0; i < count; i++) {
			if(students[i].no == no) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	// 등록
	public void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		
		int no = StudentUtils.nextInt("학번 > ");
		
		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다.");
			return;
		}
		
		String name = StudentUtils.nextLine("이름 > ");   
//		student findBy(name);
		
//		if("ㄱ - 힣" != null) {
//			System.out.println("한글만 입력 가능합니다.");
//		}
		
		//만약 name 이 한글이 아니라면
		//2~4글자 사이가 아니면
		//다시입력
		
			
//		int sub= 0;
//		for(int i = 0; i <=100; i++) {
//			if(students.length >100) {
//				System.out.println("0~100점 까지입니다. 다시 입력하세요");        //0~100까지인거 범위 정하고 틀리면 다시 입력받기
//			}
//		}
		int kor = StudentUtils.nextInt("국어 > ");
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");       //처음에 for,if문으로 햇었는데 계속 name이 포함되서 나왔음
			
		
			if(students.length == count) {
				students = Arrays.copyOf(students, students.length * 2);
			}
			
		
			students[count++] = new Student(no, name, kor, eng, mat);
			sortedStudents = Arrays.copyOf(students, students.length); //정렬만 수행하는거, 조회만 수행하는거 따로할거임
			rank();
	}

			
	
	// 조회
	public void read() {
		System.out.println("조회 기능");
<<<<<<< HEAD
		print(students);
//		for(int i = 0 ; i < count ; i++) {
//			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total() + ", " + students[i].avg());
		}
	public void readOrder() {
			System.out.println("석차순 조회 기능");
			print(sortedStudents);
		}
//		public String toString() {
//			return getClass().getSimpleName() + "[" + read + "]";
//		}
	public void print(Student[] stu) {
			for(int i=0; i < count; i++) {
				System.out.println(stu[i]);
			
		}
	}
	// 수정
	public void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		
		
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 > ");
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
		
	}
	// 삭제
	public void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- - 1 - i);
				break;
			}
		}
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}

	
	//과목별 평균
	public void allAvg() {
		//국어, 영어, 수학, 전체평균
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		//count 몇명의 학생을 기준으로 현재 평균이 얼마이다
		for(int i= 0; i < count; i++) {
			avgKor += students[i].kor;
			avgEng += students[i].eng;
			avgMat += students[i].mat;
		}
		avgKor /= (double)count;
		avgEng /= (double)count;  //반복된게 많음. 같은 라인보이면 메서드쓰거나 반복문 사용해서 줄이기
		avgMat /= (double)count;
		
		avgAll = (avgKor + avgEng + avgMat) / 3;
		
		System.out.println(count + "명의 학생 평균");
		System.out.println("국어 평균" + avgKor);
		System.out.println("영어 평균" + avgEng);
		System.out.println("수학 평균" + avgMat);
		System.out.println("전체 평균" + avgAll);
	}
	
	//석차
	public void rank()	 {
		
		for(int i =0; i<count-1; i++) {
			
			int idx = i; //인덱스값초기화
			
			for(int j =1+i; j <count; j++) {  //비교해서 상호교환하는
				if(sortedStudents[idx].total() > sortedStudents[j].total()) {  //여기 부등호 바꾸면 내림차순이 됨.
					idx = j;  //여기까지 한번해서 탐색함. 
				}
			}	
			Student tmp = sortedStudents[i];
			sortedStudents[i] = sortedStudents[idx];
			sortedStudents[idx] = tmp;
			
		}
	}
	
	
//			sortedStudents = Arrays.copyOf(students, students.length); //정렬만 수행하는거, 조회만 수행하는거 따로할거임
//			rank();
//			System.out.println(i +1 +"회차 ::" + Arrays.toString(students));
//		}
		

//내가쓴거		System.out.println("과목별 평균점수");
//		int totkor = 0,toteng = 0,totmat = 0;
//		for(int i = 0; i<count; i++) {
//			totkor+=students[i].kor;
//			totkor+=students[i].eng;
//			totkor+=students[i].mat;
//			 //과목끼리 더하고(다른 학생들의 국어,영어,수학 점수를) 학생 수 count로 나눈다.? 
//			System.out.printf("%.2d", totkor);  //double로 나타내기?
//			System.out.printf("%.2d", toteng); //printf로 실수 출력
//			System.out.printf("%.2d", totmat);
//			}
//	배열 2개. 정렬은 데이터값이 변동 시에 등록,수정,삭제시점마다 
//	}
//	void rank() {
//		
//		//students.avg-? 학생들의 평균점수를 비교 하기
//		//for문으로 성적 비교  ?
//		//오름차순으로 정렬
//	
//	
//	// 1. 중복학번 학생 등록 방지(학번을 기준으로 학생의 존재 여부)
//	// 2. 점수당 평균값 출력 + @ 총평균
//	// 3. 석차 순 정렬--버블 정렬(대소비교)
//	// 4. Student 클래스의 toString 재정의
//	public static void main(String[] args) {
//		int[]arr = {5,3,2,1,4,7,8,6};  //최솟값 찾기. 인덱스 필요. 5번에 있는 인덱스와 값 교환
//		//선택 정렬은 앞쪽에 먼저 확정. 버블정렬은 뒤에 부터 확정
//		//탐색 n 최솟값 . 내림차순이면 최댓값 찾기
//		//1,3,2,5,4 >1회차. 0번 인덱스를 제외한 최솟값을 찾아서 1번인덱스에넣기
//		//1,2,3,5,4 >2회차
//		//1,2,3,5,4 >3회차
//		//1,2,3,4,5 >4회차 최솟값찾아서3번 인덱스에 넣기
//		for(int i =0; i<count-1; i++) {
//			
//			int idx = i; //인덱스값초기화
//			int min = arr[idx]; //min값 
//			for(int j =1+i; j <count; j++) {  //비교해서 상호교환하는
//				if(sortedStudents[idx] > sortedStudents[j]) {  //여기 부등호 바꾸면 내림차순이 됨.
//					idx = j;  //여기까지 한번해서 탐색함. 
//				}
//			}	
//			int tmp = sortedStudents[i];
//			sortedStudents[i] = sortedStudents[idx];
//			sortedStudents[idx] = tmp;
//			
//			System.out.println(i +1 +"회차 ::" + Arrays.toString(arr));
//		}
	}
	
=======
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
	
	
>>>>>>> 22aa491aad9f2f3c52b76fede94c876af707b4b2

package student;

import java.util.Arrays;

public class StudentService {
	Student[] students = new Student[2];
	int count; //등록 학생수

	{
		students[count++] = new Student(1, "개똥이", 60, 50, 30, 150, 200);
		students[count++] = new Student(2, "새똥이", 90, 30, 40, 150, 200);
	}
	
	
	// 등록
	void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		int no = StudentUtils.nextInt("학번 > ");
		
		String name = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어 > ");
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");
		
		while(true) {
			boolean insert = true;
			for(int i = 0; i < students.length; i++) {
				if (no == students.length) {  //이게 겹치면 안넣고 안겹치면 넣는다 .
					StudentUtils.nextInt("중복된 학번입니다. 다른 학번을 입력하세요 > ");
					insert = false;
					break;
				}
			}
		if(students.length == count) {
			students = Arrays.copyOf(students, students.length * 2);
			
		double seq=0;
		double avgSub = 0;
		students[count++] = new Student(no, name, kor, eng, mat, avgSub, seq);
		
		
				
			}
		}
	}
	
	
	// 조회
	void read() {
		System.out.println("조회 기능");
		for(int i = 0 ; i < count ; i++) {
			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total() + ", " + students[i].avg());
		}
		public String toString() {
			return getClass().getSimpleName() + "[" + read + "]";
		}
	}
	// 수정
	void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = null;
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				s = students[i];
				break;
			}
		}
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 > ");
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");
		
	}
	// 삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- - 1 - i);
				break;
			}
		}
	}
	
	void avgSub() {
		System.out.println("과목별 평균점수");
		int totkor = 0,toteng = 0,totmat = 0;
		for(int i = 0; i<count; i++) {
			totkor+=students[i].kor;
			totkor+=students[i].eng;
			totkor+=students[i].mat;
			 //과목끼리 더하고(다른 학생들의 국어,영어,수학 점수를) 학생 수 count로 나눈다.? 
			System.out.printf("%.2d", totkor);  //double로 나타내기?
			System.out.printf("%.2d", toteng); //printf로 실수 출력
			System.out.printf("%.2d", totmat);
			}
	
	}
	void seq() {
		System.out.println("석차 점수");
		//students.avg-? 학생들의 평균점수를 비교 하기
		//for문으로 성적 비교  ?
		//오름차순으로 정렬
	}
	
	// 1. 중복학번 학생 등록 방지
	// 2. 점수당 평균값 출력 + @ 총평균
	// 3. 석차 순 정렬
	
}
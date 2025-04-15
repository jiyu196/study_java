package student;

//Data class
public class Student {
	//1. StrdentMain의 나머지 기능 구현(메세지 출력)
	//2. Student의 생성자 구현
	//기본 생성자 + 두번째 생성자 -(학번, 이름), (다섯개의 필드를 다 사용)
	
	//학생 1인의 총점, 평균을 계산 한다면?
	//어떻게 처리할건지?
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	Student(int no, String name,int kor, int eng, int mat){  //이게 기본 생성자+두번째 생성자?
		this.no = no;
		this. name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	};
	
//	Student(int kor, int eng, int mat){  //1번 생성자
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
//	};
//	Student(int no, String name) {  //2번 생성자
//		this.no = no;
//		this. name = name;
//	};
	
	Student(){
		
	}
	
}

package student;

//Data class
public class Student {
	//1. StrdentMain의 나머지 기능 구현(메세지 출력)
	//2. Student의 생성자 구현
	//기본 생성자 + 두번째 생성자 -(학번, 이름), (다섯개의 필드를 다 사용)
	
	//학생 1인의 총점, 평균을 계산 한다면?
	//어떻게 처리할건지?
	//학생 한명을하기때문에 student 페이지에서 적음
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	 //sequential score이 석차점수
	
	
//	int total = kor+eng+mat;  //필드이기때문에 값을 지속적으로 계산하 수 업슴
	//총점이라고하는 메서드를 만드렁야함
	
//	double avg = (kor+eng+mat)/3.2d;
	
	
	Student(){}
	
	
	Student(int no, String name){  //이게 기본 생성자+두번째 생성자?
		this.no = no;
		this. name = name;
		
	}
	
	Student(int no, String name,int kor, int eng, int mat){  //이게 기본 생성자+두번째 생성자?
		this(no,name);   
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	int total () { //이렇게는 메서드가됨
		return kor+eng+mat;
	}
	
	//평균계산
	double avg () {
		return total()/3.2d;  //=> return total() /3d;
		
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(),total()) ;
	}
//	double avgSub() {
//		return (totkor+toteng+totmat)/count;   //...
//	}
	
	
//	int avgSub() {
//		return 
//	}
	
	
	//평균 계산 double type
	//2. 수정, 삭제 기능 구현. 학번 입력받아서 그에 해당하는 학생만 삭제해야함
	//( 수정 및 삭제 구현. 이름새로 입력받고 순차적으로 입력받은 후 덮어쓰기)
	//3. 배열 늘리기. 3명째 입력하는 순간 터지는데 배열 늘리기- 전에 한번 했었음
}
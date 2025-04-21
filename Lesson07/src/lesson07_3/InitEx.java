package lesson07_3;

public class InitEx {    //인스턴스가 생길 때 인스턴스 나옴 참조값이 없을 때 사라짐
	                    //해당 클래스가 메모리 로드될 때 생김/ 클래스는 프로그램이 끝나야 사라짐. 그 전까진 유지됨
	InitEx(){
		System.out.println("생성자 호출");
		
	}
	
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String[]ars) {
		System.out.println("main 메서드 시작");
		System.out.println("main init1 객체 생성");
		new InitEx();
		System.out.println("main init2 객체 생성");
		new InitEx();
//		System.gc(); //가비지 컬렉터 가져오는
	}
	
}

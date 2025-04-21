package lesson07_3;

public class Ins {
	public static void main(String[] args) {
		String str = new String();
//		 1. String : 클래스(=본질.?), 데이터 타입, 인스턴스.
		// 2. str: 객체(=이름), 지역변수 (main 안이어서)
		// 3. = : 대입 연산자
		// 4. new : 연산자, 인스턴스 생성 트리거, 생성자 필요
		// 5. String() : 생성자 호출문구, 기본 생성자
		
		// 4+5 : 새 인스턴스 생성
		
		str.length();
		new String().length();  //new String()은 인스턴스.일회성
		
		String s;          //객체, 초기화 안해서 인스턴스 없음
		String s2 = null;  //객체, 인스턴스 미할당 객체
		
	}
}

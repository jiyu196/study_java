package lesson01;

public class CharType {
	public static void main(String[] args) {
		//65000개 가량
		//한글의 비중
		//가-각
	
		
		char 문자 = '가';
		System.out.println(문자);
		int 정수화된문자 = 문자;
		System.out.println(정수화된문자);
		
		String str = "가" + "나" + "다라마"; //가나다라마
		
		char a = 'A'; //char타입 변수
		
		System.out.println("a:"+a);  //콘솔을 출력하기 위한 구문. 쌍따옴표 뒤에 나오게될 a라는 글자 +가있는 문자열 결합연산.위에있는
		
		int b = a; //인트타입에 ㅠ를 선언했고 a가 들어간다. 숫자로 표현하기 위한 목적
		System.out.println("b:"+b);
		
		char c = 66;  //char타입에 c선언. 
		System.out.println("c:"+c);

		
		int d = a+b; //65+65,  int 타입에 d
		System.out.println("d:"+d);

	}
}

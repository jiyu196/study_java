package lesson07;

public class VarEx {
	public static void main(String[] args) {
		System.out.println("Avante 제조사 :" + Avante.company); //점. 을 "의" 로 해석해도됨. 아반떼의 company
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		a1. color =  "화이트";
		a2. color =  "블랙";    //instance:각각의 분리된 독립공간
		
		System.out.println("a1 색상: "+a1.color);
		System.out.println("a2 색상: "+a2.color);
		
		System.out.println("a1 제조사: "+a1.company);  //company 에 경고뜨는게 class로 지정해라는
		System.out.println("a2 제조사: "+a2.company);
		
		a1.company = "기아";
		
		System.out.println("Avante 제조사 :" + Avante.company);
		System.out.println("a1 제조사 :" + a1.company);
		System.out.println("a2 제조사 :" + a2.company);
		
	}
}
class Avante {
	String color;  //instance
	static String company = "현대";  //class 변수
}
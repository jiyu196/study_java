package lesson04;

public class Special {
	public static void main(String[] args) {
		//나누기 계산식
		//A / B = C
		//A : 띠제수
		//B : 제수
		//C : 몫
		//NaN : Not a NUmber
		
		
		System.out.println(Double. POSITIVE_INFINITY);
		System.out.println("실행전");
		System.out.println(3/0d);  //이런 경우 프로그램이 즉시 종료됨
		System.out.println(0/0d);  //d붙여서 실수로 하면 infinity가 나오는데 이게 무한을 뜻하는거임
		System.out.println("실행후");
		
		//&& & 
		//거짓 && 참 
		
		System.out.println(false && 3/0 == 1); //이미 앞에 false나왔기 때문에 뒤에 까지 가지 않고 터지지 않음.
		System.out.println(3/0 == 1 && false); //이건 터짐 . 에러남

		

		
	}
}

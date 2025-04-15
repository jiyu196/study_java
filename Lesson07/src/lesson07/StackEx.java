package lesson07;

public class StackEx {
	public static void main(String[] args) {
		//stack overflow사이트가 있음.지식인 같은
//		main(args); --이건 main이 main을 호출한건데 재귀호출이어서 오류뜸. 관리하기 힘듦.에러안뜨게 하기
		//main>m1>m2>m3
		System.out.println("main start");
		method1();
		System.out.println("main end");
	}
	static void method1() {
		System.out.println("method1 start");
		method2();
		System.out.println("method1 end");
	}
	static void method2() {
		System.out.println("method2 start");
		
		method3();
//		method1(); --이건 staxk overflow로 오류뜸
		System.out.println("method2 end");
	}
	static void method3() {
		System.out.println("method3 start");
		System.out.println("method3 end");
	}
}

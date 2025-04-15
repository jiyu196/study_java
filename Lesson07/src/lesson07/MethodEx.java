package lesson07;

public class MethodEx {
	 public static void main(String[] args) {  //다 static 붙어있어서 class로 선언했다는
		int result = add(10,20);  //호출했음. 아지 출력하라고는 안함
		System.out.println(result);  //반환값존재 안하면 void가 되는거
		print("Hello");
		System.out.println(addAll(1, 2, 3));  //배열처럼 활용됨
		//Stack이란 
//		return; 생략되어있는거  return은 한 순간 메인 메소드는 끝나기 때문에 그 밑에 뭐 적으면 실행되지않음
//		return;
//		int a = 10;--위에 return있으니까 이건 실행안됨.
		
		
	}
	 static int add(int a, int b) {
		 
		 return a + b;      //메서드 호출할 때 입구  .
	 }
	 
	 static int addAll(int... nums) {  //...붙이면 int에 제한이 없음.그래서 위에 1,2,3 넣음
		int ret = 0;
		for(int n : nums) {
			ret += n;            //길이가 3개인 걸로 호출
		}
		 return ret;
	 }
	 static void print(String s) {  //void 있음. 명시적 리턴은 하지 않는다
		 System.out.println(s);
	 }
}



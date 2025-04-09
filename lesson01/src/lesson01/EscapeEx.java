package lesson01;

public class EscapeEx {
	public static void main(String[] args) {
		String greet = "안녕하세요,\n저는 \"홍길동\"입니다."; //
		String greet2 = "\t반갑습니다"; //탭 누른거만큼 앞에 공백
		
		System.out.println(greet);
		System.out.println(greet2);
		
		int i =10;
		{
			System.out.println(i);
			double d =10;
		}
//		System.out.println(d);
		
		//short > 2byte
		//char > 2byte
		long l =10;
		i =(int)l;
		
		byte b =(byte)128; //(byte) 명시적으로 하는거
	
		
		System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890");
		//이거 선생님이 몇개인지 수세는 방법. 70자리 숫자임
		
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Long.toBinaryString(300));
		System.out.println((byte)300);
		
		
		//300
		//1 001 1100
		
	}
}

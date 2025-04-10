package lesson05;

import java.util.Scanner;

public class Han {
	public static void main(String[] args) {
		//가는 44032 이다
//		//한글의 갯수
//		System.out.println('힣' - '가' +1); //11172
//		
//		//초성 간 글자 갯수
//		System.out.println('힣' - '하' +1); //588
//		
//		//초성의 갯수
//		System.out.println(11172/588);
//		System.out.println(19 * 588);
//		
//		//종성 간 거리
//		System.out.println('개' -'가');
//		
//		//특정 글자가 받침이 있는지 없는지 boolean -->나누기 연산 사용. 순환
//		//'가' %28바로 나누면 안됨.  일단 '가'에서 '가'를 빼서 0이되면 '가'% 28이 0이 되는게 받침없는거
//		//있으면 true
//		//없으면 false
		
//		char ch = '갉';
//		System.out.println((ch - '가') % 28 != 0);
//		System.out.println();
		
//		System.out.println((ch - '가') % 28 != 0);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("단어를 입력하세요 >");
		String inputStr = scanner.nextLine();
		
		//문자열 내의 특정위치의 글자하나만 char로 변환
		char ch = inputStr.charAt(inputStr.length()-1);
		boolean haslast = (ch - '가') % 28 != 0;
		
		String output = "사용 단어의 예시는 아래와 같습니다\n";
		output += inputStr + (haslast ? "은" : "는") + "\n";
		output += inputStr + (haslast ? "이" : "가") + "\n";
		output += inputStr + (haslast ? "을" : "를") + "\n";
		
		System.out.println(output);
	}
}

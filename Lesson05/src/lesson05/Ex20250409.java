package lesson05;

import java.util.Scanner;

public class Ex20250409 {
	public static void main(String[] args) {
		
		//1. 로그인 인증- 비교랑, 알려주신 안배운 개념 사용하기
		//사용자로 부터 아이디와 비밀번호를 입력받고. (아이디 없으면 없는사람. 아이디 있는데 비번 모르면 로그인 실패. )
		//그 아이디가 admin, 비밀번호가 1234일때 로그인 성공
		//아이디가 admin 비밀번호가 틀렸을 때 로그인 실패 > 잘못된 비밀번호
		//아이디가 admin이 아니면 없는 계정 메세지 출력
		
		//**퀴즈 풀다가 아직 안배운 개념 정리하는**
				String str = "1234";
				String str2 = "1234";
				
				//문자열 비교
				//str.equals(str2)
				
//				if(str == str2) {
//					System.out.println("같은 문자열");
//			}
				
				if(str.equals(str2)) {
					System.out.println("같은 문자열");
					
				}
				
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine(); //사용자의 입력을 문자열로 수집
				
			}
		
		//2. 숫자 하나를 입력받아서
		//3의 배수 그리고 짝수 여부를 동시판별 
		//3의 배수, 짝수, 3의 배수이면서 짝수, 둘다 아닌경우 -이 4가지 경우를 조건식으로 만들어라
		
		//3. 월(month)을 입력받아서 계절을 출력
		//3,4,5 봄(spring), 6,7,8 여름, 9,10,11 가을, 12,1,2 겨울
	
}



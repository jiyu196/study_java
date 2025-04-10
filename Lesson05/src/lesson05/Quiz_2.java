package lesson05;

import java.util.Scanner;

public class Quiz_2 {
	public static void main(String[] args) {
		
	
		
		
		
		//책문제
				//p79. 3번
//						int colorPen = 5*12;
//						int studentCount = 27;
//						
//						int divColorPen = colorPen/studentCount;
//						System.out.println("학생당 나눠가지는 색연필수 :"+divColorPen);
//						
//						int remainColorPen = colorPen%studentCount;
//						System.out.println("똑같이 나눠가지고 남은 볼펜수 :"+remainColorPen);
						
						//출력: 학생당 나눠가지는 색연필수-2, 똑같이 나눠가지고 남은 볼펜수-6
						//빈칸에 들어갈 내용
						//[1] 12, [2] 60/27 [3] 60%27
						
						
				//4번 탈수 있는지 없는지 boolean으로 해보기. 마무리도
//						int age=6;
//						String pass = age >= 6 ? "6세이상입니다":"6세미만입니다";
//						System.out.println(pass);
//						int height=120;
//						String pass2 = height >= 120 ? "120이상입니다":"120미만입니다";
//						System.out.println(pass2);
						
//						int parent;
//						String pass3 =  ? "가능":"불가능";
//						System.out.println(pass2);
//						int hearchDease;
//						String pass4 = height >= 120 ? "가능":"불가능";
//						System.out.println(pass2);
//						
//						int age=6;
//						String pass = age >= 6 ? "6세이상입니다":"6세미만입니다";
//						System.out.println(pass);
//						int height=120;
//						String pass2 = height >= 120 ? "120이상입니다":"120미만입니다";
//						System.out.println(pass2);
//						boolean parent = true;
//						System.out.println("부모동반입니다.5세 미만 탑승가능> "+parent);
//						boolean hearchDease =false;
//						System.out.println("심장관련 질환자가 아닙니다> "+hearchDease);
						
//						boolean age = true;
//						System.out.println("6세 이상입니다.");
//						boolean height = true;
//						System.out.println("키가 120cm이상입니다.");
//						
//						boolean parent = true;
//						System.out.println("부모동반입니다.5세 미만 탑승가능 ");
//						boolean hearchDease =false;
//						System.out.println("심장관련 질환자가 아닙니다 ");
//						
//						boolean okay = age && height && (!age && parent==true) && !hearchDease;
//						System.out.println("탑승 가능합니다.");
		
	//선생님풀이					int age=10, height=168;
//						boolean parent=false, hearchDease=false;
//						//신장은 독립조건. 신장은 언제나 120이상
//						boolean isRide = !hearchDease && height >= 120 && (age > 6 || parent);
//						
				//5번
//						int year = 2020;
//						
//						boolean leapYear = year%4 ==0 && !(year%100 ==0) || year%400==0;
//						
//						System.out.println(leapYear);
						
	//선생님풀이		int year = 2004;
//						boolean leapYear = year%4==0 && 100 !=0 || year % 400 ==0;
//						System.out.println(leapYear); //4의 배수는 윤년이 맞는데 100의 배수는 안됨
//						
						
				//6번
//						int price = 187000;  --숫자 읽기 힘들때 187_000이렇게하면 숫자로 인식도 하고,읽기 편함.
//						int oman = price/50000;
//						int ilman = price%50000/10000;
//						int ochun = price%50000%10000/5000;
//						int ilchun = price%50000%10000%5000/1000;
//						
//						System.out.println("5만원권 :"+oman+"장");
//						System.out.println("1만원권 :"+ilman+"장");
//						System.out.println("5천원권 :"+ochun+"장");
//						System.out.println("1천원권 :"+ilchun+"장");
						
						
								
				//7번
//						int number =1234;
//						int result =  number >> result;
//						System.out.println(result);
						
						//비트연산...?은 아닌거같고 소수점이 아닌데 뭘로..
						
						int number = 1234;
						int result = 1234 / 100*100; //1200
						
						result = number - number % 100; //
						System.out.println(result);
						
				//제어문 퀴즈
				//1. 로그인 인증
						//사용자로부터 아이디와 비밀번호를 입력받고, 
						//그 아이디가 admin, 비밀번호가 1234일때, 로그인 성공
						//아이디가 admin 비밀번호가 틀렸을 때 로그인 실패>잘못된 비밀번호
						//아이디가 admin이 아니면 없는 계정 메세지 출력
						
						//아직 안배운 개념
//						String str = "1234";
//						String str2 = "1234";
//						
//						//문자열 비교
//						//str.equals(str2)
//						if(str == str2) {
//							System.out.println("같은 문자열");
//						}
//						
//						Scanner scannner = new Scanner(system.in)
//						String input =scanner.nextLine();//사용자의 입력을 문자열로 수집
						
						int user;
						  //사용자, 아이디, 비번입력
						Scanner scanner = new Scanner(System.in);
						System.out.println("아이디를 입력하세요 >");
						String ID = scanner.nextLine();
						System.out.println("비밀 번호를 입력하세요 >");
						String PW = scanner.nextLine();						
						
						 //사용자 입력을 문자열로 수집.?
						
						System.out.println(ID);
						System.out.println(PW);
						
						if(ID.equals("admin")) {
							if(PW.equals("1234")) {
								System.out.println("로그인 성공");
							}
							else {
								System.out.println("비밀번호가 틀립니다");
							}
						} 
						else {
							System.out.println("없는 아이디입니다");
						}
						
//						ID. equals(PW)
//						if (ID == ) {
//							System.out.println("로그인 성공");
//						} 
//						if (!(PW==1234)) {
//							System.out.println("로그인 실패 >잘못된 비밀번호입니다.");
//						}
//						if (!(ID==admin)) {
//							System.out.println("없는 계정입니다.");
//							
//						}
		//선생님 풀이				
						Scanner scan = new Scanner(System.in);
						String id = "";
						String pw = "";
						
						System.out.println("아이디를 입력하세요 >");
						id = scanner.nextLine();
						System.out.println("입력한 아이디 :"+id);
						
						System.out.println("비밀번호를 입력하세요 >");
						pw = scanner.nextLine();
						System.out.println("입력한 비빌번호 :"+pw);
						
						if(!id.equals("admin")) {
							System.out.println("로그인 성공");
						}
						//있는계정
						else if (pw.equals("1234") ) {
							System.out.println("비밀번호 틀림");
						}
						
						
						
						
						
				//2. 숫자 하나를 입력받아서
						//3의배수 그리고 짝수 여부를 동시판별
						//3의배수, 짜수, 3의 배수이면서 짝수, 둘다 아닌경우 -이 4가지 경우를 조건식으로 만들어라
//						int num = 6;
//						If (num %3==0) {
//							System.out.println("3의 배수입니다.");
//						}
//						If (num %2==0) {
//								System.out.println("짝수입니다.");
//							
//						}
//						if (num%3==0 && num %2==0) {
//							System.out.println("3의배수이면서 짝수입니다.");
//						} else {
//							System.out.println("둘다 아닙니다.");
						
						int input = scanner.nextInt();
						boolean 삼의배수 = input % 2 == 0;
						boolean 짝수 = input % 2 == 0;
						
						if(삼의배수 && 짝수) {
							
						}
						else if(삼의배수 ) {
							
						}
						else if(짝수) {
							
						}
						else {
							
						}
						
						//비트 마스크 플래그. 써먹으면 좋은 기법
						result = 0;
						result += 삼의배수 ? 1 : 0;
						result += 짝수 ? 2 : 0;
						String str = "";
						switch(result) {
						case 0:
						case 1:
							str += "3의 배수";
						case 2:
							str += "짝수";
						case 3:
							str += "3의 배수 짝수";
					
						}
						
				//3. 월(month)을 입력받아서 계절을 출력
						//예시. 3~5월은 봄
//						System.out.println("계절을 입력하세요 >");
//						Scanner scan = new Scanner(System.in);
//						
//						int month;
//						String weather = "";
//						switch (month) {
//							case12 : case1 :  case2 : weather = "겨울"; break;
//							case3 : case4 :  case5 : weather = "봄"; break;
//							case6 : case7 :  case8 : weather = "여름"; break;
//							case9 : case10 :  case11 : weather = "가을"; break;
						input = scanner.nextInt();
						switch (input) {
						case 3: case 4: case 5:
							System.out.println("봄");
							break;
						}
						switch (input) {
						case 6: case 7: case 8:
							System.out.println("여름");
							break;
						}
						switch (input) {
						case 9: case 10: case 11:
							System.out.println("가을");
							break;
						}
						switch (input) {
						case 12: case 1: case 2:
							System.out.println("겨울");
							break;
						}
						
						boolean ride = true;
						System.out.println(ride ? "탑승가능" :"탑승불가");
						
						System.out.println(ride ? true : false); //불필요한 코드

							
							
						}

}

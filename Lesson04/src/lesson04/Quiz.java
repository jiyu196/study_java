package lesson04;

public class Quiz {
	public static void main(String[] args) {

		
		 //1. 사탕 나눠주기
		int candy = 72;
		int div = candy/6;
		System.out.println("각 사람이 받는 사탕수 =" +div);
		
		//2. 나머지 계산
		int cup = 23;
		int result = 23 % 4;
		System.out.println("남는 컵케이크 개수 =" +result);
		
		//3.입장 조건 확인
		int tall = 148;
		boolean result2 = tall >= 150;
		System.out.println(result2);
		
		
		//4.점수 더하기
		int score = 10;
		score = 10 + 10;
		score += 10;
		//선생님 방법
		//score =  score + 20;
		System.out.println(score);
		
		//5.레벨 변화
		int lev = 3;
		lev++;
		System.out.println("lev :"+lev);
		lev++;
		System.out.println("lev :"+lev);
		lev--;
		System.out.println("lev :"+lev);
		
		//6. 티켓 검사
		boolean hasID = true;
		boolean hasTicket = false;
		boolean canEnter = hasID==true || hasTicket==true;
		System.out.println("canEnter ="+canEnter);
		
		//boolean canEnter = hasID && hasTicket;
		//System.out.println(canEnter);
		
		//7. 평균 점수 구하기
		int sub1 = 80;
		int sub2 = 90;
		int sub3 = 70;
		int avg = (80+90+70)/3;
		
		System.out.println(avg);
		
		//8. 조건 판별식  ..?
		//(1)
		int age = 21;
		boolean Okay = age>=20;
		System.out.println("age ="+Okay);
		
		boolean isRegistered = true;
		System.out.println("isRegistered ="+isRegistered);
		//(2)
		int age1 = 21;
		boolean isRegistered1 = true;
		boolean Okay1 = age1>=20 && isRegistered == true;
		System.out.println("Okay1 ="+Okay1);
		
		//선생님 방법
//		int age1 = 21;
//		boolean isRegistered1 = true;
//		System.out.println(ge1>=20 && isRegistered);
		
		
		//9. 계산 순서 주의
		int num = 10;
		System.out.println(num*3);
		int num2 = num*3;
		System.out.println(num2+5);
		int num3 = num2+5;
		System.out.println(num3/3);
		
		//10. 입장 심사 시스템 구성
		//(1)
		int age2 = 20;
		boolean enter = age2>=18;
		System.out.println("age1="+enter);
		
		boolean hasTicket1= true;
		boolean isVIP= false;
		boolean enter1 = hasTicket1 == true && isVIP == false;
		System.out.println("enter1 ="+enter1);
		
		//(2)
		int age3 = 20;
		boolean hasTicket2= true;
		boolean isVIP2= false;
		boolean enter2 = age2>=18 && hasTicket2 == true && isVIP2 == false;
//		enter2 = age2>=18 && hasTicket2 && !isVIP;  선생님이 쓴거
		System.out.println("enter2 ="+enter2);
		
		
		
		
		
		
		
		

		
	}
}

package lesson06;

import java.util.Iterator;

public class Ex250411 {

	public static void main(String[] args) {
		//187000원 >> 배열사용
		//1. 50000,10000,5000,1000 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		int[]units = {50000,10000,5000,1000};
		int[]count = new int[units.length];
		//이하 코드 작성 후 갯수 출력
		
		//2. 임의의 문자열 생성 , CAPTCHA(캡차)생성 -String,랜덤값쓰기
		//문자열의 범위는 숫자, 영대, 영소 10글자가 나와야함
		
		
		//3. 배열에 임의값 채우기 -랜덤값 쓰기 >>배열사용
		//100개의 공간을 가지는 배열(0~9사이의 아무 값)
		//[0,1,1,1,3,2,1,1,3,2,....]
		
		
		//3-2. 빈도수 구하기  >>배열사용
		//배열의 길이는 10.() ->3에서 구했던 랜덤 숫자들 1몇개,2몇개,3몇개 나왔는지 이런거
		
		
		//4. 교재 연습문제 p111~113(총 7문제)
//교재1. 1부터100까지 정수 중 5의 배수 합계 출력
		int sum = 0;	
		
		//for문 이용해서 반복합계 연산 작성
		for (int i = 1; i <=100; i++) {    //1~100까지 정수 받기
			if(i%5==0) {                   //5로 나눈 나머지가 0일때 ->5의배수
				sum += i;	               //i값을 sum변수에 더해서 대입
			}
		}
		System.out.println("5의 배수의 합계는 :"+sum);
		//출력: 5의 배수의 합계는 :1050
		
		
//교재2. 1부터100까지 수 중 짝수와 홀수 합 각각
		int evenSum = 0;
		int oddSum = 0;
		
		//for문을 이용해 반복합계 연산
		for(int i=1 ; i<=100; i++) {  //1~100받기
			if(i%2==0) {              //2로 나눈 나머지가 0일때 ->2의배수이니까 짝수
				evenSum += i;         //i값을 evenSum이라는 변수에 더해서 대입
			}
		}
		for(int i=1 ; i<=100; i++) {  //1~100받기
			if((i%2==0)) {            //!(부정으로)짝수가 아닌 나머지. ->홀수
				oddSum += i;          //i값을 oddSum이라는 변수에 더해서 대입
			}
		}
		System.out.println("짝수의 합계는"+evenSum);
		System.out.println("홀수의 합계는"+oddSum);
		
		//짝수의 합계는 2550
		//홀수의 합계는 2500
		
		
//교재3. 두개 주사위의 두 눈 합이 6이 되는 모든 경우의 수 출력
		for(int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				//코드작성
			}
		}
		
		//출력: (1,5)
		//      (2,4)
		//      (3,3)
		//      (4,2)
	    //      (5,1)
		
//교재4. 이중 for문 이용해 * 출력 (1)
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j<1; j++) {
				System.out.print("*"); // println안바꿔서 한줄 띄워져서 나왔었음. 꼭 print로 써주기
			}
			System.out.println(); 
		}
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		
		
//교재5. 이중 for문 이용해 * 출력 (2)
		System.out.println("=======================================");
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j<1; j++) {
				System.out.print("*****"); // println안바꿔서 한줄 띄워져서 나왔었음. 꼭 print로 써주기
			}
			System.out.println(); 
		}
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
		
//교재6. 이중 for문 이용해 * 출력 (3)
		System.out.println("=======================================");
		for (int i = 0; i < 1; i++) {
			for(int j = 0; j<1; j++) {
				System.out.print("    *    "); // println안바꿔서 한줄 띄워져서 나왔었음. 꼭 print로 써주기
			}
			System.out.println(); 
		}
		System.out.println("   ***   ");  //스페이스바로 간격 맞춰서 띄움
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
		
//교재7. 주사위 눈이 6나올때까지 계속반복. 눈이 6되면 지금까지 주사위 굴린횟수까지 출력 >>while문으로 반복, 주사위는Math.random()으로
//실행결과 -> (3)
//            (6)
//            총 주사위 굴린 횟수는: 2회
		
		
		
		
	}
}

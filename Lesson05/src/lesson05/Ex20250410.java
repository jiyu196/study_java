package lesson05;

import java.util.Scanner;

public class Ex20250410 {
	public static void main(String[] args) {
		//1. 상자 갯수 세기
		//사과를 한 상자당 10개씩 담을 수 있습니다.
		//사과의 갯수를 123개라고 했을 때 필요한 상자의 갯수 구하기 -상자는 13개 필요.
		//연산자만 사용
//		int apple = 123;
//		int inbox = 10;
//		int box = (apple/inbox);
//		
//		
//		System.out.println(box);  //이렇게하면 12개나옴. 증감연산이용?
		
//		
		
//		int apple % inbox --사과가 3개남음
//		boolean finalbox = box < inbox;  
//		System.out.println(finalbox);
//		int a = 1;
//		a++;
//		
//		System.out.println(finalbox);
		
//		
		
		//올림처리방법 -문제의미- 이 숫자를 올림처리해라
		int apple = 123;
		int box = 10;
		System.out.println((apple + 9/ box));
		
		//2. 합계 구하기
		//1 + (-2) +3 (-4) ..(-98) + 99 + (-100)
		//반복문 사용
		//100 합계 구하기
		//홀수끼리=2500, 짝수 -(2550)
		
		//홀수,짝수(-붙여서) 더하기 ? if써서? 
		//100까지 중 홀수만 더하고 -짝수만 더해라?
		int sum = 0;
		for (int i=1; i<=100; i++) {
//			if(i%2 ==0) {
//			else {
//				sum += i;
			sum+= i % 2 ==0 ? -i : i;
			System.out.println(sum);
			
			}
		}
		
		
		
		
		//3. 소수판정 (prime number) --수학적으로 소수처리할때는 1을 무시함  
		//지정된 자연수가 소수인지 아닌지를 출력 ->약수문제랑비슷 1,4는 prime number 하나 정하고 소수인지 아닌지
		//반복문 사용
		Scanner scanner = new Scanner(System.in); 
		System.out.println("숫자 입력");
		int input = scanner.nextInt();
		
		int num = 12;
		int count =0;
		for(int i = 2; i <= num ; i++) {
			System.out.println("%d : %d >> %s", i,num % i, num % i == 0 ? "약수" : "약수아님");num % i
			if(num % i == 0) {
				count++;
			}
		}
		System.out.println(count == 0 ? "소수" : "소수아님");
		//약수문제
//		Scanner scanner = new Scanner(System.in); 
//		System.out.println("숫자입력");
//		int input = scanner.nextInt();
//		//양의 정수에 이하인 숫자 중에서 입력받은 숫자를 그것보다 작은 숫자들로 나눴을 때 나머지가 없는
//		//모두
//		int i =1;
//		while(i<=input) {
//			if(input % i == 0) {
//				System.out.println(i);
//			}
//			i++; 
			}
		}
	


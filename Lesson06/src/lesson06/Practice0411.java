package lesson06;

public class Practice0411 {

	public static void main(String[] args) {
		//4. 교재 연습문제 p111~113(총 7문제)
		//교재1. 1부터100까지 정수 중 5의 배수 합계 출력
				int sum = 0;		
				//for문 이용해서 반복합계 연산 작성
				for (int i = 1; i <=100; i++) {  //1~100까지 정수 받기
					if(i%5==0) {                 //5로 나눈 나머지가 0일때 ->5의배수
						sum += i;	             //i값을 sum변수에 더해서 대입
					}
				}
				System.out.println("5의 배수의 합계는 :"+sum);
				
				
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
							if((i%2==0)) {            //!(부정으로)짝수가 아닌 나머지 ->홀수
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
								System.out.println(x+y);
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
	}
}

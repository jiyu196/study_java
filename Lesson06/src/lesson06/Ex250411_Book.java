package lesson06;

public class Ex250411_Book {
	public static void main(String[] args) {

		//4. 교재 연습문제 p111~113(총 7문제)
		//교재1. 1부터100까지 정수 중 5의 배수 합계 출력
				int sum = 0;	
				
				//for문 이용해서 반복합계 연산 작성
				for (int i = 1; i <=100; i++) {    //1~100까지 정수 받기
					if(i%5==0) {                   //5로 나눈 나머지가 0일때 ->5의배수
						sum += i;	               //i값을 sum변수에 더해서 대입 --sum = sum+1/sum +=1 같은거
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
					else if(!(i%2==0)) {            //!(부정으로)짝수가 아닌 나머지 ->홀수
						oddSum += i;          //i값을 oddSum이라는 변수에 더해서 대입.  굳이 else if안하고 else만 써도 됨
					}
					
				}
				System.out.println("짝수의 합계는"+evenSum);
				System.out.println("홀수의 합계는"+oddSum);
				
				//짝수의 합계는 2550
				//홀수의 합계는 2500
				
				
		//교재3. 두개 주사위의 두 눈 합이 6이 되는 모든 경우의 수 출력
				for(int x=1; x<=6; x++) {
					for(int y=1; y<=6; y++) {
						if(x+y == 6) {
							System.out.println("(" +x + "," + y + ")");  //printf로도 쓸 수 있음
						}
					}
				}
				
				//출력: (1,5)
				//      (2,4)
				//      (3,3)
				//      (4,2)
			    //      (5,1)
				
		//교재4. 이중 for문 이용해 * 출력 (1)
				for (int i = 0; i < 5; i++) {
					for(int j = 0; j<5; j++) {
						if(j >= i) {
						System.out.printf("(%d,%d)", i,j); // println안바꿔서 한줄 띄워져서 나왔었음. print로 써주기
					}
					else {
						
					System.out.printf("%5c", ' '); 
				}
				
				
				
				
		//교재5. 이중 for문 이용해 * 출력 (2)
				System.out.println("=======================================");
				for (int i = 0; i < 5; i++) {
					for(int j = 0; j<5; j++) {
						if(true) {
							System.out.printf("(%d,%d)", i,j);
						}
						else {
							
							System.out.printf("%5c", ' '); 
						}
					}
					System.out.println();
				}
				
				
		//교재6. 이중 for문 이용해 * 출력 (3)
				System.out.println("=======================================");
				for(int i = -2; i < 3; i++) {
					for(int j =-2; j < 3; j++) {
						if(i*j < 2 && i * j > -2) {
							System.out.printf("(%2d,%2d)", i,j);
						}
						else {
							System.out.printf("%7c", ' ');
						}
					}
					System.out.println();
				}
				
				

				
				
		//교재7. 주사위 눈이 6나올때까지 계속반복. 눈이 6되면 지금까지 주사위 굴린횟수까지 출력 >>while문으로 반복, 주사위는Math.random()으로
		//실행결과 -> (3)
//		            (6)
//		            총 주사위 굴린 횟수는: 2회
				int count = 0; 
				int dice = 0;
			
				while (dice!= 6) {
					dice = (int)(Math.random()*6+1); //1~6
					count++;
					System.out.printf("%d\n", dice);    
					
				}
					                      
					System.out.println("총 주사위 굴린 횟수는: "+count+"회"); //
				
				
				
					}
				}
	}
}

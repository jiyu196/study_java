package lesson05;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		int sum =0;
		
		for (int i=1; i<=100/3; i++) {
			sum += i*3;
			System.out.printf("i:%3d, sum : %4d\n", i,sum);
			
		
		}
		System.out.println(sum);
		
		//양의 정수 하나 입력받기
		//12 -> 1,2,3,4,6,12
		// 그 정수의 약수들을 출력받기
		//8 ->
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("숫자입력");
		int input = scanner.nextInt();
		//양의 정수에 이하인 숫자 중에서 입력받은 숫자를 그것보다 작은 숫자들로 나눴을 때 나머지가 없는
		//모두
		int i =1;
		while(i<=input) {
			if(input % i == 0) {
				System.out.println(i);
			}
			i++; 
		}
		
		
			
	}
}


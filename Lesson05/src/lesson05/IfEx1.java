package lesson05;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		//shift+enter - 중간에 커서 있을 때 다음줄로 이동가능
		//syso 해서 입력후 tap누르면 바로 문장 끝으로 갈 수 있음
		
		//콘솔을 통한 값 입력
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("시험점수입력 >");
		int score = scanner.nextInt();
	
		System.out.println("시험시작");
		if (score >= 60) 
		{
			System.out.println("합격입니다.");
		} 
		else 
		{
			System.out.println("불합격입니다.");
		}
		System.out.println("시험 끝");
		
	}
}

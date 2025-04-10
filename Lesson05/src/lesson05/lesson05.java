package lesson05;

import java.util.Scanner;

public class lesson05 {
	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요 >");
		Scanner scanner = new Scanner(System.in);
		int me = scanner.nextInt();
		System.out.println(me);
		
		int com = (int)(Math.random()* 3 + 1); //0이상 1미민의 값 > 0이상 3미만 > 1이상 4미만 > 정수화
		System.out.println(com);
		
		System.out.println(me - com);
		//switch를 활용해 승리, 패배, 무승부 출력
		
		String[] values = {"가위","바위","보"};
		System.out.println("내가 낸것 : "+ values[me-1] + ", 컴퓨터가 낸것 : " + values[com-1]);
		
		String result = "";
		switch(me - com) {
			case -2 :
				result = "승리";
				System.out.println("결과 :승리");
				break;
			case -1 :
				result = "패배";
				System.out.println("결과 :패배");
				break;
			case 0 :
				result = "비김";
				System.out.println("결과 :비김");
				break;
			case 1 :
				result = "승리";
				System.out.println("결과 :승리");
				break;
			case 2 :
				result = "패배";
				System.out.println("결과 :패배");
				break;
				
			 
		}
				
		//switch를 활용해 승리, 패배, 무승부 출력 *3하고 몫만 +1
		//0.0  *3->  0.0      주사위 경우 *6   0.0
		//0.1  *3->  0.3                  *6   0.6
		//0.2  *3->  0.6                  *6   1.2
		//0.9  *3->  0.9                  *6   1.8
		//0.3  *3->  1.2                  *6   2.4
		//0.4  *3->  1.5                  *6   3.0
		//0.5  *3->  1.8                  *6   3.6
		
		//0.6  *3->  2.1                  *6   4.2
		//0.7  *3->  2.4                  *6   4.8
		//0.8  *3->  2.7                  *6   5.4
		
		
	
		
	}
}

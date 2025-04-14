package lesson06;

import java.util.Arrays;

public class Ex250411_2 {
	public static void main(String[] args) {
		//187000원 >> 배열사용
				//1. 50000,10000,5000,1000 돈 단위를 이용해, 사용된 지폐의 갯수 계산
//				int[]units = {50000,10000,5000,1000};
//				int[]count = new int[units.length];
//				//이하 코드 작성 후 갯수 출력
//				for (int i = 0; i<units.length; i++) {
//					System.out.println(units[i]);
//				}
//				
				int money = 187000;  
				int[]units = {50000,10000,5000,1000};
				int[]count = new int[units.length];
//				count[0] = money / units[0]; //3=187000/50000
//				money %=units[0]; //187000=>37000
				
				for(int i = 0; i < units.length; i++) {
					count[i] = money/ units[i];
					money %= units[i];
					System.out.printf("%d원 %d장\n", units[i],count[i]);
				}
				
				
////				for (int i = 0; i<units.length; i++) {
////					System.out.println("오만원은"+187000/units[0]+"장");
////					System.out.println("만원은"+187000%units[0]/units[1]+"장");
////					System.out.println("오천원은"+187000%units[0]%units[1]/units[2]+"장");
////					System.out.println("천원은"+187000%units[0]%units[1]%units[2]/units[3]+"장");      //...ㅎㅎ..
////					break;
//				}
				
				
				
				//2. 임의의 문자열 생성 , CAPTCHA(캡차)생성 -String,랜덤값쓰기
				//문자열의 범위는 숫자, 영대, 영소 10글자가 나와야함
//				String[] captcha = new String[10]; //10개의 문자열 저장할 수 있는 배열 생성
//				String Alph = "";
//				String alph = "";  //랜덤으로 문자 나오게? 랜덤값3번 연속으로 써서 숫자,영대,영소 나오게하기..
//				String numb = "";
				
				//(1) 문자열 랜덤 생성 for문사용?  1-9까지, a-z까지, A-Z까지
				//(2) for (String i=0; i<10; i++) {
				//num[i]= (String)(Math.random()*10) ??
				//(3) 임의의 문자열 생성후 줄바꿈 없이 출력
//				}
				String captcha = "";  //char타입으로 바꿔서 할 수도 있음. ==>사진찍어놓음
				//난수의 범위 0~6     //숫자는 깨질 수 있음. 문자로서의 숫자는 0부터9까지만 나옴..? 뭐라고 말하시긴했는데
				//0~9그대로 숫자
				//10~35까지는 영대
				//36이상은 영소
				for(int i = 0; i < 10; i++) {
					int ch = (int)(Math.random()*62);
					if(ch < 10) { //ch가 10보다 작으면 숫자
						captcha += ch;
					}
					else if(ch < 36) {
						captcha +=(char)(ch + 'A' - 10);
					}
					else { //영소 36 97
						captcha +=(char)(ch + 'A' - 10);
					}
				}
				System.out.println(captcha);
				
				
				
				//3. 배열에 임의값 채우기 -랜덤값 쓰기 >>배열사용
				//100개의 공간을 가지는 배열(0~9사이의 아무 값)
				//[0,1,1,1,3,2,1,1,3,2,....]
//				int[] num = new int [100];
//				
//				for (int i=0; i<100; i++) {   //0~10까지 랜덤값
//					num[i]= (int)(Math.random()*10);
//					System.out.print(num[i]);
//				}
//				for(int i=0; i<num.length; i++) { //10개 배열생성 
//					coun[num[i]] += 1;  //coun[num[i]]++; 같은거
//					System.out.println(i + "은(는)"+coun[num[i]] +"개"); //ex) 0은2개 이런식으로
//				}
//				
//				for (int i=0; i<100; i++) {   //0~10까지 랜덤값
//					num[i]= (int)(Math.random()*10);
//					System.out.println(num[i]);
//				}
				
				//3-2. 빈도수 구하기  >>배열사용
				//배열의 길이는 10.() ->3에서 구했던 랜덤 숫자들 1몇개,2몇개,3몇개 나왔는지 이런거
		
			
				
				int[] arr = new int[100];
				for(int i = 0; i < arr.length; i++) {
					arr[i] = (int)(Math.random() *10);
				}
				System.out.println(Arrays.toString(arr));
				
				int[]counts = new int[10];
//				counts[arr[0]]++;
//				counts[arr[1]]++;
//				for(int i = 0 ; i < arr.length ; i++) {
//					counts[arr[i]]++;
				}
	
				System.out.println(Arrays.toString(counts));
	}
}

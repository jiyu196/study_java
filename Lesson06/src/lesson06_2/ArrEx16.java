package lesson06_2;

import java.util.Arrays;

public class ArrEx16 {

	public static void main(String[] args) {
		int[] arrInt = {1,2,3,4,5};
		//index for
		//배열 내부의 값을 변경 가능
		for(int i = 0 ; i < arrInt.length ; i++) {  //여기서 i는 인덱스
			arrInt[i] = arrInt.length - arrInt[i];
			System.out.println(arrInt[i]);
		}
		System.out.println(Arrays.toString(arrInt));
		//향상된 for(Enhanced for)
		//값 변경 불가
		for(int number : arrInt) {  //number는 값. 변경불가.
			number = 10;
			System.out.println(number);
		}
		System.out.println(Arrays.toString(arrInt));
		
		int[][] arr = {{1,2,3}, {4,5}};
		for(int i = 0; i <arr.length ; i++) {
			for(int j = 0; j <arr.length ; j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		for(int[] tmp: arr) { 
			for(int n : tmp) {
				System.out.println(n);
			}
		}
		
//		String name  = "1234";
//		String n = new String("1234"); //이렇게도 쓸 수 있음
		
		int age = 30;
		String name = "1234";
		String name2 = "1234";
		String n = new String("1234");
		System.out.println("===========================");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(n);
		System.out.println(name == name2);  //두 주소를 비교해서 true,flase 나타냄
		System.out.println(name == n);
		
		System.out.println(n.intern() == name.intern());
		System.out.println(n.equals(name));//같은 문자열일때만
		
	}
}

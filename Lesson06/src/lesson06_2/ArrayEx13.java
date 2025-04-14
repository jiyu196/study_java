package lesson06_2;

import java.util.Arrays;

public class ArrayEx13 {

	public static void main(String[] args) {
		//초기의 배열
		//5개의 int배열 생성
		int[] arr = {10,20,30,40,50};
		
		//기존 배열의 두배의 길이를 가지는 배열을 생성
		int[] tmp = new int[arr.length*2]; //길이가 10개짜리가됨[0,0,0,0 ....0,0]
		
		//배열 내부의 값 복사
//		for(int i = 0 ; i < arr.length ; i++) {
//			tmp[i] = arr[i];
//		}
		System.arraycopy(arr, 1, tmp, 2, 3);  
		//15째줄 for문 대체.  arr->원본. 주소입력/ 0 ->몇번인덱스부터 복사할 것인가/tmp->복사할 대상/length-몇개복사할건지
		
		//배열 내부의 값 복사
		arr = tmp;
		System.out.println(Arrays.toString(arr));
		
		//for문을 이용한 복사, araycopy를 이용한 복사될 대상을 미리 생성
		// copyof는 미리 생성안해도됨

		int[] arr2 = Arrays.copyOf(arr, 20);  //20,30,40이렇게 복사하는데 20개를 하겠다고
		System.out.println(Arrays.toString(arr2));
		
		int[] result = {1,2,3};
		result = Arrays.copyOf(result, result.length*2);
		
		System.out.println(Arrays.toString(result));
	}
}

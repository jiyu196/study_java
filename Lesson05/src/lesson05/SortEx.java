package lesson05;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		//정렬
		//버블정렬  . 오름차순. 1,2,3,4,5
		
		//{3,4,1,5,2}
		
		//1회차
		//{3,4,1,5,2}
		//{3,1,4,5,2}
		//{3,1,4,5,2}
		//{3,1,4,2,5}  바뀌지 않더라도 적어야함.
		
		//2회차
		//{1,3,4,2,5}
		//{1,3,4,2,5}
		//{1,3,2,4,5} --확정남. 1회차에서 5도 확저났기 때문에 비교할 필요없음
		
		//3회차
		//{1,3,2,4,5}
		//{1,2,3,4,5}
		
		//4회차
		//{1,2,3,4,5}  물어보고 맞다면 확정짓는다
		
		//순서 정렬시키는거
		
		int[]arr = {5,4,3,2,1};
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			System.out.println(i + 1 + "회차");
			for(int j = 0 ; j < arr.length - 1 -i ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
//		int[]arr2 = {5,4,3,2,1};
//		Arrays.sort(arr2, (a,b) -> b - a);;	
//		System.out.println(Arrays.toString(arr2));   나중에 배울 람다식그런
	}
}

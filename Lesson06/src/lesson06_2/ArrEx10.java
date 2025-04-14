package lesson06_2;

public class ArrEx10 {

	public static void main(String[] args) {
		//int 2차원배열은 1차원으로, 3차원배열은 2차원으로 이루어져있음
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};  //{1,2,3}은 arr의 0번째 인덱스
		
	System.out.println(arr[1][0]);
	
	String[][][] strs = { {}, {{"A","b","c"},{"가","나","다"}}, {{"0","1"}} };
	//strs.length
	//{}
	//{ {"A","b","c"},{"가","나","다"}}
	//{ {"0","1"} }
	
	System.out.println(strs.length);
	System.out.println(strs[1].length); //String 2차원배열
	System.out.println(strs[1][1].length); //String 1차원배열
	System.out.println(strs[1][1][1]); //String 타입
	//2차원 배열은 int1차원 배열로 이루어져있음
	}
}

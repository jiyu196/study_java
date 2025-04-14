package lesson07;

import java.util.Arrays;

public class MenberMain2 {
	public static void main(String[] args) {
		Member[] members = new Member[3];  //배열초기화
		System.out.println(Arrays.toString(members));
		members[0] = new Member(); //member 타입 초기화
		System.out.println(Arrays.toString(members));
		members[0].num = 1;
		members[0].name = "김윤석";
		members[0].age = 27;
	}
	
}

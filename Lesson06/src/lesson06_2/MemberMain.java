package lesson06_2;

import lesson07.Member;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		m.num = 1;
		m.name = "전상현";
		m.age = 28;
		
		Member m2 = new Member();    //배열은 타입고정 단점. 다양한 타입으로 저장하고싶을때 class씀
		m2.num =2;
		m2.name = "김지유";
		m2.age = 22;
		
		m2 =m;
		m2.age = 30;
		m.num =3;
		
		System.out.println(m.num);
		System.out.println(m.name);
		System.out.println(m.age);
		
		System.out.println(m2.num);
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		if (m == m2) {
			System.out.println("m객체와 m2객체는 같다.");	
		} 
		else {
			System.out.println("m객체와 m2객체는 같지않다.");
		}
	}
}

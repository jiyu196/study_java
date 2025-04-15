package lesson07;

public class MemberMaiin {

	public static void main(String[] args) {
		//this 미래에 생성될 객체의 주소값. 일단 이름이 필요하니까 this로
		Member m = new Member(20);  //new연산자 먼저 해결.
		System.out.println(m.num);
		System.out.println(m);
		Member member = m.m1();
		System.out.println(member);
		m.m2(m);
	}
}
class Member{
	int num = 10; //인스턴스 필드
	Member(int num) {
		this.num = num;  //생성자 생성
	}
	Member m1() {    //메소드. member은 반환타입인데 내 클래스명이랑 같음. return 타입은 출력
		return this;
	}
	void m2(Member m) { //여기 member가 내
		System.out.println(m);
	}
	
}

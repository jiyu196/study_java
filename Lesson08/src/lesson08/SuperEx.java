package lesson08;

public class SuperEx {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//		new Child().print(); 
		Child child = new Child();
		child.print();
//		Child.class.newInstance();
	}
}
class Parent {
	int number = 3;  // 조상님 넘버
	Parent(int i) {  // 생성자. parent(int i0\)라고는 안디
		super();  // 이거 클릯하면 object class로 가는데 object class는 모든 클래스의 최고 조상
		System.out.println("부모 객체 생성");
	}
	
}
class Child extends Parent {
	int number = 2;  // 내 넘버
	Child() {  //생성자
		super(); //생성자 첫줄에 아무것도 없으면 얘를 추가함
		System.out.println("자식 객체 생성");
		
	}
	void print ( ) {
		int number = 1; // 지역 넘버
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}

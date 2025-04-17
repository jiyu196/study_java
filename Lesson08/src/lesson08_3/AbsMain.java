package lesson08_3;

public class AbsMain {
	public static void main(String[] args) {
		
	}
}

abstract class Parent {
	abstract void m();
}
abstract class Child extends Parent {  //나도 추상클래스이면 됨. 아니면 구현을 하거나
	
}
abstract class GrandChild extends Child {  //이건 구현을 한거
	void m() {
		
	}
}
class GrandGrandChild extends GrandChild {  //에러가 안남. 조상이 안하면 내가해야함.
	
}
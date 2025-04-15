package lesson07;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		Student stu = new Student("홍길동",4, "소프트웨어공학"); //문자열, 인트,문자열 적은 순서대로 적기
		
	System.out.println(stu.name);            
	System.out.println(stu.grade);
	System.out.println(stu.department);
	
	}
}

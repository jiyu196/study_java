package lesson07;

public class Student {

		String name;
		int grade;
		String department;      //필드가 3개. String,int,String
		
		Student() {} //같은이름이지만 다른. 매개변수가 다르다. 오버로딩한거임
		
		Student(String n, int g, String d) {   
			name = n;
			grade = g;
			department = d;              //지금까지는 기본생성자 없음
		
	}
}

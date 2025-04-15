package lesson07;

public class Car2 {
	
		String color;
		String company;
		String type;
		
		Car2() { //오버로딩된 다른 생성자 호출할 때 this -this.은 생성자 호출이 아님
			this("white", "기아", "경차");
		}
		Car2(String color, String company, String type) { //얘는 여기서 주소
			this.color = color;
			this.company = company;
			this.type = type;
		}
		Car2(String com, String t) {
			this("white",com ,t);
		}
		Car2(String t) {
			this("white", "기아", t);
			
		}
		public String toString() {
			return color + "-" +company + "-" + type;
		}
		
	
}

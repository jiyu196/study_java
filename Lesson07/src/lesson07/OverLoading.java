package lesson07;

public class OverLoading {
	public static void main(String[] args) {
		Operator op = new Operator();
		
		System.out.println(op.multiply(4,3));
		System.out.println(op.multiply(4.5, 3.5));
		System.out.println(op.multiply(4,3.5));
		System.out.println(op.multiply(4.5,3));
		
	}
}
	class Operator {
		int multiply(int x, int y) {  //int,double x,inty 이런거 매개변수
			System.out.println("(int,int)");  //int x,int y는int a, int b랑 같은거
			return x * y;
		}
		double multiply(double x, double y) {
			System.out.println("(double, doule)");
			return x * y;
		}
		double multiply(int x , double y) {
			System.out.println("(int, doule)");
			return x * y;
		}
		double multiply(double x, int y) {
			System.out.println("(double, int)");
			return x * y;
			
		
//		double multiply(double x, int y)          이건 double, int인게 없으니까 double, double로 됨
//			System.out.println("(int, double)");
//			return x * y;
		}
	}


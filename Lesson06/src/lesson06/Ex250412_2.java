package lesson06;

public class Ex250412_2 {
	public static void main(String[] args) {
		//5의 배수
		int sum = 0;
		for(int i = 1; i <= 100/5; i++) {
			sum += i * 5;
		}
		System.out.println("합계는 "+sum);
	}
}

package loop.quiz;

public class Quiz6 {
	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for (num = 1; num <= 100; num++) {
			sum = sum + num;
			if (sum > 500) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
	}
}

package loop;

public class Ex09 {
	public static void main(String[] args) {
		int sum = 0;
		int i; // 마지막에 i값을 출력하기 위해 외부에 선언

		for (i = 1; i <= 20; i++) { // i가 1부터 20이 될때까지 총 20번 수행함
			sum = sum + i;
			System.out.println("i: " + i + " , sum: " + sum);
			if (sum >= 100) {
				break;
			}
		}
		System.out.println("i: " + i);
		System.out.println("sum: " + sum);
	}
}

package loop.quiz;

public class Quiz7 {
	public static void main(String[] args) {
		
		System.out.println("3단부터 7단까지 출력");
		
		for (int dan = 3; dan <= 7; dan++) {
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + "*" + times + "=" + dan * times);
			}
			System.out.println();
		}
	}
}

package loop.quiz;

public class Quiz8 {
	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 != 0) {
				for (int times = 1; times <= 9; times++) {
					System.out.println(dan + "*" + times + "=" + dan * times);
				}
			}
			System.out.println();
		}
	}
}

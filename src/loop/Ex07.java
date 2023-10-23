package loop;

public class Ex07 {
	public static void main(String[] args) {
		
		//for
		int sum = 0;
		for (int i = 1; i <= 10;  i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		//while
		int i = 1;
		int sum1 = 0;
		while(i <=10) {
			sum1 = sum1 + i;
			i++;
		}
		System.out.println(sum1);
	}
}

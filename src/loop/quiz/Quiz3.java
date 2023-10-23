package loop.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++) {
			System.out.println();
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			
			}
		}
		System.out.println();
		int m = 5;
		for(int i=0;i<m+2;i++) {
			m--;
			for(int j=0;j<m;j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		
	}
}

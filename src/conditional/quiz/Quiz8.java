package conditional.quiz;

import java.util.Scanner;

public class Quiz8 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int value = score/10;
		
		switch(value) {
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		default:
			System.out.println("양");
			break;
		}
		
		
		
		
	}

}

package loop;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		System.out.println("입력할 단을 선택하세용");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int dan = a; dan <= a; dan++) {
			System.out.println("-------");
			for (int times = 1; times <= 9; times++) {
				System.out.println("|"+dan + "*" + times + "=" + dan * times + "|");
			}
			System.out.println("--------");
		}
	}
}
